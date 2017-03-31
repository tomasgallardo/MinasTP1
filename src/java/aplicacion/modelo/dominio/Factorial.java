package aplicacion.modelo.dominio;

/**
 * @author Ariel Vega
 */
public class Factorial {                       // definición de la clase
    private int n;                             // definición del atributo n
    
    public void asignarValorN(int xN){         // método para asignar valor a n
        n = xN;                                // asignacion del parametro a n
    }                                          // fin del método asignarValorN()
    
    public int obtenerFactorial(){             // método obtenerFactorial 
        int valorFactorial = 1;                // define una variable 
        int auxiliar = n;                      // variable con el valor de n
        while(n >=1){                               // bucle mientras
            valorFactorial = valorFactorial * n;    
            n=n-1;
        }                                      // fin bucle mientras
        n=auxiliar;                            // n recupera valor original
        return valorFactorial;                 // el método devuelve factorial
    }                                          // fin método obtenerFactorial()
}                                              // fin de la clase Factorial
