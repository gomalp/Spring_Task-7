package ItmSprHibTct.repository;

import ItmSprHibTct.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // JpaRepository уже включает в себя:
    // - findById(Long id)
    // - save(User user)
    // - deleteById(Long id)
    // - findAll()
    // - count()
}