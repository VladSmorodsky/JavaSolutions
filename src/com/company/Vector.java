package com.company;

public class Vector {

    private double[] arr;

    Vector(double[] arr){
        this.arr = arr;
    }

    //return array`s element
    public double getValue(int number){
        return arr[number-1];
    }

    // Change array`s element
    public double setValue(int number, double val){
        arr[number-1] = val;
        return arr[number-1];
    }

    // Fill Vector with pointing array`s items
    public double[] setFillVector(double[] arr){
        int index = 0;
        for (double item:arr){
            this.arr[index] = item;
            index++;
        }
        return this.arr;
    }

    //get Vector`s values


}
