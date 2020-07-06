package model;

public class BronzeCard extends DiscountCard {

    public BronzeCard(String owner, int turnover) {
        super(owner, turnover, 0);
    }

    @Override
    public double getDiscount(double purchasePrice) {

        return purchasePrice*getDiscountRate()/100;
    }

    @Override
    public double getDiscountRate() {
        double discountRate = getInitialDiscountRate();
        if (getTurnover() > 100 && getTurnover() < 300) {
            discountRate = 1;
        } else if(getTurnover() > 300) {
            discountRate = 2.5;
        }

        return discountRate;
    }


}
