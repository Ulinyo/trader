package util;

import domain.Good;
import enums.TypeGoods;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GoodsService {
    private List<Good> goods = new ArrayList<>();

    public GoodsService() {
        fillGoods();
    }

    private void fillGoods() {
        goods.add(new Good(17, TypeGoods.MEAT, 4.5));
        goods.add(new Good(5, TypeGoods.FABRICS, 2.1));
        goods.add(new Good(21, TypeGoods.PAINT, 6.2));
        goods.add(new Good(12, TypeGoods.FLOUR, 3.1));
        goods.add(new Good(11, TypeGoods.GRAINS, 3.6));
        goods.add(new Good(14, TypeGoods.DRIED_FRUITS, 2.4));
    }

    public Good takeGood() {
        return goods.get(new Random().nextInt(goods.size()));
    }
}
