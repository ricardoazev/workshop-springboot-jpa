package ricardo.dev.io.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ricardo.dev.io.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
