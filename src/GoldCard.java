public class GoldCard extends DiscountCard {

    public GoldCard(String owner, int turnover) {
        super(owner, turnover, 2);
    }

    @Override
    public double getDiscount(double purchasePrice) {

        int increase = getTurnover()/100;
        double discount = getInitialDiscountRate()+increase;

        if (discount > 10) discount = 10;

        return purchasePrice*discount/100;
    }

    @Override
    public double getDiscountRate() {

        int increase = getTurnover()/100;
        double discountRate = getInitialDiscountRate()+increase;

        if (discountRate > 10) discountRate = 10;

        return discountRate;
    }
}
