package pe.com.ApiRestMovil.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.ApiRestMovil.Entity.Provincia;


public interface ProvinciaRepository extends JpaRepository <Provincia, Long>{
    @Query("select p from Provincias p where p.estado='1'")
    List<Provincia> findAllCustom();
}
