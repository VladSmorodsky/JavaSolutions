package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double[] arrayList = new double[5];
        //array filling
        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < arrayList.length; index++){
            double i = scanner.nextDouble();
            arrayList[index] = i;
        }
        double[] arL = {10.0,20.0,30.0,40.0,50.0};
        Vector v = new Vector(arrayList);

        //get value one element from array
        System.out.println("val:" + v.getValue(3));

        //set value one element from array
        v.setValue(3,56);
        System.out.println(v.getValue(3));

        //get all array`s elements
        v.setFillVector(arL);
        System.out.println(v.getValue(3));

    }
}
