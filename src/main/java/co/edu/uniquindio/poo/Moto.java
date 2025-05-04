package co.edu.uniquindio.poo;

/*
 * Clase secundaria que hereda de la clase principal llamada vehiculo
 */
public class Moto extends Vehiculo {

    /*
     * Atributo unico de la clase
     */
    private float llantas;

    /**
     * Constrcutor con los atributos de la clase principal y prorpio
     *
     * @param color
     * @param modelo
     * @param placa
     * @param tarifa
     * @param llantas
     */
    public Moto(String color, String modelo, String placa, double tarifa, float llantas) {
        super(color, modelo, placa, tarifa);
        this.llantas = llantas;

    }

    /*
     * Metodo para obtener un dato
     */
    public float getLlantas() {
        return llantas;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setLlantas(float llantas) {
        this.llantas = llantas;
    }

    /*
     * Constructor con el toString
     */
    @Override
    public String toString() {
        return "Moto [\nllantas=" + llantas + ", \ntoString()=" + super.toString() + "]";
    }

}
