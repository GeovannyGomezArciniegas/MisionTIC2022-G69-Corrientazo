package co.edu.utp.misiontic.geovanny.controlador;

import java.util.ArrayList;
import java.util.List;

import co.edu.utp.misiontic.geovanny.modelo.Mesa;
import co.edu.utp.misiontic.geovanny.vista.MesaVista;

public class RestauranteControlador {
    private MesaVista mesaVista;
    private List<Mesa> mesas;

    public RestauranteControlador() {
        this.mesaVista = new MesaVista();

        this.mesas = new ArrayList<>();
    }
    /**
     * 
     */
    public void crearMesa() {
        //Pedir la informacion necesaria para crear la mesa
        Mesa mesa = mesaVista.pedirInformacionMesa();

        // Almacenar la mesa
        this.mesas.add(mesa);

        //Listar las mesas que se encuentren en el sistema
        mesaVista.mostrarMesas(mesas);
    }
}
