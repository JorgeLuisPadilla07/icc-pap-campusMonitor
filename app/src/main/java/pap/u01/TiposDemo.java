package pap.u01;

public class TiposDemo {

    public static void main(String[] args) {
        Caja<String> lugar = new Caja<>("Lab6");
        Caja<Integer> limite = new Caja<>(30);
        Caja<Sensor> device = new Caja<>(new Sensor("s01", lugar.obtener()));

        System.out.println("Lugar: " + lugar.obtener());
        System.out.println("Límite: " + limite.obtener());
        System.out.println("Sensor: " + device.obtener());
        System.out.println("Sensor: " + device.obtener().id() + " - " + device.obtener().ubicacion());
    }
}
