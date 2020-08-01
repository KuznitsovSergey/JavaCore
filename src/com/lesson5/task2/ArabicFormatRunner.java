package com.lesson5.task2;

public class ArabicFormatRunner {
    public static void main(String[] args) {
        ArabicFormat numberArabic = new ArabicFormat("XXXL");
        System.out.println(numberArabic.getNumberRomanFormat());
        numberArabic.arabicFormatReverse();

        numberArabic.setNumberRomanFormat("CM");
        System.out.println(numberArabic.getNumberRomanFormat());
        numberArabic.arabicFormatReverse();
    }
}
