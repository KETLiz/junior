import java.util.stream.IntStream;

/*
Напишите программу, которая использует Stream API для обработки списка чисел.
Программа должна вывести на экран среднее значение всех четных чисел в списке.
 */
public class Main {
    public static void main(String[] args) {

        IntStream.range(1,10)
                .filter(num -> num%2==0)
                .average()
                .ifPresent(System.out::println);

    }
}