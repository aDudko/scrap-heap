package com.javarush.task.task14.task1414;

import java.util.Scanner;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String key;
        while((key = scanner.nextLine()) != null) {
            Movie movie = MovieFactory.getMovie(key);
            if (movie == null) return;
            System.out.println(movie.getClass().getSimpleName());
        }
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            switch (key) {
                case "soapOpera":
                    return new SoapOpera();
                case "cartoon":
                    return new Cartoon();
                case "thriller":
                    return new Thriller();
            }
            return null;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }
}
