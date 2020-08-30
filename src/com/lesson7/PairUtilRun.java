package com.lesson7;

public  class PairUtilRun {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("sfssrdv", 3442);
        System.out.println(pair.toString());
        System.out.println(PairUtil.swap(pair).toString());
    }
}
