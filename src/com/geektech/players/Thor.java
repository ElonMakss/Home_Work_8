package com.geektech.players;

import javax.swing.text.AbstractDocument;
import java.util.Random;

public class Thor extends Hero{
    public Thor(int health, int damage, String name, EnumSuperAbility superAbility) {
        super(health, damage, name, superAbility);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random rnd = new Random();
        int appart = rnd.nextInt(2);
        if (appart == 0){
        }else if(appart == 1){
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHealth() > 0){
                    heroes[i].setHealth(heroes[i].getHealth() + boss.getDamage());
                }
            }
            System.out.println("Boss пропустил раунд");
        }

    }
}
