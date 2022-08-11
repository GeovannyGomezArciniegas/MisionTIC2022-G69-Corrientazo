package co.edu.utp.misiontic.geovanny.vista;

import java.util.InputMismatchException;
import java.util.Scanner;

import co.edu.utp.misiontic.geovanny.controlador.RestauranteControlador;
import co.edu.utp.misiontic.geovanny.modelo.Corrientazo;
import co.edu.utp.misiontic.geovanny.modelo.OpcionCarne;
import co.edu.utp.misiontic.geovanny.modelo.OpcionEnsalada;
import co.edu.utp.misiontic.geovanny.modelo.OpcionJugo;
import co.edu.utp.misiontic.geovanny.modelo.OpcionPrincipio;
import co.edu.utp.misiontic.geovanny.modelo.OpcionSopa;
import co.edu.utp.misiontic.geovanny.modelo.Pedido;

public class PedidoVista {
    
    private static final int PRECIO_CORRIENTAZO = 12_000;
    private Scanner sc;
    private RestauranteControlador controlador;

    public PedidoVista(Scanner sc, RestauranteControlador controlador) {
        this.sc = sc;
        this.controlador = controlador;

    }

    public Pedido pedirInformacionPedido() {
        System.out.println(".: INGRESANDO EL PEDIDO :.");

        System.out.print("Ingrese nombre (Descripción) del cliente: ");
        var cliente = sc.nextLine();
        var sopa = elegirOpcionSopa();
        var principio = elegirOpcionPrincipio();
        var carne = elegirOpcionCarne();
        var ensalada = elegirOpcionEnsalada();
        var jugo = elegirOpcionJugo();
        return new Pedido(cliente, 
            new Corrientazo(PRECIO_CORRIENTAZO, sopa, principio, carne, ensalada, jugo));
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    private OpcionSopa elegirOpcionSopa() {
        System.out.println(".: ELIJA LA SOPA :.");

        //System.out.println("Las mesas existentes son:"); **esta porcion de codigo sobra

        var opciones = controlador.getSopas();
        OpcionSopa respuesta = null;

        do {
        try {
        System.out.println("Las sopas existentes son:");
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

    private OpcionPrincipio elegirOpcionPrincipio() {
        System.out.println(".: ELIJA PRINCIPIO :.");

        //System.out.println("Las mesas existentes son:"); **esta porcion de codigo sobra

        var opciones = controlador.getPrincipios();
        OpcionPrincipio respuesta = null;

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

    private OpcionCarne elegirOpcionCarne() {
        System.out.println(".: ELIJA LA CARNE :.");

        //System.out.println("Las mesas existentes son:"); **esta porcion de codigo sobra

        var opciones = controlador.getCarnes();
        OpcionCarne respuesta = null;

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

    private OpcionEnsalada elegirOpcionEnsalada() {
        System.out.println(".: ELIJA ENSALADA :.");

        //System.out.println("Las mesas existentes son:"); **esta porcion de codigo sobra

        var opciones = controlador.getEnsaladas();
        OpcionEnsalada respuesta = null;

        do {
        try {
        System.out.println("Las opciones son:");
        System.out.printf("%d -> %s %n", 0, "Sin ensalada");
        for (int i = 0; i < opciones.size(); i++) {
            System.out.printf("%d -> %s %n", (i+1), opciones.get(i));
        }
        System.out.print("Cual es su opción: ");
        var opcion = sc.nextInt();
        if (opcion == 0) {
            break;
        }
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

    private OpcionJugo elegirOpcionJugo() {
        System.out.println(".: ELIJA JUGO :.");

        //System.out.println("Las mesas existentes son:"); **esta porcion de codigo sobra

        var opciones = controlador.getJugos();
        OpcionJugo respuesta = null;

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
}
