package com.geektech.players;

/*Добавить еще игрока Witcher, не наносит урон боссу, но получает урон от босса.
Имеет 1 шанс оживить первого погибшего героя, отдав ему свою жизнь,
 при этом погибает сам.
 */

public class Witcher extends Hero {
    public Witcher(int health, int damage, String name, EnumSuperAbility superAbility) {
        super(health, damage, name, superAbility);
    }

    int witch;

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getName().equals("Witcher")) {
                witch = i;
            }
        }
        if (heroes[witch].getHealth() > 0) {
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHealth() == 0) {
                    heroes[i].setHealth(heroes[witch].getHealth());
                    heroes[witch].setHealth(0);
                    System.out.println("witcher heal " + heroes[i].getName());
                    break;
                }
            }
        }
    }
}