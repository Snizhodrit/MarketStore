public abstract class DiscountCard {
    private String owner;
    private int turnover;
    private double initialDiscount;

    public DiscountCard(String owner, int turnover, int initialDiscount) {
        this.owner = owner;
        this.turnover = turnover;
        this.initialDiscount = initialDiscount;
    }

    public abstract double getDiscount(double purchasePrice);

    public abstract double getDiscountRate();

    public void setTurnover(int turnover) {
        this.turnover = turnover;
    }

    public String getOwner() {
        return owner;
    }

    public int getTurnover() {
        return turnover;
    }

    public double getInitialDiscountRate() {
        return initialDiscount;
    }
}
