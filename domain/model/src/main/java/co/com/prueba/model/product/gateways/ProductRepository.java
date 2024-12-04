package co.com.prueba.model.product.gateways;

import co.com.prueba.model.product.Product;

public interface ProductRepository {
    Product save(Product product);

}
