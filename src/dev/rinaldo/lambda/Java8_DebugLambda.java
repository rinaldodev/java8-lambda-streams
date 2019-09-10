package dev.rinaldo.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * JAVA 8 - Debug Lambda
 * 
 * @author RinaldoDev
 */
public class Java8_DebugLambda {

  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(1, 2, 5, 8, 9);
    
    list.stream()
      .peek(n -> System.out.println(n + "Se inscreva!"))
      .filter(n -> n % 2 == 0)
      .peek(n -> System.out.println(n + "Comente!"))
//      .filter(n -> n % 2 == 0)
//      .filter(n -> n % 2 == 0)
//      .map(..)
      .forEach(System.out::println);
    
  }

  private static StringBuilder converteParaStringBuilder(Integer n) {
    StringBuilder builder = new StringBuilder();
    builder.append(n);
    builder.append("s");
    builder.append("a");
    return builder;
  }

}

//YouTube:  RinaldoDev
//Twitter:  @rinaldodev
//Facebook: RinaldoDev
//GitHub:   rinaldodev
//LinkedIn: rinaldodev
//Site:     rinaldo.dev