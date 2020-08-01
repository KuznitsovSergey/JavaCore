package com.lesson5.task1;

/**
 * 1. Проверить, является ли введённая строка палиндромом, т.е. читается
 * одинаково в обоих направлениях
 */
public class Palindrome {

    private final String stringPalindrome;

    public Palindrome(String stringPalindrome) {
        this.stringPalindrome = stringPalindrome;
    }

    public String reversPalindrome() {
        return new StringBuffer(stringPalindrome).reverse().toString();
    }

    public boolean equalsPalindrome() {
        return reversPalindrome().equalsIgnoreCase(stringPalindrome);
    }

    public String getStringPalindrome() {
        return stringPalindrome;
    }

}
