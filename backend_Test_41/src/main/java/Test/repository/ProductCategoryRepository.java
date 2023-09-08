package Test.repository;


import Test.model.ProductCategory;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class ProductCategoryRepository extends SimpleJpaRepository<ProductCategory, String> {
    private final EntityManager em;
    public ProductCategoryRepository(EntityManager em) {
        super(ProductCategory.class, em);
        this.em = em;
    }
    @Override
    public List<ProductCategory> findAll() {
        return em.createNativeQuery("Select * from \"DBtest\".\"ProductCategory\"", ProductCategory.class).getResultList();
    }
}