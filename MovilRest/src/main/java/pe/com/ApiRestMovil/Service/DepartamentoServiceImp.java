package pe.com.ApiRestMovil.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ApiRestMovil.Entity.Departamento;
import pe.com.ApiRestMovil.Repository.DepartamentoRepository;

@Service
public class DepartamentoServiceImp implements DepartamentoService{

    
    @Autowired
    private DepartamentoRepository derepositorio;
    
    @Override
    public List<Departamento> FindAll() {
        return derepositorio.findAll();
    }

    @Override
    public List<Departamento> FindAllCustom() {
        return derepositorio.findAllCustome();
    }

    @Override
    public Optional<Departamento> findById(long id) {
        return derepositorio.findById(id);
    }

    @Override
    public Departamento add(Departamento d) {
        return derepositorio.save(d);
    }

    @Override
    public Departamento update(Departamento d) {
        Departamento objdepartamento=derepositorio.getById(d.getCodigo());
        BeanUtils.copyProperties(d, objdepartamento);
        return derepositorio.save(objdepartamento);
    }

    @Override
    public Departamento delete(Departamento d) {
        Departamento objdepartamento=derepositorio.getById(d.getCodigo());
        objdepartamento.setEstado(false);
        return derepositorio.save(objdepartamento);
    }

}
