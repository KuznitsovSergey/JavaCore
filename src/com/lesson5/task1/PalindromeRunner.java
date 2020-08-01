package com.lesson5.task1;

public class PalindromeRunner {
    public static void main(String[] args) {
        Palindrome stringTest = new Palindrome("Asa 3 asa");

        System.out.println(stringTest.getStringPalindrome());
        System.out.println(stringTest.isEqualsPalindrome());

        stringTest.setStringPalindrome("123");
        System.out.println(stringTest.getStringPalindrome());
        System.out.println(stringTest.isEqualsPalindrome());
    }
}
