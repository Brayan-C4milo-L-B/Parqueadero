package co.edu.uniquindio.poo;

/*
 * Clase principal para relacionar los datos de un usuario con un vehichulo
 */
public class Cliente {

    /*
     * Atributos de la clase
     */
    private String nombre, telefono, id, correo;

    /**
     * Constructor con los atributos de la clase
     *
     * @param nombre
     * @param telefono
     * @param id
     * @param correo
     */
    public Cliente(String nombre, String telefono, String id, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.id = id;
        this.correo = correo;
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
    public String getTelefono() {
        return telefono;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /*
     * Metodo para obtener un dato
     */
    public String getId() {
        return id;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setId(String id) {
        this.id = id;
    }

    /*
     * Metodo para obtener un dato
     */
    public String getCorreo() {
        return correo;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /*
     * Constructor con el toString
     */
    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", \ntelefono=" + telefono + ", \nid=" + id + ", \ncorreo=" + correo + "]";
    }

    /*
     * Metodo para eliminar un cliente
     */
    public void remove(Cliente cliente) {
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    /*
     * Metodo para agregar un cliente
     */
    public void add(Cliente cliente) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}
