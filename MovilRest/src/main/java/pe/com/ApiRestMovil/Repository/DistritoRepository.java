package pe.com.ApiRestMovil.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.ApiRestMovil.Entity.Distrito;

public interface DistritoRepository extends JpaRepository <Distrito, Long>{
    @Query("select di from distritos di where di.estado=1")
    List<Distrito> findAllCustome();
}
