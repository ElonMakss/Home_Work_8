package com.geektech.players;

import java.util.Random;

public class CaptainAmerica extends Hero{

    public CaptainAmerica(int health, int damage, String name,
                          EnumSuperAbility superAbility) {
        super(health, damage, name, superAbility);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random rn = new Random();
        int coeff = rn.nextInt(3) + 1;
        for (int i = 0; i < coeff; i++) {
            for (int j = 0; i < heroes.length; i++) {
                if (heroes[i].getName().equals("Captain America")) {
                    if (boss.getHealth() > 0 && heroes[j].getHealth() > 0) {
                        boss.setHealth(boss.getHealth() - heroes[j].getDamage());

                    }
                }
            }
        }
        System.out.println("Captain America нанес урон " + coeff + " раз");
    }
}
