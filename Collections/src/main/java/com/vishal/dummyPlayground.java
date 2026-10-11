package com.vishal;

class Example{
    private int i;
    private int j;
    public  Example(int i, int j){
        this.i=i;
        this.j=j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}

class Example2 extends Example{
    private int k;
    public  Example2(int i, int j, int k){
        super(i,j);
        this.k=k;
    }

    public int getK() {
        return k;
    }
}

public class dummyPlayground{
    public static void main(String[] args){
        Example2 e = new Example2(1,2,3);
        System.out.println("Integers are: "+ e.getI() + ", " + e.getJ() + ", " + e.getK());
    }
}
