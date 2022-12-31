import discount.DiscountCondition;
import discount.CozDiscount;

public class Main {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk(new CozDiscount(500));

        kiosk.operate();
    }
}