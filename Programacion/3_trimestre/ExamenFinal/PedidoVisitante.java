import java.util.ArrayList;
import java.util.List;

public class PedidoVisitante extends Visitante{

    public PedidoVisitante(String nombre, int edad, double altura, boolean esVip, String provinciaOrigen) {
        super(nombre, edad, altura, esVip, provinciaOrigen);
    }
    
    List<TipoProducto> lista = new ArrayList<>();

    public void agregarProducto(Producto p) {   //TODO
        lista.add(p.tipo);
    }

    public void calcularTotal(List lista) {   //TODO
        double precioFinal = 0;
        try {
            if (lista.size() == 2) {
                precioFinal = 1.50;
            }else if (lista.size() > 4) {
                
            }
        } catch (Exception e) {
            
        }
    }

    public String resumenPedido() {
        return "Lista: " + lista + "| subtotal: " + "no entiendo";
    }
}
