package ricardo.dev.io.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ricardo.dev.io.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}