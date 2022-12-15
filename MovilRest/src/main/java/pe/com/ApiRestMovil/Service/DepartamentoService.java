/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.ApiRestMovil.Service;

import java.util.List;
import java.util.Optional;
import pe.com.ApiRestMovil.Entity.Departamento;

/**
 *
 * @author pc
 */
public interface DepartamentoService {
    List<Departamento> FindAll();
    List<Departamento> FindAllCustom();
    Optional<Departamento> findById(long id);
    Departamento add(Departamento d);
    Departamento update(Departamento d);
    Departamento delete(Departamento d);

}
