package org.example;

import org.apache.commons.logging.impl.WeakHashtable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());

        //distance(0,0)= 7.810249675906654

        //distance(second)= 5.0

        //distance(2,2)= 5.0

        //distance()= 0.0


        Player player1 = new Player("efe" , 100 , Weapon.SWORD);

        System.out.println("oyuncu1 health:" +player1.healthRemaining());
        player1.loseHealth(50);
        System.out.println("oyuncu1 health:"+player1.healthRemaining());
        player1.loseHealth(80);
        System.out.println("oyuncu1 health:"+player1.healthRemaining());
        player1.restoreHealth(200);
        System.out.println("oyuncu1 health:" +player1.healthRemaining());
    }

}
