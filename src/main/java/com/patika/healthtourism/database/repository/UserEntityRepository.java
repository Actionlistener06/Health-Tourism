package com.patika.healthtourism.database.repository;

import com.patika.healthtourism.database.entity.UserEntity;
import com.patika.healthtourism.util.dbutil.IBaseRepository;
import jakarta.validation.constraints.Email;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserEntityRepository extends IBaseRepository<UserEntity> {
    Optional<UserEntity> findByEmail(String email);
}
