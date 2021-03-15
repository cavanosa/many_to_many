package com.tutorial.manytomany.controller;

import com.tutorial.manytomany.dto.SubDTO;
import com.tutorial.manytomany.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    UsuarioService usuarioService;

    @PutMapping("/subscribe")
    public ResponseEntity subscribe(@RequestBody SubDTO dto){
        usuarioService.susbcribe(dto.getIdUser(), dto.getIdCanal());
        return new ResponseEntity("te has suscrito", HttpStatus.OK);
    }

    @PutMapping("/unsubscribe")
    public ResponseEntity unsubscribe(@RequestBody SubDTO dto){
        usuarioService.unsusbcribe(dto.getIdUser(), dto.getIdCanal());
        return new ResponseEntity("te has borrado", HttpStatus.OK);
    }

    @DeleteMapping("/deletecanal/{id}")
    public ResponseEntity deleteCanal(@PathVariable("id") int id){
        usuarioService.deleteCanal(id);
        return new ResponseEntity("canal eliminado", HttpStatus.OK);
    }


}
