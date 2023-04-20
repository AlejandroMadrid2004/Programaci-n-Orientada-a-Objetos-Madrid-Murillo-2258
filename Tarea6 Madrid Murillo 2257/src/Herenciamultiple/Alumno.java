package Herenciamultiple;

public class Alumno extends Persona{

    private int numerCuenta;
    private String carrera;
    private double promedio;

    public Alumno() {
    }

    public Alumno(String nombre, int edad, int numerCuenta, String carrera, double promedio) {
        super(nombre, edad);
        this.numerCuenta = numerCuenta;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public int getNumerCuenta() {
        return numerCuenta;
    }

    public void setNumerCuenta(int numerCuenta) {
        this.numerCuenta = numerCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "numerCuenta=" + numerCuenta +
                ", carrera='" + carrera + '\'' +
                ", promedio=" + promedio +
                '}';
    }
}
