package de.ait.userapi.repository;

import de.ait.userapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.*;

@Repository
public class ProductDB {//implements JpaRepository {

    private Long lastId = 6L;
    private static final Map<Long, Product> map = new HashMap<>();

    static {
        map.put(1L, new Product(1L, "Orange", BigDecimal.valueOf(15)));
        map.put(2L, new Product(2L, "Apple", BigDecimal.valueOf(25)));
        map.put(3L, new Product(3L, "Pear", BigDecimal.valueOf(10)));
        map.put(4L, new Product(4L, "Peach", BigDecimal.valueOf(27)));
        map.put(5L, new Product(5L, "Banana", BigDecimal.valueOf(17)));
        map.put(6L, new Product(6L, "Grape", BigDecimal.valueOf(17)));
    }

    //@Override
    public List<Product> findAll() {
        return new ArrayList<>(map.values());
    }

    //@Override
    public Optional<Product> findById(Long id) {
        return Optional.ofNullable(map.get(id));
    }

    //@Override
    public Product save(Product product) {
        product.setId(++lastId);
        map.put(product.getId(), product);
        return product;
    }
}






