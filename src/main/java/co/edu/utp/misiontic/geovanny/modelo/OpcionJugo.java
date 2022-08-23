package co.edu.utp.misiontic.geovanny.modelo;

public class OpcionJugo {
    private Integer id;
    private String nombre;

    public OpcionJugo(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return getNombre();
    }
}
