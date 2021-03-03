package service.product;


import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {

    private static List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(0,"thinh0","thinh0@email.com","thai binh 0"));
        productList.add(new Product(1,"thinh1","thinh1@email.com","thai binh 1"));
        productList.add(new Product(2,"thinh2","thinh2@email.com","thai binh 2 "));
        productList.add(new Product(3,"thinh3","thinh3@email.com","thai binh 3"));
        productList.add(new Product(4,"thinh4","thinh4@email.com","thai binh 4"));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public Product findById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId()==id){
                return productList.get(i);
            }
        }
        return null;
    }

    @Override
    public void create(Product product) {

        productList.add(product);

    }

    @Override
    public void update(Product product) {
        int index = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId()==product.getId()){
                index=i;
            }
        }
        productList.set(index,product);
    }

    @Override
    public void delete(int id) {
        Product product = this.findById(id);

        productList.remove(product);
    }
}
