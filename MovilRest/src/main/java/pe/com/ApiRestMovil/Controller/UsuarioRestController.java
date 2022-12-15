/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.ApiRestMovil.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.ApiRestMovil.Entity.Usuario;
import pe.com.ApiRestMovil.Service.UsuarioService;



@RestController
@RequestMapping("/user")
public class UsuarioRestController {
    @Autowired
    private UsuarioService usuarios;
    
    @GetMapping
    public List<Usuario> findAll(){
        return usuarios.findAll();
    }
    @GetMapping("/custom")
    public List<Usuario> findallCustom(){
        return usuarios.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<Usuario> findById(@PathVariable Long id){
        return usuarios.findById(id);
    }
    @PostMapping
        public Usuario add(@RequestBody Usuario u){
        return usuarios.add(u);
    }
    @PutMapping("/{id}")
    public Usuario update (@PathVariable Long id, @RequestBody Usuario u){
        u.setCodigo(id);
        return usuarios.update(u);
    }
    @DeleteMapping("/{id}")
    public Usuario delete (@PathVariable Long id){
        Usuario objdeUsuario = new Usuario();
        objdeUsuario.setEstado(false);
        return usuarios.delete(Usuario.builder().codigo(id).build());
    }
}
  
