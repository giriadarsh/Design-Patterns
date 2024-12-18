package designpatterns.structural.flyweight.after;

import designpatterns.structural.flyweight.after.BulletStatus;
import designpatterns.structural.flyweight.after.BulletType;

public class Bullet {
    private double radius ;
    private double weight;
    private BulletType bulletType;
    private byte[] image;
    private long userId;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public BulletType getBulletType() {
        return bulletType;
    }

    public void setBulletType(BulletType bulletType) {
        this.bulletType = bulletType;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}