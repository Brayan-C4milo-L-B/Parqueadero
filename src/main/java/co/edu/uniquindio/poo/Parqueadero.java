package co.edu.uniquindio.poo;

import java.util.ArrayList;

/*
 * Clase principal donde se ejecutan la mayoria de las funciones del programa
 */
public class Parqueadero {

    /*
     * Unicos atributos de la clase y relacion de las demas clases con esta
     */
    private String nombre, contacto;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Cliente> clientes;

    /**
     * Constructor con los atributos de la clase y la relacion de las demas
     * clases
     *
     * @param contacto
     * @param nombre
     * @param vehiculos
     */
    public Parqueadero(String contacto, String nombre, ArrayList<Vehiculo> vehiculos, ArrayList<Cliente> clientes) {
        this.contacto = contacto;
        this.nombre = nombre;
        this.vehiculos = vehiculos;
        this.clientes = clientes;
    }

    /*
     * Metodo para obtener un dato
     */
    public String getNombre() {
        return nombre;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*
     * Metodo para obtener un dato
     */
    public String getContacto() {
        return contacto;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    /*
     * Metodo para obtener un dato
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    /*
     * Metodo para obtener un dato
     */
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    /*
     * Metodo para crear un automovil
     */
    public static void crearVehiculo(String color, String modelo, String placa, double tarifa, int pasajeros) {
        Vehiculo.add(new Automovil(color, modelo, placa, tarifa, pasajeros));

    }

    /*
     * Metodo para crear una moto
     */
    public static void crearVehiculo(String color, String modelo, String placa, double tarifa, float llantas) {
        Vehiculo.add(new Moto(color, modelo, placa, tarifa, llantas));

    }

    /*
     * Metodo para crear un camion
     */
    public static void crearVehiculo(String color, String modelo, String placa, double tarifa, String carroceria) {
        Vehiculo.add(new Camion(color, modelo, placa, tarifa, carroceria));
    }

    /*
     * Metodo para verificar la existencia de una placa en el sistema
     */
    public boolean verificarVehiculo(String placa) {
        boolean centinela = false;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                centinela = true;
            }
        }
        return centinela;

    }


    /*
    * Metodo para eliminar un vehiculo
     */
    public void eliminarVehiculo(String placa) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                vehiculo.remove(vehiculo);
                break;

            }
        }
    }

    /*
        *Metodo para verificar un cliente
     */
    public boolean verificarCliente(String nombre) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equals(nombre)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
    *Metodo para eliminar un cliente
     */
    public void eliminarCliente(String nombre) {
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equals(nombre)) {
                cliente.remove(cliente);
                break;

            }
        }
    }

    /*
    *Metodo para agregar un cliente
     */
    public void agregarCliente(Cliente cliente) {
        if (!verificarCliente(cliente.getNombre())) {
            cliente.add(cliente);
        }
    }

}
