package teste.demo.repositories;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import teste.demo.entities.User;

// Database seeding ("Objetivo: popular banco de dados com objetos")
@Configuration
@Profile("test")
public interface UserRepository extends JpaRepository<User, Long> {

}
