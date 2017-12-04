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

    //watch all Vector`s elements
    public void getValue(){
        for (double item:this.arr){
            System.out.println("Items:"+item);
        }
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

    //Comparing Vectors
    public void compareWith(Vector vector){
        for (int index = 0; index < this.arr.length; index++){
            if (this.arr[index] > vector.getValue(index+1)){
                System.out.println("The "+this.arr[index]+"element from first vector is bigger then "+vector.getValue(index+1)+" from second vector");
            }

            else if (this.arr[index] < vector.getValue(index+1)){
                System.out.println("The "+this.arr[index]+"element from first vector is smaller then "+vector.getValue(index+1)+" from second vector");
            }
            else{
                System.out.println("The "+this.arr[index]+"element from first vector is equal with "+vector.getValue(index+1)+" from second vector");
            }
        }
    }
}
