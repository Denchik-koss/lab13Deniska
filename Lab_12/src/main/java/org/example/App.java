package org.example;

import zad2.Tester;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello Deniska sosiskka");
        Tester test = new Tester("Den");
        test.print();
        test.print(5);
        test.print(true);
        Tester.printchoto();
    }
}
