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
    public Usuario buscarUsuarioPorId(@PathVariable int id_usuario){
        return objUsuarioService.buscarUsuarioporId(id_usuario);
    }

    @GetMapping
    public List<Usuario> listarUsuario(){
    return objUsuarioService.listarUsuario();}

    @PutMapping
    public Usuario actualizarUsuario(@RequestBody Usuario usuarioActualizar, @PathVariable int id_usuario){
        return objUsuarioService.actualizarUsuario(usuarioActualizar,id_usuario);
    }

    @DeleteMapping
    public void eliminarUsuario(@PathVariable int id_usuario){
        objUsuarioService.eliminarUsuario(id_usuario);
    }
}
