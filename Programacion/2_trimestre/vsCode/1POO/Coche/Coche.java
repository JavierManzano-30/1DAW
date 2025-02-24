public class Coche {
    private String matricula;
    private String marca;
    private String modelo;
    private int deposito;
    private int capacidad;
    private double consumo;

    public Coche (String matricula,
    String marca,
    String modelo,
    int capacidad,
    double consumo,
    int deposito) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.deposito = deposito;
        this.capacidad = capacidad;
        this.consumo = consumo;

    }

    public String getMatricula(){
        return this.matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getDeposito(){
        return this.deposito;
    }

    private void setDeposito (int deposito){
        if (deposito < 0) {
            this.deposito = 0;
        }
        else if (deposito > 100){
            this.deposito = 100;
        }
        else {
            this.deposito = deposito;
        }
    }
    
    public void LlenarDeposito (int gasolinaEchada) {
        this.deposito = 100;
    }

    public void HacerKm (int kilometros) {
        int consumo = kilometros / 10;
        if (consumo > this.deposito) {
            System.out.println("No hay gasolina.");
        }

        this.setDeposito(this.deposito - consumo);
    }

    public double CalcularConsumo (double kilometros, double litros){
        double consumo = kilometros / litros;
        return consumo;
    }

    @Override
    public String toString() {
        return this.matricula + ", " + this.marca + ", " + this.modelo + ", " + this.deposito;
    }
}