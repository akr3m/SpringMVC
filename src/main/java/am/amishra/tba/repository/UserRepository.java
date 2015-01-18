package am.amishra.tba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import am.amishra.tba.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
