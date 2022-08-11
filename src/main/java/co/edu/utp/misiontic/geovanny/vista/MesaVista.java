package co.edu.utp.misiontic.geovanny.vista;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import co.edu.utp.misiontic.geovanny.controlador.RestauranteControlador;
import co.edu.utp.misiontic.geovanny.modelo.Mesa;
import co.edu.utp.misiontic.geovanny.modelo.Pedido;

public class MesaVista {

    private Scanner sc;
    private RestauranteControlador controlador;

    public MesaVista(Scanner sc, RestauranteControlador controlador) {
        this.sc = sc;
        this.controlador = controlador;
    }

    public Mesa pedirInformacionMesa() {
        System.out.println(".: INFORMACIO DE LA MESAS :.");
        System.out.print("Ingrese el número de la mesa: ");
        var numero = sc.nextLine();
        return new Mesa(numero);
    }

    public void mostrarMesas(List<Mesa> mesas) {
        System.out.println(".: MESAS EN EL SISTEMA :.");
        mesas.forEach(System.out::println);
    }

    public Mesa consultarMesa() {
        System.out.println(".: CONSULTANDO MESAS :.");

        //System.out.println("Las mesas existentes son:"); **esta porcion de codigo sobra

        var mesas = controlador.getMesas();
        Mesa respuesta = null;

        do {
        try {
        System.out.println("Las mesas existentes son:");
        for (int i = 0; i < mesas.size(); i++) {
            System.out.printf("%d -> %s %n", (i+1), mesas.get(i));
        }
        System.out.print("Cual es su opción?: ");
        var opcion = sc.nextInt();
        if (opcion >=1 && opcion <= mesas.size()) {
            respuesta =  mesas.get(opcion -1);
        } else {
            System.err.println("Opción inválida, intente de nuevo");
        }
        } catch ( InputMismatchException e ) {
            System.err.println("Opción inválida, intente de nuevo");
            
        } finally {
            sc.nextLine();
        }
        } while(respuesta == null);

        return respuesta;

    }

    public Pedido seleccionePedido(Mesa mesa) {
        System.out.println(".: ELIJA EL PEDIDO :.");

        var opciones = mesa.getPedidos();
        Pedido respuesta = null;

        do {
        try {
            System.out.println("Las opciones son:");
            for (int i = 0; i < opciones.size(); i++) {
                System.out.printf("%d -> %s %n", (i+1), opciones.get(i));
            }
            System.out.print("Cual es su opción: ");
            var opcion = sc.nextInt();
            if (opcion >=1 && opcion <= opciones.size()) {
                respuesta =  opciones.get(opcion -1);
            } else {
                System.err.println("Opción inválida, intente de nuevo");
            }
        } catch ( InputMismatchException e ) {
            System.err.println("Opción inválida, intente de nuevo");
            
        } finally {
            sc.nextLine();
        }
        } while(respuesta == null);

        return respuesta;
    }

    public Integer leerValorEfectivo() {
        Integer respuesta = null;
        while (respuesta == null) {
            try {
                System.out.print("Ingrese valor de efectivo: ");
                respuesta = sc.nextInt();
                
            } catch ( InputMismatchException e ) {
                System.err.println("Valor inválida, intente de nuevo");
                
            } finally {
                sc.nextLine();
            }
        }
        return respuesta;
    }

    public void mostrarMensaje(String mensage) {
        System.out.println(mensage);
    }

    public void mostrarPedidos(Mesa mesa) {
        var opciones = mesa.getPedidos();
        System.out.println("Los pedidos son:");
            for (int i = 0; i < opciones.size(); i++) {
                System.out.printf("%d -> %s %n", (i+1), opciones.get(i));
            }

    }
    
}
