package domain;

import enums.TypeGoods;

import java.util.Random;

public class Goods {
    private int weight;
    private TypeGoods type;
    private String qualityGoods;
    private double price;

    public Goods() {
        Random r = new Random();
        this.weight = r.nextInt(20) + 1;
        
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getQualityGoods() {
        return qualityGoods;
    }

    public void setQualityGoods(String qualityGoods) {
        this.qualityGoods = qualityGoods;
    }

    public TypeGoods getType() {
        return type;
    }

    public void setType(TypeGoods type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
