package store.service;

import store.domain.ItemFactory;
import store.domain.Product;

import java.util.List;

public class StockManager {

    private final List<Product> stock;

    public StockManager() {
        ItemFactory itemFactory = new ItemFactory();
        DataReader dataReader = new DataReader();

        List<String> productData = dataReader.productReader();
        stock = itemFactory.stockFactory(productData);
    }

    public List<Product> getStock() {
        return stock;
    }

    public boolean contains(String name) {
        for (Product product : stock) {
            if (product.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public Product getProductByName(String name) {
        for (Product product : stock) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

}
