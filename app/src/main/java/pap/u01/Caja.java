package pap.u01;

import java.util.function.Function;

//Clase generica
public class Caja<T> {
    private final T valor;

    public Caja(T valor) {
        this.valor = valor;
    }

    //Metodo generico
    //Getter
    public T obtener() {
        return valor;
    }

    //Metodo generico
    public <R> R mapear(Function<T, R> operacion) {
        R resultado = operacion.apply(valor);
        return resultado;
    }

    public int mapear2() {
        return ((String) valor).length();
    }
}
