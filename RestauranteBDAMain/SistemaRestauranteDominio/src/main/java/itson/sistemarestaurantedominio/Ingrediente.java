package itson.sistemarestaurantedominio;

//@author SAUL ISAAC APODACA BALDENEGRO 00000252020

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "ingredientes")
public class Ingrediente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idIngrediente")
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "unidadMedida", nullable = false)
    private UnidadMedidaIngrediente unidadMedida;
    
    @Column(name = "stock", nullable = false)
    private Integer stock;
    
    @OneToMany(mappedBy = "ingrediente", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<ProductoIngrediente> productos;

    public Ingrediente() {
    }
    
    public Ingrediente(String nombre, UnidadMedidaIngrediente unidadMedida, Integer stock){
        this.nombre = nombre;
        this.unidadMedida = unidadMedida;
        this.stock = stock;
    }
    
    public Long getId() {
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    
    public UnidadMedidaIngrediente getUnidadMedida(){
        return unidadMedida;
    }
    
    public List<ProductoIngrediente> getProductos(){
        return productos;
    }
    
    public Integer getStock(){
        return stock;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUnidadMedida(UnidadMedidaIngrediente unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setProductos(List<ProductoIngrediente> productos){
        this.productos = productos;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ingrediente)) {
            return false;
        }
        Ingrediente other = (Ingrediente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "itson.sistemarestaurantedominio.Ingrediente[ id=" + id + " ]";
    }

}
