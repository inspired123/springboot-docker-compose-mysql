package com.example.springbootdockercomposemysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootdockercomposemysql.entity.User;

public interface UserRepository extends JpaRepository<User, Long>
{

}
