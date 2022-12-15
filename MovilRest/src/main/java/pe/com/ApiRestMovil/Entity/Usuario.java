package pe.com.ApiRestMovil.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Usuario")
@Table(name="cuentauser")
public class Usuario implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="idusuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name="nombreusuario")
    private String nomUsuario;
    @Column(name="contraseña")
    private String nomContraseña;
    @Column(name="estado")
    private boolean estado;
} 
