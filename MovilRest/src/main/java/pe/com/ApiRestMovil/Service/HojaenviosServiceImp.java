package pe.com.ApiRestMovil.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ApiRestMovil.Entity.Hojaenvios;
import pe.com.ApiRestMovil.Repository.HojaenvioRepository;

@Service
public class HojaenviosServiceImp implements HojaenviosService{

    @Autowired 
    private HojaenvioRepository hojaenvioRepository;
    @Override
    public List<Hojaenvios> find() {
        return hojaenvioRepository.findAll();
    }

    @Override
    public List<Hojaenvios> findAllCustom() {
        return hojaenvioRepository.findAllCustom();
    }

    @Override
    public Optional<Hojaenvios> findById(long id) {
       return hojaenvioRepository.findById(id);
    }

    @Override
    public Hojaenvios add(Hojaenvios h) {
        return hojaenvioRepository.save(h);
    }

    @Override
    public Hojaenvios update(Hojaenvios h) {
         Hojaenvios objhojaenvio=hojaenvioRepository.getById(h.getCodigo());
        BeanUtils.copyProperties(h, objhojaenvio);
        return hojaenvioRepository.save(objhojaenvio);

    }

    @Override
    public Hojaenvios delete(Hojaenvios h) {
        Hojaenvios objhojaenvio=hojaenvioRepository.getById(h.getCodigo());
        objhojaenvio.setEstado(false);
        return hojaenvioRepository.save(objhojaenvio);
    }
    
}
