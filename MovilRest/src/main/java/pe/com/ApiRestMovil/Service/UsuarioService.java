package pe.com.ApiRestMovil.Service;

import java.util.List;
import java.util.Optional;
import pe.com.ApiRestMovil.Entity.Usuario;

public interface UsuarioService {
    public List<Usuario> findAll();
    public List<Usuario> findAllCustom();
    public Optional<Usuario> findById(long id);
    public Usuario add(Usuario u);
    public Usuario update(Usuario u);
    public Usuario delete(Usuario u);
}
