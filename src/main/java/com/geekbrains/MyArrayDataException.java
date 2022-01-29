package com.geekbrains;

import java.util.Arrays;

public class MyArrayDataException extends Exception{
    private int index1;
    private  int index2;
    private int array [][];

    public MyArrayDataException(int in1, int in2, int arr[][]){
        super("Нельзя преобразовать в число ячейку массива под номером " + in1 + " * " + in2 );
        this.index1 = in1;
        this.index2 = in2;
        this.array = arr;
    }

    public int[][] getArray() {
        return array;
    }

    public int getIndex1() {
        return index1;
    }

    public void setIndex1(int index1) {
        this.index1 = index1;
    }

    public int getIndex2() {
        return index2;
    }

    public void setIndex2(int index2) {
        this.index2 = index2;
    }

    public void setArray(int[][] array) {
        this.array = array;
    }
}
