package co.edu.uniquindio.poo;

import java.time.LocalDate;

/*
 * Clase para calcular el costo de la mensualidad
 */
public abstract class Mensual extends Membresia {

    /*
     * Atributos de la clase para calcular la tarifa mensual
     */
    private int MENSUAL = 30;
    private LocalDate ingreso;
    private Moto moto;

    /*
     * Constructor con los atributos de la clase
     */
    public Mensual(Moto moto, int MENSUAL, LocalDate ingreso) {
        this.moto = moto;
        this.MENSUAL = MENSUAL;
        this.ingreso = ingreso;
    }

    /*
     * Metodo para obtener un dato
     */
    public int getMENSUAL() {
        return MENSUAL;
    }

    /*
     * Metodo para obtener un dato
     */
    public LocalDate getIngreso() {
        return ingreso;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setIngreso(LocalDate ingreso) {
        this.ingreso = ingreso;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setMENSUAL(int mENSUAL) {
        MENSUAL = mENSUAL;
    }

    /*
     * Metodo para obtener un dato
     */
    public Moto getMoto() {
        return moto;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setMoto(Moto moto) {
        this.moto = moto;
    }

}
