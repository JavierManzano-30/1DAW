public class Boxeador extends Participante{
    enum CategoriaPeso {
        PESO_PLUMA,
        PESO_LIGERO,
        PESO_MEDIO,
        PESO_PESADO
    }
    
    private String nacionalidad;
    private int potencia;
    private int resistencia;
    private int velocidad;
    private double peso;
    private CategoriaPeso categoria;
    
    public Boxeador(String nombre, int edad, String nacionalidad, int potencia, int resistencia, int velocidad, double peso, CategoriaPeso categoria) {
        super(nombre, edad);
        this.nacionalidad = nacionalidad;
        this.potencia = potencia;
        this.resistencia = resistencia;
        this.velocidad = velocidad;
        this.peso = peso;
        this.categoria = categoria;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public CategoriaPeso getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaPeso categoria) {
        this.categoria = categoria;
    }

    public CategoriaPeso calcularCategoria() {
        if (getPeso() <= 57.0) {
            return CategoriaPeso.PESO_PLUMA;
        }else if (getPeso() > 57.1 && getPeso() < 70) {
            return CategoriaPeso.PESO_LIGERO;
        }else if (getPeso() > 70.1 && getPeso() < 85) {
            return CategoriaPeso.PESO_MEDIO;
        }else {
            return CategoriaPeso.PESO_PESADO;
        }
    }
    
    public void recibirGolpe(int potencia) {
        this.resistencia -= (potencia * 10) / 100;
    }

    public boolean estaDerrotado() {
        if (this.resistencia == 0) {
            return true;
        }else {
            return false;
        }
    }

    public boolean esquivarGolpe() {
        int numeroAleatorio = (int)(Math.random()*100+1);
        int porcentajeVelocidad = (this.velocidad * numeroAleatorio) / 100;
        int porcentajeExperiencia = (this.resistencia * numeroAleatorio) / 100;
        if (porcentajeVelocidad > 40) {
            return false;
        }else if (porcentajeExperiencia > 50) {
            return false;
        }else {
            return true;
        }
    }

    public void mejorarEstadisticas() {
        int porcentajePotencia = 0;
        if (getResistencia() > 80 && getResistencia() < 100) {
            porcentajePotencia = 7;
        }else if (getResistencia() > 60 && getResistencia() < 100) {
            porcentajePotencia = 6;
        }else if (getResistencia() > 40 && getResistencia() < 100) {
            porcentajePotencia = 5;
        }else if (getResistencia() > 20 && getResistencia() < 100) {
            porcentajePotencia = 4;
        }else if (getResistencia() >= 1 && getResistencia() < 100) {
            porcentajePotencia = 3;
        }
        this.potencia = (potencia * porcentajePotencia) / 100;
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + getNombre() + ", velocidad: " + getVelocidad() + ", resistencia: " + getResistencia() + " y potencia: " + getPotencia());
    }

    @Override
    public String toString() {
        return "Boxeador [nacionalidad=" + nacionalidad + ", potencia=" + potencia + ", resistencia=" + resistencia
                + ", velocidad=" + velocidad + ", peso=" + peso + ", categoria=" + categoria + "]";
    }
    
    @Override
    public void Presentarse() {
        System.out.println("Soy " + getNombre() + ", boxeador de " + getNacionalidad() + " y compito en " + calcularCategoria());
    }
    
}
