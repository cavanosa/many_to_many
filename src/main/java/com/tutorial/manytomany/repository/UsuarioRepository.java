package com.tutorial.manytomany.repository;

import com.tutorial.manytomany.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    @Query("SELECT u FROM Usuario u INNER JOIN FETCH u.canales c WHERE u.id = :id")
    Optional<Usuario> findByIdFetchCanales(@Param("id") int id);
}
