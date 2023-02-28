public class Gato {

    //Creación de las variables

    private String especie;
    private String pelaje;

    private String color;

    private int edad;

    private String nombre;

    public Gato() {
    }

    //Creación del contructor sobrecargado completo

    public Gato(String especie, String pelaje, String color, int edad, String nombre) {
        this.especie = especie;
        this.pelaje = pelaje;
        this.color = color;
        this.edad = edad;
        this.nombre = nombre;
    }

    /*public Gato(String especie, String nombre) {
        this.especie = especie;
        this.nombre = nombre;
    }
     */

    //Getters and Setters

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //ToString

    @Override
    public String toString() {
        return "Gato{" +
                "especie='" + especie + '\'' +
                ", pelaje='" + pelaje + '\'' +
                ", color='" + color + '\'' +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    //Metodos

    public boolean dormir(){
        System.out.println(nombre + " se esta durminedo!!!");
        boolean dormido = Math.random() > 0.5;
        return dormido;
    }

    public boolean ronronear(){
        System.out.println("Su pelaje es "+ pelaje + " y " + color + "y esta ronroneando!!!");
        boolean ronroneando = Math.random() > 0.5;
        return ronroneando;
    }

    public boolean feliz(){
        System.out.println(nombre + " tiene " + edad + " años " + "y esta feliz!!!");
        boolean felicidad = Math.random() > 0.5;
        return felicidad;
    }

}
