package dev.rinaldo.lambda;

import java.util.stream.IntStream;

/**
 * JAVA 8 - Funções Lambda - Tipos
 * 
 * @author RinaldoDev
 */
public class Java8_Lambda_Tipos {

  public static void main(String[] args) {

    // Parênteses
    Runnable runnable = () -> System.out.println("Se inscreva no canal!");
    
    IntStream.range(0, 5)
      .filter((int n) -> n % 2 == 0)
      .reduce((n1, n2) -> n1 + n2)
      .ifPresent(System.out::println);
      
    // Chaves
    IntStream.range(0, 5)
      .filter((int n) -> {
        System.out.println("Se inscreva no canal!");
        return n % 2 == 0;
      })
      .forEach(System.out::println);
    
  }

}

//YouTube:  RinaldoDev
//Twitter:  @rinaldodev
//Facebook: RinaldoDev
//GitHub:   rinaldodev
//LinkedIn: rinaldodev
//Site:     rinaldo.dev