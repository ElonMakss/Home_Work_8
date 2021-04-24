package com.geektech.players;

import java.util.Random;

public class DrStrendge extends Hero{

    public DrStrendge(int health, int damage, String name, EnumSuperAbility superAbility) {
        super(health, damage, name, superAbility);
    }

    private Random coef = new Random();


    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage() + (coef.nextInt(15) + 1));
            System.out.println("Dr up damage " + heroes[i].getName() + " new damage next round: " + heroes[i].getDamage());
        }
    }
}
