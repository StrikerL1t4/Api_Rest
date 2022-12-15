package pe.com.ApiRestMovil.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ApiRestMovil.Entity.Distrito;
import pe.com.ApiRestMovil.Repository.DistritoRepository;

@Service
public class DistritoServiceImp implements DistritoService{

    
    @Autowired
    private DistritoRepository disrepositorio;

    @Override
    public List<Distrito> findAll() {
        return disrepositorio.findAll();
    }

    @Override
    public List<Distrito> findAllCustom() {
        return disrepositorio.findAllCustome();
    }

    @Override
    public Optional<Distrito> findById(long id) {
        return disrepositorio.findById(id);
    }

    @Override
    public Distrito add(Distrito di) {
       return disrepositorio.save(di);
    }

    @Override
    public Distrito update(Distrito di) {
        Distrito objdistrito=disrepositorio.getById(di.getCodigo());
        BeanUtils.copyProperties(di, objdistrito);
        return disrepositorio.save(objdistrito);
    }

    @Override
    public Distrito delete(Distrito di) {
         Distrito objdistrito =disrepositorio.getById(di.getCodigo());
        objdistrito.setEstado(false);
        return disrepositorio.save(objdistrito);
    }
    
   
}
