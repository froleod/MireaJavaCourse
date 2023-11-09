package ru.mirea.prak24;

import static ru.mirea.prak24.DrinkTypeEnum.*;

public final class Drink extends MenuItem implements Alcoholable {

    private final double alcoholVol;
    private final DrinkTypeEnum type;

    public Drink(double alcoholVol, DrinkTypeEnum type) {
        this.alcoholVol = alcoholVol;
        this.type = type;
    }


    @Override
    public boolean isAlcoholDrink() {
        return type != JUICE && type != COFEE && type != GREEN_TEA && type != BLACK_TEA && type != MILK
                && type != WATER && type != SODA;
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }
}
