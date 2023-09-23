package com.example.foundemotions.repositories;

import com.example.foundemotions.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    public User findByUsername(String username);

    @Query("select count(u.username) from User u where u.username =:username")
    public int buscarUsername(@Param("username") String nombre);

    @Transactional
    @Modifying
    @Query(value = "insert into roles (rol, userid) VALUES (:rol, :userid)", nativeQuery = true)
    public void insRol(@Param("rol") String authority, @Param("userid") Long userid);

}
