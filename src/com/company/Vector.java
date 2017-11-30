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
        return arr[number+1];
    }


}
