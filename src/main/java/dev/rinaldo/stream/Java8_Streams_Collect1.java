package dev.rinaldo.stream;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * JAVA 8 - Streams - Collect <br>
 * Vídeo em: https://www.youtube.com/watch?v=mTbh9d2orcU
 * 
 * @author RinaldoDev
 */
public class Java8_Streams_Collect1 {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,4,5,6);
    
    // fornecedor - acumulação - combinação
    Set<String> collect = list.stream()
      .collect(
          () -> new HashSet<>(), 
          (l, e) -> l.add(e.toString()), 
          (l1, l2) -> l1.addAll(l2)
        );
    
    System.out.println(list);
    System.out.println(collect);
    
    // toList / toSet
    Deque<Integer> collect2 = list.stream()
      .filter((n) -> n % 2 == 0) 
      .collect(Collectors.toCollection(
                  () -> new ArrayDeque<Integer>()
               ));
    System.out.println(collect2);
    
    // joining
    String join = list.stream()
        .map(n -> n.toString())
      .collect(Collectors.joining("f"));
    System.out.println(join);
    
    // averaging
    Double media = list.stream()
      .collect(Collectors.averagingInt(n -> n.intValue()));
    System.out.println(media);
    
    // summing
    Integer soma = list.stream()
        .collect(Collectors.summingInt(n -> n.intValue()));
      System.out.println(soma);
      
    // summarizing
    IntSummaryStatistics stats = list.stream()
        .collect(Collectors.summarizingInt(n -> n.intValue()));
    System.out.println("IntSummaryStatistics: ");
    System.out.println(stats.getAverage());      
    System.out.println(stats.getCount());      
    System.out.println(stats.getMax());      
    System.out.println(stats.getMin());      
    System.out.println(stats.getSum());  
    
    // counting
    Long count = list.stream()
      .filter((n) -> n % 2 == 0) 
      .collect(Collectors.counting());
    System.out.println(count);
    
    // max/min
    list.stream()
      .filter((n) -> n % 2 == 0) 
      .collect(Collectors.minBy(Comparator.naturalOrder()))
      .ifPresent(System.out::println);
    
    // groupingBy
    Map<Integer, List<Integer>> groupingBy = list.stream()
        .collect(Collectors.groupingBy((n) -> n % 3));
    System.out.println(groupingBy);
    
    // partitioningBy
    Map<Boolean, List<Integer>> partitioningBy = list.stream()
        .collect(Collectors.partitioningBy((n) -> n % 2 == 0));
    System.out.println(partitioningBy);
    
    // toMap
    Map<Integer, Double> toMap = list.stream()
        .collect(Collectors.toMap(
              n -> n, 
              n -> Math.pow(n.doubleValue(), 5)
        ));
    System.out.println(toMap);    
  }

}

//YouTube:  RinaldoDev
//Twitter:  @rinaldodev
//Facebook: RinaldoDev
//GitHub:   rinaldodev
//LinkedIn: rinaldodev
//Site:     rinaldo.dev
