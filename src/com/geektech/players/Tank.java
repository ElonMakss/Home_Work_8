package com.geektech.players;
/*Tank, который имеет увеличенную жизнь
 но слабый удар. Может принимать на себя 1/5 часть урона
 исходящего от босса по другим игрокам.
 */

public class Tank extends Hero {
    public Tank(int health, int damage, String name, EnumSuperAbility superAbility) {
        super(health, damage, name, superAbility);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getName().equals("Tank")){
                heroes[i].setHealth(heroes[i].getHealth() - (boss.getDamage() / 5) * heroes.length - 1);
            } else if (heroes[i].getHealth() > 0){
                heroes[i].setHealth((heroes[i].getHealth()) + (boss.getDamage() / 5));
            }
        }
        System.out.println("Tank принял часть урона");
    }
}
