package com.sapient.asde.ui;

public class SumAndAverage {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0; i<args.length; i++){
            sum += Integer.parseInt(args[i]);
        }
        double average = (double)sum/ args.length;
        System.out.println(average);
    }
}
