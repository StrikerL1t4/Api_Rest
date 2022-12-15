package pe.com.ApiRestMovil.Service;

import java.util.List;
import java.util.Optional;
import pe.com.ApiRestMovil.Entity.Hojaenvios;

public interface HojaenviosService {
    public List<Hojaenvios> find();
    public List<Hojaenvios> findAllCustom();
    public Optional<Hojaenvios> findById(long id);
    public Hojaenvios add(Hojaenvios h);
    public Hojaenvios update(Hojaenvios h);
    public Hojaenvios delete(Hojaenvios h);

}
    
    
    
    
    
