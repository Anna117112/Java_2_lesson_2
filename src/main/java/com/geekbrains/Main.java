package com.geekbrains;

import java.sql.Array;

public class Main {
    private static String[][] arr = {{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"}};

    public static void main(String[] args) {
        try {
            
            array(arr);

        }
        catch (MyArraySizeException e) {

            e.printStackTrace();

        }

         catch (MyArrayDataException myArrayDataException) {
            myArrayDataException.printStackTrace();
        }


    }


    public static void array (String [][] arr) throws MyArraySizeException, MyArrayDataException{

        System.out.println( "Размер массива " + arr.length + " * " + arr[0].length );
        if (arr.length != 4 ) {
            throw new MyArraySizeException(arr.length,arr[0].length);
        }
        if (arr[0].length!=4){
            throw new MyArraySizeException(arr.length,arr[0].length);

        }

        int count = 0;
        int sum =0;
        int numArr [][] = new int[arr.length][arr[0].length];
        for (int i =0; i < arr.length; i++){
            for (int j = 0; j< arr[0].length; j++){
                try {
                    numArr[i][j] = Integer.parseInt(arr[i][j]);

                    count = numArr[i][j];
                    sum = count + sum;
                }
                catch (NumberFormatException e){
                    throw new MyArrayDataException(i,j, numArr);
                }



            }
        }

        System.out.println("Сумма элементов массива = " + sum);
    }
}
