package org.example;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author forest
 * @Date 2022/11/13 21:43
 * @Version 1.0
 */
public interface UserRepository extends MongoRepository<User, String> {
}
