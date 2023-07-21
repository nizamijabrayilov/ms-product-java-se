package service;

import config.ProductConfig;
import model.Product;

import java.util.List;

public class ProductService {

    public List<Product> getAllProducts(){
        return ProductConfig.products;
    }

}
