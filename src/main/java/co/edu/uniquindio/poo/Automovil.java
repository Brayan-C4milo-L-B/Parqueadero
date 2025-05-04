package co.edu.uniquindio.poo;

/*
 * Clase secundaria que hereda de la clase principal llamada vehiculo
 */
public class Automovil extends Vehiculo {

    /*
     * Atributo de la clase
     */
    private int pasajeros;

    /**
     * Constructor con los atributos de la clase principal y propio
     *
     * @param color
     * @param modelo
     * @param placa
     * @param tarifa
     * @param pasajeros
     */
    public Automovil(String color, String modelo, String placa, double tarifa, int pasajeros) {
        super(color, modelo, placa, tarifa);
        this.pasajeros = pasajeros;
    }

    /*
     * Metodo para obtener un dato
     */
    public int getPasajeros() {
        return pasajeros;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    /*
     * Constructor con el toString
     */
    @Override
    public String toString() {
        return "Automovil [\npasajeros=" + pasajeros + ", \ntoString()=" + super.toString() + "]";
    }

}
