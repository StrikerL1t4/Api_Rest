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
@Entity(name="distritos")
@Table(name="distritos")
public class Distrito implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="iddistrito")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name="distrito")
    private String nomDistritos;
    @Column(name="estado")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name="idprovincia", referencedColumnName="idprovincias", nullable = false)
    private Provincia provincia;
    
    
} 
