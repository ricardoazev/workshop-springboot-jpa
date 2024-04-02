package ricardo.dev.io.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ricardo.dev.io.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
