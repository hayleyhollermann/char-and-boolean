package com.company;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';
        char myUnicodeChar = '\u0044'; // unicode for letter D
        System.out.println("myChar: " + myChar);
        System.out.println("myUnicodeChar: " + myUnicodeChar); // prints D
        char myCopyrightChar = '\u00A9';
        System.out.println("myCopyrightChar: " + myCopyrightChar); // prints copyright symbol

        

    }
}
