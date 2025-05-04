package co.edu.uniquindio.poo;

/*
 * Clase secundaria que hereda de la clase principal llamada vehiculo
 */
public class Camion extends Vehiculo {

    /*
     * Atributo de la clase
     */
    private String carroceria;

    /**
     * Constructor con los atributos de la clase principal y propio
     *
     * @param color
     * @param modelo
     * @param placa
     * @param tarifa
     * @param carroceria
     */
    public Camion(String color, String modelo, String placa, double tarifa, String carroceria) {
        super(color, modelo, placa, tarifa);
        this.carroceria = carroceria;
    }

    /*
     * Metodo para obtener un dato
     */
    public String getCarroceria() {
        return carroceria;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    /*
     * Constructor con el toString
     */
    @Override
    public String toString() {
        return "Camion [\ncarroceria=" + carroceria + ", \ntoString()=" + super.toString() + "]";
    }

}
