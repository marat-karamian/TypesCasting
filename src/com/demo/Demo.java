package com.demo;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        B b = new B();
        b.i = 100;

        B b1 = new B();
        b1.i = 200;

        B b2 = new B();
        b2.i = 300;

        list.add(b);
        list.add(b1);
        list.add(b2);

        for (int i=0;i<list.size();i++) {
            System.out.println(((B) list.get(i)).i);
        }

        ArrayList list2 = new ArrayList();
        list2.add(new A());

    }
}
