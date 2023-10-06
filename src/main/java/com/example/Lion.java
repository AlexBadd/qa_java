package com.example;

public class Lion {

    private final boolean hasMane;
    private final Feline feline;

    public Lion(Feline feline, String sex) {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new IllegalArgumentException("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public void getFood() throws Exception {
        feline.getFood("Хищник");
    }
}
