package pap.u01;

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
}
