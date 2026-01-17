package domain;

import enums.TypeGoods;

import java.util.Objects;

public class Good {
    private int weight;
    private TypeGoods type;
    private String quality;
    private double price;

    public Good(int weight, TypeGoods type, String quality, double price) {
        this.weight = weight;
        this.type = Objects.requireNonNull(type, "У данного товара нет типа");
        this.quality = quality;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public TypeGoods getType() {
        return type;
    }

    public void setType(TypeGoods type) {
        this.type = type;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
