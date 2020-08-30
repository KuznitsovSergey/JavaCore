package com.lesson7;

public class Pair<P,T> {
    private final P p;
    private final T t;

    public Pair(P p, T t) {
        this.p = p;
        this.t = t;
    }

    public P getP() {
        return p;
    }

    public T getT() {
        return t;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "p=" + p +
                ", t=" + t +
                '}';
    }
}
