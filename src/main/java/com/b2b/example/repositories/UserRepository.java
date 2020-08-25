package com.b2b.example.repositories;

import com.b2b.example.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Declaring interface userRepository who extends CrudRepository
 * - This let us to call CRUD actions.
 **/
public interface UserRepository extends CrudRepository<User, Integer> {
}
