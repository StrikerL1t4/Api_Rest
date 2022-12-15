package pe.com.ApiRestMovil.Service;

import java.util.List;
import java.util.Optional;
import pe.com.ApiRestMovil.Entity.Provincia;

public interface ProvinciaService  {
    public List<Provincia> find();
    public List<Provincia> findAllCustom();
    public Optional<Provincia> findById(long id);
    public Provincia add(Provincia p);
    public Provincia update(Provincia p);
    public Provincia delete(Provincia p);

    
}
