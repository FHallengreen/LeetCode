package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream1 {

    public static void main(String[] args) {
/*
        List<String> animals = Arrays.asList("Monkey,Horse,Tiger,Cow,Mouse".split(","));
        List <String> newAnimals = animals.stream().filter(animal -> !animal.equals("Tiger"))
                .map(String::toUpperCase).sorted().toList();
        System.out.println(newAnimals);

        System.out.println("****************");
//        Filters
        IntStream.range(1,26).filter(n -> n%2 == 0).forEach(System.out::println);

        System.out.println("****************");

//        Map
        List<String> names = Arrays.asList("John","Smith","Peter","Ole");
        List<String> newNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(newNames);

        System.out.println("****************");

//        FlatMap
        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("John","Smith"),
                Arrays.asList("Peter","Ole")
        );
        List<String> newNamesNested = namesNested.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(newNamesNested);

        System.out.println("****************");

        // MAP even & uneven

        IntStream.range(1,26).mapToObj(n -> n%2 == 0 ? "even: " + n : "uneven: " +n).forEach(System.out::println);

        System.out.println("****************");

        //reduce
        int sum = IntStream.range(1,26).reduce(0, (a,b) -> a+b);
        System.out.println(sum);

        System.out.println("****************");
*/

        //lazy evaluation
        List<String> animals3 = Arrays.asList("Monkey,Horse,Tiger,Cow,Mouse".split(","));
        animals3.stream().filter(animal -> {
            System.out.println("filter: " + animal);
            return true;
        }).map(animal -> {
            System.out.println("map: " + animal);
            return animal.toUpperCase();
        }).forEach(animal -> System.out.println("forEach: " + animal));

        System.out.println("****************");

        //parallel
        List<String> animals = Arrays.asList("Monkey,Horse,Tiger,Cow,Mouse".split(","));
        animals.parallelStream().forEach(System.out::println);

    }
}
