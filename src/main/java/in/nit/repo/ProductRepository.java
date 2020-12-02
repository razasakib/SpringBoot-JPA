package in.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.nit.model.Product;
@Repository //optional
public interface ProductRepository extends 
                        JpaRepository<Product, Integer>{
        
}
