package model;

public class SilverCard extends DiscountCard {

    public SilverCard(String owner, int turnover) {
        super(owner, turnover, 2);
    }

    @Override
    public double getDiscount(double purchasePrice) {

        return purchasePrice*getDiscountRate()/100;
    }

    @Override
    public double getDiscountRate() {
        double discountRate = getInitialDiscountRate();
        if(getTurnover() > 300) {
            discountRate = 3.5;
        }

        return discountRate;
    }
}
