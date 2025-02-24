public class Main {
    public static void main(String[] args) {
        Vehiculo coche = new Coche("Toyota", "Corolla", 2021, 20000, 4, 4);
        Vehiculo moto = new Moto("Yamaha", "FZ", 2021, 10000, 2);
        
        coche.CuantasRuedas();
        coche.CuantasPuertas();
        
        moto.CuantasRuedas();
        moto.CuantasPuertas();
    }
}