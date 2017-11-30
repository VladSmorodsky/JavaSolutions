package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double[] arrayList = new double[5];
        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < arrayList.length; index++){
            double i = scanner.nextDouble();
            arrayList[index] = i;
        }

        Vector v = new Vector(arrayList);

        double val = v.getValue(1); //get value one element from array
        System.out.println("val:" + val);

        v.setValue(2,56); //set value one element from array
        System.out.println(v.getValue(2));

        System.out.println("ArrayList:"+ Arrays.toString(arrayList)); //get all array`s elements
    }
}
