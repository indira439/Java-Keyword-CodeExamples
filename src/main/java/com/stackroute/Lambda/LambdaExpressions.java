package com.stackroute.Lambda;

public class LambdaExpressions {
    public static void main(String[] args) {
        Greeting greet = () -> {
            System.out.println("Hello");
            System.out.println("World");
        };
        greet.wish();

    }
}

interface Greeting {
    void wish();
}


