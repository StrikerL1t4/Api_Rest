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
import pe.com.ApiRestMovil.Entity.Hojaenvios;
import pe.com.ApiRestMovil.Service.HojaenviosService;

/**
 *
 * @author RONALD
*/

@RestController
@RequestMapping("/Hojaenvio")
public class HojaenvioRestController {
    @Autowired
    private HojaenviosService hojaenviosService;
    
     @GetMapping
    public List<Hojaenvios> findAll(){
        return hojaenviosService.find();
    }
    @GetMapping("/custom")
    public List<Hojaenvios> findallCustom(){
        return hojaenviosService.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<Hojaenvios> findById(@PathVariable Long id){
        return hojaenviosService.findById(id);
    }
    @PostMapping
    public Hojaenvios add(@RequestBody Hojaenvios h){
        return hojaenviosService.add(h);
    }
    @PutMapping("/{id}")
    public Hojaenvios update (@PathVariable Long id, @RequestBody Hojaenvios h){
        h.setCodigo(id);
        return hojaenviosService.update(h);
    }
    @DeleteMapping("/{id}")
    public Hojaenvios delete (@PathVariable Long id){
        Hojaenvios objHojaenvio = new Hojaenvios();
        objHojaenvio.setEstado(false);
        return hojaenviosService.delete(Hojaenvios.builder().codigo(id).build());
    }
}
