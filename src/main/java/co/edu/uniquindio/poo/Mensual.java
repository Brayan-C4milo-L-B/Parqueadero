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

    public Mensual(Moto moto, int MENSUAL, LocalDate ingreso) {
        this.moto = moto;
        this.MENSUAL = MENSUAL;
        this.ingreso = ingreso;
    }

    public int getMENSUAL() {
        return MENSUAL;
    }

    public LocalDate getIngreso() {
        return ingreso;
    }

    public void setIngreso(LocalDate ingreso) {
        this.ingreso = ingreso;
    }

    public void setMENSUAL(int mENSUAL) {
        MENSUAL = mENSUAL;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public static double calcularTarifa(Moto moto, LocalDate ingreso) {
        double resultado = 0;
        boolean bandera = false;
        for (Moto moto : motos) {
            if (moto.getTarifa() <= MENSUAL) {
                resultado = moto.getTarifa() * getIngreso();

            } else {
                bandera = true;

            }
            return resultado;
        }

    }

}
