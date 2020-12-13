package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [][]array = {{11,22,33},{44,66,55}};
        System.out.println("Max in Array is: ");
        System.out.println(findMax(array));
        System.out.println("Min in Array is: ");
        System.out.println(findMin(array));
    }
    public static int findMax(int[][]array){
        int max = array[0][0];
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                if(max <array[i][j]){
                    max = array[i][j];
                }
            }
        }
        return max;
    }
    public static int findMin(int[][]array){
        int min = array[0][0];
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                if(min > array[i][j]){
                    min = array[i][j];
                }
            }
        }
        return min;
    }
}
