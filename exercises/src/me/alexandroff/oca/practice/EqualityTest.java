package me.alexandroff.oca.practice;

public class EqualityTest {
    public static void main(String[] args) {
        byte byteVar = 5; //8 bits
        char charVar = 5; // 16 bits
        short shortVar = 5; // 16 bits

        int intVar = 5; // 32 bits
        final int INTVAR = 5;
        Integer objInt = 5;
        long longVar = 5; // 64 bits

        float floatVar = 5; // 32 bits
        double doubleVar = 5; // 64 bits
        Double objDouble = 5.0; // Does not accept '5'

        String str1 = "5";

        System.out.println(byteVar == doubleVar); // true
        System.out.println(charVar == floatVar); // true
        System.out.println(charVar == INTVAR); // true
        System.out.println(byteVar == objInt); // true - auto-unboxing
        //System.out.println(objInt == objDouble); - Objects of different types cannot use '=='
        //System.out.println(byteVar == str1); - No way
        //System.out.println(byteVar.equals(doubleVar));
        //DOES NOT COMPILE

        String str = null;
        int integ = 0;
        //System.out.println(str == integ);
        //DOES NOT COMPILE

/* Infinite loop. i is always 0
        for (int i = 0; i < 10; ) {
            i = i++;
            System.out.println("Hello World");
        }
        */

        int count = 0;
        ROW_LOOP:
        for (int row = 1; row <= 3; row++)
            for (int col = 1; col <= 2; col++) {
                if (row * col % 2 == 0) continue ROW_LOOP;
                count++;
            }
        System.out.println(count);

        Integer int1 = 500;
        Integer int2 = new Integer(500);
        int int3 = 500;
        System.out.println(int1 == int2); //false
        System.out.println(int1.equals(int2)); // !!! true
        System.out.println(int1.equals(int3)); // !!! true - auto-boxing

        switch(int3){}

    }
}
