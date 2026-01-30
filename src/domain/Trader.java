package domain;

import enums.QualityGoods;
import util.GoodsService;

import java.util.ArrayList;
import java.util.List;

public class Trader {
    private int speed;
    private int maxCapacity;
    private int capacity = 0;
    private double money;
    private List<Good> goods = new ArrayList<>();
    private int passedWay;

    public Trader(int speed, int maxCapacity, double money) {
        this.speed = speed;
        this.maxCapacity = maxCapacity;
        this.money = money;
    }

    public void fillCart() {
        GoodsService gs = new GoodsService();
        while (money > 0 && maxCapacity > capacity) {
            Good good = gs.takeGood();
            if (good.getWeight() + capacity < maxCapacity && money - good.getPrice() > 0) {
                goods.add(good);
                money -= good.getPrice();
                capacity += good.getWeight();
            } else {
                break;
            }
        }
    }

    public void deleteSpoiletGoods() {
        goods.removeIf(g -> g.getQuality().equals(QualityGoods.RUINED));
    }

    public void showGoods() {
        goods.forEach(System.out::println);
    }

    public int getPassedWay() {
        return passedWay;
    }

    public void setPassedWay(int passedWay) {
        this.passedWay = passedWay;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Good> getGoods() {
        return goods;
    }

    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }
}
