package com.tutorial.manytomany.service;

import com.tutorial.manytomany.entity.Canal;
import com.tutorial.manytomany.entity.Usuario;
import com.tutorial.manytomany.repository.CanalRepository;
import com.tutorial.manytomany.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    CanalRepository canalRepository;

    public void susbcribe(int idUser, int idCanal){
        Usuario usuario = usuarioRepository.findById(idUser).get();
        Canal canal = canalRepository.findById(idCanal).get();
        usuario.subscribe(canal);
        usuarioRepository.save(usuario);
    }

    public void unsusbcribe(int idUser, int idCanal){
        Usuario usuario = usuarioRepository.findById(idUser).get();
        Canal canal = canalRepository.findById(idCanal).get();
        usuario.unsubscribe(canal);
        usuarioRepository.save(usuario);
    }

    public void deleteCanal(int id){
        Canal canal = canalRepository.findById(id).get();
        canal.delete();
        canalRepository.delete(canal);
    }
}
