package me.alexandroff.oca.gupta.arrays;

public class Declaration_Allocation {

    public static void main(String[] args) {

        int[] intArray1;
        int intArray2[];
        //!!! int intArray3[6]; Won't compile. Cannot be allocated without "new"

        int[] intArray3 = new int[6];
        //!!! int[] intArra4 = new int[]; Won't compile. Must be allocated after "new"

        int[] multiArray1[]; // !!! 2D array;
        multiArray1 = new int[2][3];
        int[][] multiArray2 = new int[2][3];
        //int[][] multiArray8 = new int[][]; DOES NOT COMPILE

        int[][] multD = new int[3][]; // OK!!!
        multD[0] = new int[3];
        multD[1] = new int[2];
        multD[2] = new int[5];
        // OR
        int[][] multD1 = {{2, 4, 1}, {6, 8}, {7, 3, 6, 5, 1}};

        /*
        only the size of the first dimension is required to be specified
        at the time of instantiation for an array of more than one dimension
        */
        int[][] twoDim = new int[3][];
        int[][][] threeDim = new int[3][][];
        // int[][] multiArray3 = new int[][3]; Won't compile. Not OK
        // int[][] multiArray4 = new int[5]; Won't compile
        // int[] intArray9 = new int[5.0]; Won't compile. Size can be only "int"
        // double[] doubleArray1 = new double[5.2]; Won't compile. Size can be only "int"
        int[] intArray10 = new int[2 * 5]; // OK!!!
        int[] multiArray5[] = new int[5][10]; // !!! 2D array;
        int[][] array2 = new int[][]{{1, 2, 3}, {}, {1, 2, 3, 4, 5}}; // !!! OK
        int[][] array3 = {{1, 2, 3}, {}, {1, 2, 3, 4, 5}};

        String[] str = {};
        //assigns a valid String[] object of length 0 to str
        int[] ints = {};

        int[] intArr;
        //intArr = {1, 2, 3};
        // Array initializer is NOT allowed in this way

        //!!! You cannot change the number of elements that this array can have.
        //If you want a different size you must create a new array

    }
}

// All the arrays are initialized to contain the default values of their type.
// This means,
// int[] iA = new int[10]; will contain 10 integers with a value of 0.
// Object[] oA = new Object[10]; will contain 10 object references pointing to null.
// boolean[] bA = new boolean[10] will contain 10 booleans of value false.
