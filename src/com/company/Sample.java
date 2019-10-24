package com.company;

public class Sample {

    int i = 12;
    double d = 4.0;
    String s = "is the best place to learn and practice coding!";

    public void printVariable(){
        System.out.println(i + 4);
        System.out.println(d+4.0);
        System.out.println("HackerRank" + s);
    }

    public static void main(String[] args) {
   Sample sampleOutput = new Sample();
   sampleOutput.printVariable();

    }
}
