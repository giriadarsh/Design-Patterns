package designpatterns.structural.flyweight.after;

import designpatterns.structural.flyweight.after.BulletStatus;

public class FlyingBullet {

    private double x_coordinate;
    private double y_coordinate;
    private double z_coordinate;
    private double speed;
    private BulletStatus bulletStatus;
    private long userId;
    private double x_direction;
    private double y_direction;
    private double z_direction;

    private Bullet bullet;

    public double getX_coordinate() {
        return x_coordinate;
    }

    public void setX_coordinate(double x_coordinate) {
        this.x_coordinate = x_coordinate;
    }

    public double getY_coordinate() {
        return y_coordinate;
    }

    public void setY_coordinate(double y_coordinate) {
        this.y_coordinate = y_coordinate;
    }

    public double getZ_coordinate() {
        return z_coordinate;
    }

    public void setZ_coordinate(double z_coordinate) {
        this.z_coordinate = z_coordinate;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public BulletStatus getBulletStatus() {
        return bulletStatus;
    }

    public void setBulletStatus(BulletStatus bulletStatus) {
        this.bulletStatus = bulletStatus;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public double getX_direction() {
        return x_direction;
    }

    public void setX_direction(double x_direction) {
        this.x_direction = x_direction;
    }

    public double getY_direction() {
        return y_direction;
    }

    public void setY_direction(double y_direction) {
        this.y_direction = y_direction;
    }

    public double getZ_direction() {
        return z_direction;
    }

    public void setZ_direction(double z_direction) {
        this.z_direction = z_direction;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }
}
