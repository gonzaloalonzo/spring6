package com.gonzaloalonzo.spring6.restcontroller;

import com.gonzaloalonzo.spring6.entity.Usuario;
import com.gonzaloalonzo.spring6.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioRestController {
    @Autowired
    IUsuarioService objUsuarioService;

    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        return objUsuarioService.crearUsuario(usuario);
    }

    @GetMapping("/{idUsuario}")
    public Usuario buscarUsuarioPorId(@PathVariable int idUsuario){
        return objUsuarioService.buscarUsuarioporId(idUsuario);
    }

    @GetMapping
    public List<Usuario> listarUsuario(){
    return objUsuarioService.listarUsuario();}

    @PutMapping
    public Usuario actualizarUsuario(@RequestBody Usuario usuarioActualizar, @PathVariable int idUsuario){
        return objUsuarioService.actualizarUsuario(usuarioActualizar,idUsuario);
    }

    @DeleteMapping
    public void eliminarUsuario(@PathVariable int idUsuario){
        objUsuarioService.eliminarUsuario(idUsuario);
    }
}
