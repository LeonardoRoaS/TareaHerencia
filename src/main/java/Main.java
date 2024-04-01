public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        //Inicializo las habitaciones
        cliente.inicializarHabitaciones();
        cliente.mostrarHabitaciones();

        //Testeo codigo
        cliente.reservarHabitacion(1);
        cliente.reservarHabitacion(2);
        cliente.reservarHabitacion(4);

        cliente.cancelarReserva(2);

        cliente.mostrarHabitaciones();
    }
}
