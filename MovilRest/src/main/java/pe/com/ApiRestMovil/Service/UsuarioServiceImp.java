package pe.com.ApiRestMovil.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ApiRestMovil.Entity.Usuario;
import pe.com.ApiRestMovil.Repository.UsuarioRepository;

@Service
public class UsuarioServiceImp  implements UsuarioService{
    
    @Autowired
    private UsuarioRepository usurepositorio;
    
    @Override
    public List<Usuario> findAll() {
        return usurepositorio.findAll();
    }

    @Override
    public List<Usuario> findAllCustom() {
        return usurepositorio.findAllCustome();
    }

    @Override
    public Optional<Usuario> findById(long id) {
        return usurepositorio.findById(id);
    }

    @Override
    public Usuario add(Usuario u) {
        return usurepositorio.save(u);
    }

    @Override
    public Usuario update(Usuario u) {
        Usuario objdeUsuario=usurepositorio.getById(u.getCodigo());
        BeanUtils.copyProperties(u, objdeUsuario);
        return usurepositorio.save(objdeUsuario);
    }

    @Override
    public Usuario delete(Usuario u) {
       Usuario objdeUsuario=usurepositorio.getById(u.getCodigo());
        objdeUsuario.setEstado(false);
        return usurepositorio.save(objdeUsuario);

    }
    
}
