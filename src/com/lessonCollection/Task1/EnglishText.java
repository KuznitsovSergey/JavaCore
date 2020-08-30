package com.lessonCollection.Task1;

import java.util.*;

/**
 * Задан текст на английском языке. Выделить все различные слова.
 * Для каждого слова подсчитать частоту его встречаемости.
 * Слова, отличающиеся регистром букв, считать различными.
 */
public class EnglishText {
    private final Map<String, Integer> words;

    public EnglishText(String str) {

        List<String> listWords = new ArrayList<>();
        words = new TreeMap<>();
        if (str.length() != 0) {
            listWords.addAll(Arrays.asList(str.split("[^a-zA-Z1-9]+")));
        }
        for (String word : listWords) {
            words.put(word, words.containsKey(word) ? words.get(word) + 1 : 1);
        }
    }

    public Map<String, Integer> getWord() {
        return words;
    }
}
