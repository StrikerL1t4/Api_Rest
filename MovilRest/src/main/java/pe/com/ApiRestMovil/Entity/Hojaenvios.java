package pe.com.ApiRestMovil.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="hojaenvios")
@Table(name="hojaenvios")
public class Hojaenvios implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="idenvio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name="costoenvio")
    private String preEnvio;
    @Column(name="estado")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name="idprovincias", referencedColumnName="idProvincias ", nullable = false)
    private Provincia provincia;
    @ManyToOne
    @JoinColumn(name="iddepartamento", referencedColumnName="IdDepartamento ", nullable = false)
    private Departamento  departamento ;    
    @ManyToOne
    @JoinColumn(name="iddistrito", referencedColumnName="idDistrito ", nullable = false)
    private Distrito  distrito;
    @ManyToOne
    @JoinColumn(name="idusuario", referencedColumnName="Idusuario ", nullable = false)
    private Usuario  usuario; 
} 