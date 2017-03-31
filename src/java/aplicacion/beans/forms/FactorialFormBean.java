package aplicacion.beans.forms;

import aplicacion.modelo.dominio.Factorial;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class FactorialFormBean {
    private int n;
   
    public FactorialFormBean() {
    }

    public int calcularFactorial(){
        Factorial factorial = new Factorial();
        factorial.asignarValorN(n);
        return factorial.obtenerFactorial();
    }
    
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
}
