package com.vishal;

import java.util.Iterator;

public class GenericList <E>{
    private E[] items;
    private int size;
    public GenericList() {
        items = (E[]) new Object[10];
        size = 0;
    }

}
