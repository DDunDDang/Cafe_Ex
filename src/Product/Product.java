package Product;

public abstract class Product { //추상메서드가 있을때는 추상 메서드로 변경 "abstract"
    /*
    * 제품 id
    * 제품 이름
    * 제품 가격
    * 제품 옵션
    * */
    private int id;
    private String name;
    private int price;
    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public abstract void applyOption(); //메서드 바디가 아얘 없음 "{}"

    public abstract String stringApplyOption();

}
