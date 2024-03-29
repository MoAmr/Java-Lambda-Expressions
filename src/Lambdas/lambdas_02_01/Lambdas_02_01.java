package Lambdas.lambdas_02_01;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Lambdas_02_01 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Mohammed", "Ali", "Sara", "Mariam");
        //way to sort prior to Java 8 lambdas
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        //first iteration with lambda
        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });

        //now remove the return statement
        Collections.sort(names, (String a, String b) -> b.compareTo(a));

        //now remove the data types and allow the compile to infer the type
        Collections.sort(names, (a, b) -> b.compareTo(a));

        //total pages in your book collection
        Book book1 = new Book("Miss Peregrine's Home for Peculiar Children",
                "Ranson", "Riggs", 382);
        Book book2 = new Book("Harry Potter and The Sorcerers Stone",
                "JK", "Rowling", 411);
        Book book3 = new Book("The Cat in the Hat",
                "Dr", "Seuss", 45);

        List<Book> books = Arrays.asList(book1, book2, book3);
        int total = books.stream()
                .collect(Collectors.summingInt(Book::getPages));

        System.out.println(total);

        //create a list with duplicates
        List<Book> dupBooks = Arrays.asList(book1, book2, book3, book1, book2);
        System.out.println("Before removing duplicates: ");
        System.out.println(dupBooks.toString());

        Collection<Book> noDup = new HashSet<>(dupBooks);
        System.out.println("After removing duplicates: ");
        System.out.println(noDup.toString());

        //aggregate author first names into a list
        List<String> list = books.stream()
                .map(Book::getAuthorFName)
                .collect(Collectors.toList());

        System.out.println(list);

        //example of using Set to eliminate dups and sort automatically
        Set<Integer> numbers = new HashSet<>(asList(4, 3, 3, 3, 2, 1, 1, 1));
        System.out.println(numbers.toString());
    }
}
