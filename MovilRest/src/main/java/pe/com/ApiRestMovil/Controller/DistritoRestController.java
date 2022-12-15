
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
import pe.com.ApiRestMovil.Entity.Distrito;
import pe.com.ApiRestMovil.Service.DistritoService;


@RestController
@RequestMapping("/distrito")
public class DistritoRestController {
    
    @Autowired
    private DistritoService diservice;
    
    @GetMapping
    public List<Distrito> findAll(){
        return diservice.findAll();
    }
    @GetMapping("/custom")
    public List<Distrito>findallCustom(){
        return diservice.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<Distrito> findById(@PathVariable Long id){
        return diservice.findById(id);
    }
    @PostMapping
    public Distrito add(@RequestBody Distrito di){
        return diservice.add(di);
    }
    @PutMapping("/{id}")
    public Distrito update (@PathVariable Long id, @RequestBody Distrito di){
        di.setCodigo(id);
        return diservice.update(di);
    }
    @DeleteMapping("/{id}")
    public Distrito delete (@PathVariable Long id){
        Distrito objDistrito = new Distrito();
        objDistrito.setEstado(false);
        return diservice.delete(Distrito.builder().codigo(id).build());
    }
    
}
