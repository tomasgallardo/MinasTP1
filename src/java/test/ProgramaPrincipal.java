package test;

import aplicacion.modelo.dominio.Factorial;

/**
 * @author Ariel Vega
 */
public class ProgramaPrincipal {                        // define la clase
    
    // JAVA utiliza el método para ejecutar una aplicación desde consola
    public static void main(String[] args) {    // el metodo posee argumentos 
        // En la siguente línea ProgramaPrincipal invoca el método mostrarFac...
        ProgramaPrincipal.mostrarFactorialDeUnNumero(); 
    }   // fin del método main
    
    public static void mostrarFactorialDeUnNumero(){    // define el método
        // se crea un objeto de la clase Factorial denominado unFactorial
        Factorial unFactorial = new Factorial();    
        unFactorial.asignarValorN(5); // se invoca el método asignarValor()
        // se invoca el método obtenerFactorial de unFactorial y se asigna 
        // el resultado a valorFactorial
        int valorFactorial = unFactorial.obtenerFactorial();
        // se muestra por consola el resultado obtenido
        System.out.println("El factorial es "+valorFactorial);
    } // fin del método mostrarFactorialDeUnNumero
    
}   // Fin de la clase
