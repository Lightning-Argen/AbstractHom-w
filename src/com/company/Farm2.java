package com.company;

import java.util.Arrays;

public class Farm2 {

    private Sheep[] sheep;
    private Cow[] cows;
    private Horse[] horses;

    public Farm2(String address, String ownerName, Cow[] cows, Horse[] horses, Sheep[] sheep) {

        this.sheep = sheep;
        this.cows = cows;
        this.horses = horses;
    }


    @Override
    public String toString() {
        return "Farm2{" +
                "sheep=" + Arrays.toString(sheep) +
                ", cows=" + Arrays.toString(cows) +
                ", horses=" + Arrays.toString(horses) +
                '}';
    }
}
