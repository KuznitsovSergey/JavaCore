package com.lesson7;

final class PairUtil {

    static <P, T> Pair swap(Pair<P,T> pair){
        return new Pair(pair.getT(),pair.getP());
    }
}
