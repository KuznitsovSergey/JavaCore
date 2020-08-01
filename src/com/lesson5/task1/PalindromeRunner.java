package com.lesson5.task1;

public class PalindromeRunner {
    public static void main(String[] args) {
        Palindrome stringTest = new Palindrome("Asa");

        System.out.println(stringTest.getStringPalindrome());
        System.out.println(stringTest.equalsPalindrome());
    }
}
