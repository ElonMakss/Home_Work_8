package com.geektech.players;

import java.util.Random;

public class Hulk extends Hero{
    private Random random = new Random();

    public Hulk(int health, int damage, String name, EnumSuperAbility superAbility) {
        super(health, damage, name, superAbility);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int supDam = random.nextInt(boss.getDamage());
        boss.setHealth(boss.getHealth() - supDam);
        System.out.println("Hulk нанес дополнительно: " + supDam);

    }
}
