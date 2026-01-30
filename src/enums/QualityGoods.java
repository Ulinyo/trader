package enums;

public enum QualityGoods {
    NORMAL(1.2) {
        @Override
        public QualityGoods degrate(QualityGoods good) {
            System.out.printf("%s good was gone to %s", good, QualityGoods.SLIGHTLY_DAMAGED.name());
            return SLIGHTLY_DAMAGED;
        }
    },
    SLIGHTLY_DAMAGED(0.95) {
        @Override
        public QualityGoods degrate(QualityGoods good) {
            System.out.printf("%s good was gone to %s", good, QualityGoods.HALF_GONE.name());
            return HALF_GONE;
        }
    },
    HALF_GONE(0.55) {
        @Override
        public QualityGoods degrate(QualityGoods good) {
            System.out.printf("%s good was gone to %s", good, QualityGoods.ALMOST_ALL_GONE.name());
            return ALMOST_ALL_GONE;
        }
    },
    ALMOST_ALL_GONE(0.25) {
        @Override
        public QualityGoods degrate(QualityGoods good) {
            System.out.printf("%s good was gone to %s", good, QualityGoods.RUINED.name());
            return RUINED;
        }
    },

    RUINED(0.1) {
        @Override
        public QualityGoods degrate(QualityGoods good){
            return RUINED;
        }
    };

    private double coefficient;

    QualityGoods(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    abstract public QualityGoods degrate(QualityGoods good);
}
