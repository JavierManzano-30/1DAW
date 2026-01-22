import java.util.Iterator;
import java.util.List;

public class Parque {

    List<Visitante> visitantes;
    List<Atraccion> atracciones;
    List<PedidoVisitante> pedidos;
    List<Juego> juegos;
    List<Participacion> participaciones;

    public void simularDia() {
        visitantes.add(new Visitante("Javier", 24, 1.74, true, "Sevilla"));
        visitantes.add(new Visitante("Victor", 26, 1.80, false, "Madrid"));
        visitantes.add(new Visitante("Antonio", 25, 1.71, true, "Moscú"));

        Iterator<Visitante> nombreIterator = visitantes.iterator();
        while (nombreIterator.hasNext()) {
            Visitante elemento = nombreIterator.next();
            System.out.print(elemento + " / ");
        }

        visitantes.
    }
}
