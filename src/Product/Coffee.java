package Product;
import java.util.Scanner;
public class Coffee extends Product {
    private boolean extraShot;

    public Coffee(int id, String name, int price, boolean extraShot) {
        super(id, name, price);
        this.extraShot = extraShot;
    }

    public void setExtraShot(boolean extraShot) {
        this.extraShot = extraShot;
    }

    @Override
    public void applyOption() {
        System.out.println("샷을 추가하시겠습니까? (1)_예 (2)_아니오");

        Scanner scanner = new Scanner(System.in);
        int option = Integer.parseInt(scanner.nextLine());

        if (option == 1) setExtraShot(true); // void -> "return" X
    }

    @Override
    public String stringApplyOption() {
        return extraShot ? "(샷추가)" : "";
    }
}


