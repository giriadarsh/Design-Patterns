package designpatterns.structural.flyweight.after;

import designpatterns.structural.flyweight.after.BulletType;

import java.util.HashMap;
import java.util.Map;

public class BulletRegistry {

    private Map<BulletType, Bullet> bullets = new HashMap<BulletType, Bullet>();

    public void registerBullet(BulletType bulletType, Bullet bullet) {
        bullets.put(bulletType, bullet);
    }

    public Bullet getBullet(BulletType bulletType) {
        return bullets.get(bulletType);
    }
}
