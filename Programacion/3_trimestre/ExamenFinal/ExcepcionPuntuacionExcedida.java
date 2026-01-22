public class ExcepcionPuntuacionExcedida{
    
    static class puntuacionExcedida extends Exception{
        public puntuacionExcedida(String mensaje) {
            super(mensaje);
        }
    }
}
