package com.lesson5.task2;

/**
 * * 2. Написать программу, преобразующую строку, содержащую число в
 * * римском формате, в число в арабском формате.
 * * Границы чисел: от 1 до 3999. Предусмотреть случай, когда меньший символ
 * * идёт перед большим:
 * * Например CM == 900.
 * * Соответствие:
 * * M 1000            
 * * D 500            
 * * C 100            
 * * L 50
 * * X 10
 * * V 5
 * * I 1
 * Слева направо, если латинский алфавит появляется перед латинским алфавитом,
 * который больше его, вычтите значение, представленное латинским алфавитом.
 */
public class ArabicFormat {
    private String numberRomanFormat;

    public ArabicFormat(String numberRomanFormat) {
        this.numberRomanFormat = numberRomanFormat;
    }

    public void arabicFormatReverse() {
        int[] numberArray = new int[numberRomanFormat.length()];

        for (int i = 0; i < numberRomanFormat.length(); i++) {
            char symbol = numberRomanFormat.charAt(i);
            switch (symbol) {
                case 'I':
                    numberArray[i] = 1;
                    break;
                case 'V':
                    numberArray[i] = 5;
                    break;
                case 'X':
                    numberArray[i] = 10;
                    break;
                case 'L':
                    numberArray[i] = 50;
                    break;
                case 'C':
                    numberArray[i] = 100;
                    break;
                case 'D':
                    numberArray[i] = 500;
                    break;
                case 'M':
                    numberArray[i] = 1000;
                    break;
            }
        }
        calculate(numberArray);
    }

    public void calculate(int[] numberArray) {
        int theNumber = 0;
        for (int n = 0; n < numberArray.length; n++) {
            if (n != numberArray.length - 1 && numberArray[n] < numberArray[n + 1]) {
                numberArray[n + 1] = numberArray[n + 1] - numberArray[n];
                numberArray[n] = 0;
            }
        }
        for (int num : numberArray) {
            theNumber += num;
        }
        System.out.println("number: " + theNumber);
    }

    public String getNumberRomanFormat() {
        return numberRomanFormat;
    }

    public void setNumberRomanFormat(String numberRomanFormat) {
        this.numberRomanFormat = numberRomanFormat;
    }
}
