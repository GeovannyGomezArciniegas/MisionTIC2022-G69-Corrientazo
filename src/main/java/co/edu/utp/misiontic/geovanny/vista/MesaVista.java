package co.edu.utp.misiontic.geovanny.vista;

import java.util.List;
import java.util.Scanner;

import co.edu.utp.misiontic.geovanny.modelo.Mesa;

public class MesaVista {

    public Mesa pedirInformacionMesa() {
        var sc = new Scanner(System.in);

        System.out.println(".: INFORMACIO DE LA MESAS :.");
        System.out.print("Ingrese el número de la mesa: ");
        var numero = sc.nextLine();

            sc.close();
        return new Mesa(numero);
    }

    public void mostrarMesas(List<Mesa> mesas) {
        System.out.println(".: MESAS EN EL SISTEMA :.");
        mesas.forEach(System.out::println);
    }
    
}
