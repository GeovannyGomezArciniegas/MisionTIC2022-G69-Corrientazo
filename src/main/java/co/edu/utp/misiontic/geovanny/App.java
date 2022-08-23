package co.edu.utp.misiontic.geovanny;

import java.util.Scanner;

import co.edu.utp.misiontic.geovanny.controlador.RestauranteControlador;

/**
 * Hello world!
 */
public final class App {
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
                var  controlador = new RestauranteControlador(sc);
                controlador.iniciarAplicacion();
        } catch (Exception e){
                System.err.println("Ocurrio un error en la aplicación!!");
                System.err.println("\t" + e.getMessage());
        }
        
    }
}
