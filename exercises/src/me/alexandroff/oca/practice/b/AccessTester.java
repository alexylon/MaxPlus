package me.alexandroff.oca.practice.b;

/*
public class AccessTest {
    int a;
    private int b;
    protected int c;

    public AccessTest() {
    }

    //If extended by a class in another package, this constructor must be 'public'
    //or 'protected'. But if it is 'protected' then ref.var. and 'new object'
    //must NOT be both of type 'AccessTest'

    protected void c() {
    }

    public int d() {
        return 0;
    }
}
 */

import me.alexandroff.oca.practice.a.AccessTest;

// What can be accessed by 'ref'?
public class AccessTester extends AccessTest {

    AccessTester() {

    }

    public static void main(String[] args) {
        AccessTest ref1 = new AccessTest();
        AccessTest ref2 = new AccessTester();
        AccessTester ref3 = new AccessTester();

        /*
        ref1.a; - NO
        ref1.b; - NO
        ref1.c(); - NO as ref1 is not of the type of the derived class
        ref2.c(); - -||-
        System.out.println(ref1.c); -||-
        System.out.println(ref2.c); -||-
        */

        System.out.println(ref3.c);
        ref1.d();
        ref2.d();
        ref3.c(); //!!!
        ref3.d();
    }
}

/*
Constructors and static initializers are not members
and therefore are not inherited.
 */
