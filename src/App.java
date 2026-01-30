import domain.Trader;
import util.CityService;
import util.GoodsService;

public class App {
    private GoodsService gs = new GoodsService();
    private Trader trader = new Trader(3, 200, 60);
    private CityService cs = new CityService();

    public void run() {

    }
}
