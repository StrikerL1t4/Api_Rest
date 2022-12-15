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
import pe.com.ApiRestMovil.Entity.Departamento;
import pe.com.ApiRestMovil.Entity.Provincia;
import pe.com.ApiRestMovil.Service.DepartamentoService;
import pe.com.ApiRestMovil.Service.ProvinciaService;

/**
 *
 * @author RONALD
 */
@RestController
@RequestMapping("/provincia")
public class ProvinciaRestController {
     @Autowired
    private ProvinciaService provinciaService;
    
        
    @GetMapping
    public List<Provincia> find(){
        return provinciaService.find();
    }
    @GetMapping("/custom")
    public List<Provincia> findallCustom(){
        return provinciaService.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<Provincia> findById(@PathVariable Long id){
        return provinciaService.findById(id);
    }
    @PostMapping
    public Provincia add(@RequestBody Provincia p){
        return provinciaService.add(p);
    }
    @PutMapping("/{id}")
    public Provincia update (@PathVariable Long id, @RequestBody Provincia p){
        p.setCodigo(id);
        return provinciaService.update(p);
    }
    @DeleteMapping("/{id}")
    public Provincia delete (@PathVariable Long id){
        Provincia objProvincia = new Provincia();
        objProvincia.setEstado(false);
        return provinciaService.delete(Provincia.builder().codigo(id).build());
    }
    
}
