package com.example.Hibernate_mysql.Repository;

import com.example.Hibernate_mysql.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


    void deleteById(String id);
}
