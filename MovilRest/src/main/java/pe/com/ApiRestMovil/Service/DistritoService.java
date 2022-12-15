package pe.com.ApiRestMovil.Service;

import java.util.List;
import java.util.Optional;
import pe.com.ApiRestMovil.Entity.Distrito;

public interface DistritoService {
    public List<Distrito> findAll();
    public List<Distrito> findAllCustom();
    public Optional<Distrito> findById(long id);
    public Distrito add(Distrito di);
    public Distrito update(Distrito di);
    public Distrito delete(Distrito di);

    
}
