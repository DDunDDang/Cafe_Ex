package Product;

public class ProductRepository {
    private Product[] products = new Product[]{
            new Coffee(1, "Americano", 3000, false),
            new Coffee(2, "Caffe Latte", 3500, false),
            new Tea(3, "Peppermint Tea", 4000, false),
            new Tea(4, "Rooibos Tea", 4500, false)
    };
    public Product[] getProducts() {
        return products;
    }
    public Product findById(int productID){
        for (Product product : products) {
            if (product.getId() == productID) return product;
        }
        return null;
    }
}
