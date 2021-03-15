package com.tutorial.manytomany.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Canal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany(mappedBy = "canales")
    private Set<Usuario> usuarios = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void delete(){
        getUsuarios().stream().forEach(u -> u.unsubscribe(this));
    }
}
