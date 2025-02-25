import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IVehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Autobus(50, "Del centro al Aeropuerto", 120, 15, 2.20));
        vehiculos.add(new Tranvia(100, "Hacia Ecija", 170, false, "Tres"));

        for (IVehiculo vehiculo : vehiculos) {
            vehiculo.mostrarInformacion();
            vehiculo.arrancar();
            vehiculo.parar();
        }
    }
}