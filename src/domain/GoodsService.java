package domain;

import enums.TypeGoods;

import java.util.ArrayList;
import java.util.List;

public class GoodsService {
    private List<Good> goods = new ArrayList<>();

    public GoodsService() {
    }

    private void fillGoods() {
        goods.add(new Good(17, TypeGoods.MEAT, "Хороший", 4.5));
    }
}
