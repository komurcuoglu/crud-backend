package crudapp.crudapp_backend.crud.dao;

import crudapp.crudapp_backend.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {




}
