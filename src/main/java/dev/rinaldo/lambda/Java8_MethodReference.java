package dev.rinaldo.lambda;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * JAVA 8 - Method Reference
 * 
 * @author RinaldoDev
 */
public class Java8_MethodReference {

  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    
    list.stream()
      .forEach(System.out::println); // method reference
    
    list.stream()
      .forEach((n) -> System.out.println(n)); // sem method reference
    
    // métodos estáticos
    list.stream()
      .map((n) -> multipliquePorDois(n))
      .forEach(System.out::println); 
    
    list.stream()
      .map(Java8_MethodReference::multipliquePorDois)
      .forEach(System.out::println);     
    
    // construtores
    list.stream()
      .map((n) -> new BigDecimal(n))
      .forEach(System.out::println);
    
    list.stream()
      .map(BigDecimal::new)
      .forEach(System.out::println);
    
    // várias instâncias
    list.stream()
      .map((n) -> n.doubleValue())
      .forEach(System.out::println);
    
    list.stream()
      .map(Integer::doubleValue)
      .forEach(System.out::println);   
    
    // única instância
    BigDecimal dois = new BigDecimal(2);
    list.stream()
      .map(BigDecimal::new)
      .map((b) -> dois.multiply(b))
      .forEach(System.out::println);
    
    list.stream()
      .map(BigDecimal::new)
      .map(dois::multiply)
      .forEach(System.out::println);    
  }
  
  private static Integer multipliquePorDois(Integer i) {
    return i * 2;
  }

}

//YouTube:  RinaldoDev
//Twitter:  @rinaldodev
//Facebook: RinaldoDev
//GitHub:   rinaldodev
//LinkedIn: rinaldodev
//Site:     rinaldo.dev