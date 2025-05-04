package co.edu.uniquindio.poo;

/*
 * Clase principal
 */
public class Vehiculo {

    /*
     * Atributos de la clase
     */
    private String placa, color, modelo;
    private double tarifa;

    /**
     * Constructor con los atributos de la clase
     *
     * @param color
     * @param modelo
     * @param placa
     * @param tarifa
     */
    public Vehiculo(String color, String modelo, String placa, double tarifa) {
        this.color = color;
        this.modelo = modelo;
        this.placa = placa;
        this.tarifa = tarifa;
    }

    /*
     * Metodo para obtener un dato
     */
    public String getPlaca() {
        return placa;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /*
     * Metodo para obtener un dato
     */
    public String getColor() {
        return color;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setColor(String color) {
        this.color = color;
    }

    /*
     * Metodo para obtener un dato
     */
    public String getModelo() {
        return modelo;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /*
     * Metodo para obtener un dato
     */
    public double getTarifa() {
        return tarifa;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    /*
     * Constructor con el toString
     */
    @Override
    public String toString() {
        return "Vehiculo [\nplaca=" + placa + ", \ncolor=" + color + ", \nmodelo=" + modelo + ", \ntarifa=" + tarifa + "]";
    }

    /*
     * Metodo para crear un vehiculo
     */
    public static void add(Camion camion) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    /*
     * Metodo para agregar una moto
     */
    public static void add(Moto moto) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    /*
     * Metodo para agregar un automovil
     */
    public static void add(Automovil automovil) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    /*
     * Metodo para remover vehiculo
     */
    public void remove(Vehiculo vehiculo) {
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

}
