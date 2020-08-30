package com.lessonList.Task1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *Написать метод markLength4, принимающий в качестве
 * параметра список (List) строк и размещающий строку &quot;****&quot;
 * перед каждым четырёхсимвольным элементом.
 * Оригинальные элементы должны остаться на месте.
 *           Например:
 * {&quot;this&quot;, &quot;is&quot;, &quot;lots&quot;, &quot;of&quot;, &quot;fun&quot;, &quot;for&quot;, &quot;every&quot;, &quot;Java&quot;, &quot;programmer&quot;}
 * -&gt;
 * {&quot;****&quot;, &quot;this&quot;, &quot;is&quot;, &quot;****&quot;, &quot;lots&quot;, &quot;of&quot;, &quot;fun&quot;, &quot;for&quot;, &quot;every&quot;, &quot;****&quot;,
 * &quot;Java&quot;, &quot;programmer&quot;}
 */
public class MarkLength4Run {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("dfsvsd");
        list.add("lfdsfje");
        list.add("sdfsdfsdf");
        list.add("1111");
        list.add("2222");

        System.out.println(listMassive(list));
        System.out.println(markLength4(list));
    }

    private static String listMassive(ArrayList<String> list) {
        Object[] arr = list.toArray();
        return Arrays.toString(arr);
    }

    private static ArrayList<String> markLength4(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == 4) {
                list.add(i, "****");
                i++;
            }
        }
        return list;
    }
}
