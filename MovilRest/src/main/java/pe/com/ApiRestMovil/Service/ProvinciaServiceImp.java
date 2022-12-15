package pe.com.ApiRestMovil.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ApiRestMovil.Entity.Provincia;
import pe.com.ApiRestMovil.Repository.ProvinciaRepository;


@Service
public class ProvinciaServiceImp implements ProvinciaService{
    
    @Autowired
    private ProvinciaRepository prorepositorio;

    @Override
    public List<Provincia> find() {
      return prorepositorio.findAll();
    }

    @Override
    public List<Provincia> findAllCustom() {
        return prorepositorio.findAllCustom();
    }

    @Override
    public Optional<Provincia> findById(long id) {
        return prorepositorio.findById(id);
    }

    @Override
    public Provincia add(Provincia p) {
        return prorepositorio.save(p);
    }

    @Override
    public Provincia update(Provincia p) {
       Provincia objProvincia=prorepositorio.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objProvincia);
        return prorepositorio.save(objProvincia);
    }

    @Override
    public Provincia delete(Provincia p) {
        Provincia objProvincia=prorepositorio.getById(p.getCodigo());
        objProvincia.setEstado(false);
        return prorepositorio.save(objProvincia);
    }
    
}
