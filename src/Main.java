import model.BronzeCard;
import model.DiscountCard;
import model.GoldCard;
import model.SilverCard;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        BronzeCard bronzeCard = new BronzeCard("Snizhodrit", 0);
        SilverCard silverCard = new SilverCard("Alex", 600);
        GoldCard goldCard = new GoldCard("Alexander", 1500);

        output(bronzeCard, 150);
        output(silverCard, 850);
        output(goldCard, 1300);
    }

    public void output(DiscountCard discountCard, double purchaseValue) {
        if (discountCard instanceof BronzeCard) {
            System.out.println("Bronze: ");
        } else if (discountCard instanceof SilverCard) {
            System.out.println("Silver: ");
        } else {
            System.out.println("Gold: ");
        }
        System.out.println("turnover: " + discountCard.getTurnover() + "$ purchase value " + purchaseValue + "$");
        System.out.println("Purchase value: " + purchaseValue + "$");
        System.out.println("Discount rate: " + discountCard.getDiscountRate() + "%");
        System.out.println("Discount: " + discountCard.getDiscount(purchaseValue) + "$");
        System.out.println("Total: " + (purchaseValue - discountCard.getDiscount(purchaseValue)) + "$");
        System.out.println();
    }
}
