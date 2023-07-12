package com.gonzaloalonzo.spring6.controller;

import com.gonzaloalonzo.spring6.entity.Usuario;
import com.gonzaloalonzo.spring6.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("usuario")
public class UsuarioController {
    @Autowired
    IUsuarioService objUsuarioService;

    @GetMapping
    public String listarUsuarios(Model model){
        List<Usuario> listarUsuarios = objUsuarioService.listarUsuario();
        model.addAttribute("usuarios", listarUsuarios);
        return "listarUsuarios";
    }

    @GetMapping("/{idUsuario}")
    public String listarUsuarioPorId(@PathVariable int id_usuario, Model model){
        Usuario usuario = objUsuarioService.buscarUsuarioporId(id_usuario);
        model.addAttribute("usuario", usuario);
        return "usuario";
    }

    @GetMapping("/crearUsuario")
    public String mostrarFormularioCrearUsuario (Model model){
        return "crearUsuario";
    }

    @PostMapping("/crearUsuario")
    public String crearUsuario(@ModelAttribute Usuario usuario){
        objUsuarioService.crearUsuario(usuario);
        return "redirect/usuario";
    }

    @GetMapping("/{id_usuario}/editar")
    public  String mostrarFormularioEditarUsuario(@PathVariable int id_usuario, Model model){
        Usuario usuarioParaEditar = objUsuarioService.buscarUsuarioporId(id_usuario);
        model.addAttribute("usuario", usuarioParaEditar);
        return "editarUsuario";
    }

    @GetMapping("/{idUsuario}/eliminar")
    public String mostrarEliminarUsuario(@PathVariable int id_usuario, Model model){
        Usuario usuarioEliminar =objUsuarioService.buscarUsuarioporId(id_usuario);
        model.addAttribute("usuario", usuarioEliminar);
        return "eliminarUsuario";
    }



}
