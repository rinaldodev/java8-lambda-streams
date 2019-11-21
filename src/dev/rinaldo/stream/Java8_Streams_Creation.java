package dev.rinaldo.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * JAVA 8 - Streams - Criando STREAMS
 * @author rinaldodev
 */
public class Java8_Streams_Creation {

  public static void main(String[] args) throws IOException {

    // Collection
    List<Integer> list = Arrays.asList(1,2,3,4);
    list.stream().forEach(System.out::println);
    
    // Arrays
    Integer[] intArray = new Integer[] {1,2,3,4};
    Arrays.stream(intArray).forEach(System.out::println);
    
    // Stream.of
    Stream
      .of("Se", "inscreva", "no", "canal", "!")
      .forEach(System.out::println);
    
    // IntStream.range
    IntStream.range(15, 20).forEach(System.out::println);
    
    // Stream.iterate
    Stream
      .iterate(5, n -> n * 2)
      .limit(10)
      .forEach(System.out::println);
    
    // BufferedReader - lines
    // streams.txt - 11, 12, 13
    File file = new File("streams.txt");
    FileReader in = new FileReader(file);
    try (BufferedReader br = new BufferedReader(in)) {
      br.lines().forEach(System.out::println);
    }
    
    // Files
    Path p = Paths.get("");
    Files.list(p).forEach(System.out::println);
    
    // Random
    new Random()
      .ints()
      .limit(10)
      .forEach(System.out::println);
    
    // Pattern
    String s = "Deixe um curtir no vídeo!";
    Pattern pa = Pattern.compile(" ");
    pa.splitAsStream(s).forEach(System.out::println);
  }

}

//YouTube:  RinaldoDev
//Twitter:  @rinaldodev
//Facebook: RinaldoDev
//GitHub:   rinaldodev
//LinkedIn: rinaldodev
//Site:     rinaldo.dev