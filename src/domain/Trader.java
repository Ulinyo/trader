package domain;

import java.util.List;

public class Trader {
    private int speed;
    private int capacity;
    private double money;
    private List<Good> goods;

    public Trader(int speed, int capacity, double money) {
        this.speed = speed;
        this.capacity = capacity;
        this.money = money;
    }

    public void buy(Good good) {
        if(good.getWeight() + capacity < capacity || money - good.getPrice() > 0) {
            goods.add(good);
            money -= good.getPrice();
            capacity += good.getWeight();
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
