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
import pe.com.ApiRestMovil.Service.DepartamentoService;

@RestController
@RequestMapping("/departamento")
public class DepartamentoRestController {
    @Autowired
    private DepartamentoService servicios;
    
        
    @GetMapping
    public List<Departamento> findAll(){
        return servicios.FindAll();
    }
    @GetMapping("/custom")
    public List<Departamento> findallCustom(){
        return servicios.FindAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<Departamento> findById(@PathVariable Long id){
        return servicios.findById(id);
    }
    @PostMapping
    public Departamento add(@RequestBody Departamento d){
        return servicios.add(d);
    }
    @PutMapping("/{id}")
    public Departamento update (@PathVariable Long id, @RequestBody Departamento d){
        d.setCodigo(id);
        return servicios.update(d);
    }
    @DeleteMapping("/{id}")
    public Departamento delete (@PathVariable Long id){
        Departamento objDepartamento = new Departamento();
        objDepartamento.setEstado(false);
        return servicios.delete(Departamento.builder().codigo(id).build());
    }
}
//}
