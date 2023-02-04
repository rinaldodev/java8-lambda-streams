package dev.rinaldo.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * JAVA 8 - Interfaces Funcionais da JDK
 * 
 * @author RinaldoDev
 */
public class Java8_Builtin_Functional_Interfaces {
  
  public static void main(String[] args) {

    Stream.generate(() -> new Random().nextInt()) // supplier
      .limit(5)
      .forEach((e) -> System.out.println(e)); // consumer
    
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    list.stream()
      .filter(e -> e % 2 == 0) // predicate
      .map(e -> e.doubleValue()) // function
      .reduce((e1, e2) -> e1 + e2) // BinaryOperator
      .ifPresent(System.out::println);
    
  }
  
}

//YouTube:  RinaldoDev
//Twitter:  @rinaldodev
//Facebook: RinaldoDev
//GitHub:   rinaldodev
//LinkedIn: rinaldodev
//Site:     rinaldo.dev