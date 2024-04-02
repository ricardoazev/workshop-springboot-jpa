package ricardo.dev.io.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ricardo.dev.io.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}