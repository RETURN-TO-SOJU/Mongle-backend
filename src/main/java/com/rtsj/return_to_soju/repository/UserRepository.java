package com.rtsj.return_to_soju.repository;

import com.rtsj.return_to_soju.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
