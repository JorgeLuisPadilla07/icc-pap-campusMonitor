package pap.modelo;
import java.util.function.Function;

public class Lectura<T> {
    private String idSensor;
    private T valor;
    private String unidad;

    public Lectura(String idSensor, T valor, String unidad) {
        this.idSensor = idSensor;
        this.valor = valor;
        this.unidad = unidad;
    }

    public String getIdSensor() {
        return idSensor;
    }

    public T getValor() {
        return valor;
    }

    public String getUnidad() {
        return unidad;
    }

    public <R> Lectura<R> transformar(Function<T, R> conversor, String nuevaUnidad) {
        R nuevoValor = conversor.apply(valor);
        return new Lectura<>(idSensor, nuevoValor, nuevaUnidad);
    }
}
