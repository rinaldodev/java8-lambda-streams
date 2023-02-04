package dev.rinaldo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * JAVA 8 - Streams Paralelos
 * 
 * @author RinaldoDev
 */
public class Java8_Streams_Paralelos {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,4);
    
    // parallel vs parallelStream
//    list.parallelStream()
//    IntStream.range(0, 5).parallel()
    
    // forEach x forEachOrdered
    list.parallelStream()
      .forEach(System.out::println);
    System.out.println("---");
    list.parallelStream()
      .forEachOrdered(System.out::println);
    
    System.out.println("---");
    
    // findAny
    list.parallelStream()
      .findAny()
      .ifPresent(System.out::println);
    System.out.println("---");
    list.stream()
      .findAny()
      .ifPresent(System.out::println);
    
    System.out.println("---");

    // unordered
    list.parallelStream()
      .unordered()
      .skip(1)
      .limit(2)
      .forEach(System.out::println);
    
    System.out.println("---");
    
    // reduce
    // (1 + 2) + (3 + 4) = 10  - é associativa
    // (1 - 2) - (3 - 4) != -8 - não é associativa
    list.parallelStream()
      .reduce((n1, n2) -> n1 - n2)
      .ifPresent(System.out::println);
    
    System.out.println("---");
    
    // toMap
    Map<Integer, Boolean> collect = 
        list.parallelStream()
       .collect(
           Collectors
           .toConcurrentMap(n -> n, n -> n % 2 == 0)
         );
    System.out.println(collect);
    System.out.println("---");
    
    // groupingBy
    Map<Boolean, List<Integer>> collect2 = 
       list.parallelStream()
         .collect(
           Collectors
           .groupingByConcurrent(n -> n % 2 == 0)
         );
    System.out.println(collect2);    
      
  }
  
}

//YouTube:  RinaldoDev
//Twitter:  @rinaldodev
//Facebook: RinaldoDev
//GitHub:   rinaldodev
//LinkedIn: rinaldodev
//Blog:     rinaldo.dev