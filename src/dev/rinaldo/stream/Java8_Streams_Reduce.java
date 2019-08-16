package dev.rinaldo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

/**
 * JAVA 8 - Streams - Reduce <br>
 * Vídeo em: https://youtu.be/2aHElyENpuM
 * 
 * @author RinaldoDev
 */
public class Java8_Streams_Reduce {

  public static void main(String[] args) {
    String s = "Inscreva-se no canal e compartilhe esse vídeo!";
    String[] split = s.split(" ");
    List<String> listStr = Arrays.asList(split);
    List<Integer> list = Arrays.asList(1,2,3,4,5,6);

    // 1 + 2 + 3 + 4 + 5 + 6
    // reduce - soma
    Optional<Integer> soma = list.stream()
      .reduce((n1, n2) -> n1 + n2);
    
    System.out.println(soma.get());
    
    //reduce - multiplicação
    Optional<Integer> multiplicacao = list.stream()
      .reduce((n1, n2) -> n1 * n2);
    
    System.out.println(multiplicacao.get());
  
    //reduce - concatenação
    Optional<String> concatenacao = listStr.stream()
      .reduce((s1, s2) -> s1.concat(s2));
    
    System.out.println(concatenacao.get());
    
    // 1 - 2 - 3 - 4 - 5 - 6
    // reduce - subtração - NÃO FAÇA
    Optional<Integer> subtracao = list.stream()
      .reduce((n1, n2) -> n1 - n2);
    
    System.out.println(subtracao.get());
    
    
    // reduce - soma
    Integer soma2 = list.stream()
      .reduce(0, (n1, n2) -> n1 + n2);
    
    System.out.println(soma2);
    
    //reduce - multiplicação
    Integer multiplicacao2 = list.stream()
      .reduce(1, (n1, n2) -> n1 * n2);
    
    System.out.println(multiplicacao2);
  
    //reduce - concatenação
    String concatenacao2 = listStr.stream()
      .reduce("", (s1, s2) -> s1.concat(s2));
    
    System.out.println(concatenacao2);    
    
    // reduce - menor valor
    double menorValor = DoubleStream.of(1.5, 2.9, 6.7)
      .reduce(Double.POSITIVE_INFINITY, (d1, d2) -> Math.min(d1, d2));
    System.out.println(menorValor);
    
    
    // reduce - soma
    Integer soma3 = list.stream()
      .reduce(0, (n1, n2) -> n1 + n2, (n1, n2) -> n1 + n2);
    
    System.out.println(soma3);    
    
    // reduce - map + combiner
    String reduce = list.stream()
        .reduce(
            "", 
            (n1, n2) -> n1.toString().concat(n2.toString()), 
            (n1, n2) -> n1.concat(n2)
          );
    System.out.println(reduce);
    
  }

}

//YouTube:  RinaldoDev
//Twitter:  @rinaldodev
//Facebook: RinaldoDev
//GitHub:   rinaldodev
//LinkedIn: rinaldodev
//Blog:     rinaldo.dev
