package com.geekbrains;

public class MyArraySizeException extends Exception{
    private int number1;
    private int number2;

    public MyArraySizeException(int size1, int size2 ){
        super("Размер массива должен быть 4*4, a у Вас " + size1 +" " + size2);
        this.number1 = size1;
        this.number2 = size2;

    }


    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }
}
