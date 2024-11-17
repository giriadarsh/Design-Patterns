package designpatterns.structural.flyweight.before;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<Bullet> bullets = new ArrayList<Bullet>();
        for (int i=0; i<2000; ++i){
            Bullet bullet = new Bullet();
            bullets.add(bullet);
        }
    }
}
