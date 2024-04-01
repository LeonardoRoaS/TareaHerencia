import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private List<Habitacion> habitaciones;

    public Cliente() {
        this.habitaciones = new ArrayList<Habitacion>();
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void inicializarHabitaciones(){
        Habitacion habitacion1 = new Habitacion(1, "Disponible", "Simple");
        Habitacion habitacion2 = new Habitacion(2, "Disponible", "Doble");
        Habitacion habitacion3 = new Habitacion(3 , "Reservado", "Suite");
        Habitacion habitacion4 = new Habitacion(4 , "En limpieza", "Suite");

        this.habitaciones.add(habitacion1);
        this.habitaciones.add(habitacion2);
        this.habitaciones.add(habitacion3);
        this.habitaciones.add(habitacion4);
    }

    public void mostrarHabitaciones(){
        System.out.println("Habitaciones :");
        for (Habitacion habitacion : this.habitaciones){
            System.out.println(habitacion);
        }
    }

    public boolean reservarHabitacion(int numero){
        for (Habitacion habitacion : this.habitaciones){
            Habitacion habitacionAgregar = new Habitacion(numero,"Reservado", habitacion.getTipo());
            if (habitacion.getNumero() == numero && habitacion.getEstado().equalsIgnoreCase("Disponible")){
                this.habitaciones.set(numero-1, habitacionAgregar);
                System.out.println("La habitacion "+numero+" se ha reservado.");
                return true;
            }
        }
        System.out.println("La habitación "+numero+" no está disponible.");
        return false;
    }

    public boolean cancelarReserva(int numero){
        for (Habitacion habitacion : this.habitaciones){
            Habitacion habitacionCancelar = new Habitacion(numero, "Disponible", habitacion.getTipo());
            if (habitacion.getNumero() == numero && habitacion.getEstado().equalsIgnoreCase("Reservado")){
                this.habitaciones.set(numero-1, habitacionCancelar);
                System.out.println("La reserva de la habitacion "+numero+" se ha cancelado");

                return true;
            }
        }
        return false;
    }


}
