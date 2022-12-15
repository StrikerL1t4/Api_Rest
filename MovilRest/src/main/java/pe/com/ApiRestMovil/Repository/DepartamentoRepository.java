package pe.com.ApiRestMovil.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.ApiRestMovil.Entity.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
    @Query("select d from departamento d where d.estado=1")
    List<Departamento> findAllCustome();
}
