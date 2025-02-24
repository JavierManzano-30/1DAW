public class Carta {
    private String nombre;
    private int ataque;
    private int defensa;
    private String posicion; // ataque, defensa, null
    private boolean oculto;

    public Carta(String nombre, int ataque, int defensa) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.posicion = null;
        this.oculto = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public boolean isOculto() {
        return oculto;
    }

    public void setOculto(boolean oculto) {
        this.oculto = oculto;
    }

    @Override
    public String toString() {
        return "Carta [nombre=" + nombre + ", ataque=" + ataque + ", defensa=" + defensa + ", posicion=" + posicion
                + ", oculto=" + oculto + "]";
    }

    public int atacar(Carta cartaEnemiga) {
        if (!this.posicion.equals("ataque")) {
            System.out.println("La carta no puede atacar si no está en posición de ataque");
            return 0;
        }

        if (cartaEnemiga.getPosicion().equals("ataque")) {
            return this.ataque - cartaEnemiga.getAtaque();
        }else if (cartaEnemiga.getPosicion().equals("defensa")) {
            return this.ataque - cartaEnemiga.getDefensa();
        }

        System.out.println("Error: la carta objetivo no está en el tablero");
        return 0;
    }
}