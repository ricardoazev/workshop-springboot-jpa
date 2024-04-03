package ricardo.dev.io.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ricardo.dev.io.course.entities.OrderItem;
import ricardo.dev.io.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}