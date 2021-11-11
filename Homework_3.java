/**
*Java1. Homework3
*
*@author Lena
*@version 11.11.2021
*/
import java.util.Arrays;
import java.util.ArrayList;


class Homework_3 {
    
    public static void main(String[] args){
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        
        int len = 5;
        int initValue = 2;
        int[] arr = new int[len];
        arr = returnM(len,initValue);
        printArr(arr, len);
    }
        
        
        public static void invertArray() {
            int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0){
                    arr[i] = 0;
                }
                else {
                    arr[i] = 1;
                }
                System.out.println(arr[i]);
            }
        }
        
        public static void fillArray() {
            int[] arr = new int[100];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i+1;
                System.out.println(arr[i]);
            }
        }
        
        public static void changeArray() {
            int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) {
                   arr[i] = arr[i]*2;
                }
                else {
                    arr[i] = arr[i];
                }
                System.out.println(arr[i]);
            }
        }
        public static void fillDiagonal() {
            int[][] arr = new int[5][5];
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if(i == j) {
                        arr[i][j] = 1;
                        }
                    else {
                        arr[i][j] = 0;                        
                    }
                    System.out.print(arr[i][j]+ " ");
                }
                System.out.println();
            }
        }
        
        public static int[] returnM (int len, int initialValue) {
            int[] arr = new int[len];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = initialValue;
                //System.out.print(arr[i]+ " ");
            }
            return arr;
        }
        
        static void printArr (int[] arr, int len) {
            for (int i = 0; i < len; i++) {
                System.out.print(arr[i] + " ");                
            }
            System.out.println();
        }
}