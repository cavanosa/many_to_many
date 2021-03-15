package com.tutorial.manytomany;

import com.tutorial.manytomany.repository.CanalRepository;
import com.tutorial.manytomany.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    CanalRepository canalRepository;


    @Override
    public void run(String... args) throws Exception {
        /*Usuario usuario = new Usuario();
        Canal canal = new Canal();

        Set<Canal> canales = new HashSet<>();
        canales.add(canal);

        usuario.setCanales(canales);
        usuarioRepository.save(usuario);*/

        // usuarioRepository.deleteById(1);

        // System.out.println(usuarioRepository.findByIdFetchCanales(1).get().getCanales().size());

    }
}
