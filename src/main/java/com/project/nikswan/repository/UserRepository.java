package com.project.nikswan.repository;

import com.project.nikswan.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
