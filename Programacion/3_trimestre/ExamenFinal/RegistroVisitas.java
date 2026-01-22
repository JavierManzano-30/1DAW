import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.classfile.BufWriter;
import java.time.LocalDate;
import java.util.Date;
import java.util.TimeZone;

public class RegistroVisitas {
    
    public LocalDate fecha;
    public TimeZone hora;
    public String tipoEvento;
    public String descripcion;
    
    private static final String SEPARADOR = ";";

    public RegistroVisitas(LocalDate fecha, TimeZone hora, String tipoEvento, String descripcion) {
        this.fecha = fecha;
        this.hora = hora;
        this.tipoEvento = tipoEvento;
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public TimeZone getHora() {
        return hora;
    }

    public void setHora(TimeZone hora) {
        this.hora = hora;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public static void guardarEvento(String tipoEvento, String descripcion) throws IOException{
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("\\archivo\\visitas.csv"))){
            bw.write(this.hora + "\n");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void mostrarHistorial() {
        try (BufferedReader br = new BufferedReader("\\archivo\\visitas.csv")){
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(SEPARADOR);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
