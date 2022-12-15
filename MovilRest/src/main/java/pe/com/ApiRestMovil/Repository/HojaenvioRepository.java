package pe.com.ApiRestMovil.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.ApiRestMovil.Entity.Hojaenvios;

public interface HojaenvioRepository extends JpaRepository <Hojaenvios, Long>{
    @Query("select h from hojaenvios h where h.estado='1'")
    List<Hojaenvios> findAllCustom();
}