package me.alexandroff.oca.practice;

public class Reptile {
    public String getName() {
        return "Reptile";
    }
}

class Alligator extends Reptile {
    public String getName() {
        return "Alligator";
    }
}

class Crocodile extends Reptile {
    public String getName() {
        return "Crocodile";
    }
}

class ZooWorker {
    public static void feed(Reptile reptile) {
        System.out.println("Feeding: " + reptile.getName());
    }

    public static void main(String[] args) {
        feed(new Alligator());
        feed(new Crocodile());
        feed(new Reptile());
        //feed(new Object()); - NO
    }
}