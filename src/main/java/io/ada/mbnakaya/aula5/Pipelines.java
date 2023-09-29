package io.ada.mbnakaya.aula5;

import java.util.stream.Stream;

public class Pipelines {

    public static void main(String[] args) {
        // Stream de números "aleatórios"
        Stream<Double> numberStream = Stream.generate(Math::random);

        // Filtre os números pares e positivos, ordenando e limitando a 10 elementos e, por fim, imprimindo o resultado
        numberStream.filter(number -> number > 0 && number % 2 == 0).sorted().limit(10).forEach(System.out::println);
    }
}
