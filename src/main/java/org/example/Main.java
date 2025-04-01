package org.example;

public class Main {
    public static void main(String[] args) {
        Count c1 = new Count();
        Count c2 = new Count();
        Count c3 = new Count();
        c1.incrementInstanceCount();
        c1.incrementTotalCount();
        c2.incrementInstanceCount();
        c2.incrementTotalCount();
        c3.incrementInstanceCount();
        c3.incrementTotalCount();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}