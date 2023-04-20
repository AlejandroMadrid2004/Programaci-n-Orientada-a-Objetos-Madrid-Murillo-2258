package Herenciamultiple;

public class AlumnoDeportistaArtista extends Alumno implements Deportista,Artista{

    private int idActivExtra;
    private String deporte;
    private String arte;

    public AlumnoDeportistaArtista() {
    }

    public AlumnoDeportistaArtista(String nombre, int edad, int numerCuenta, String carrera, double promedio, int idActivExtra, String deporte, String arte) {
        super(nombre, edad, numerCuenta, carrera, promedio);
        this.idActivExtra = idActivExtra;
        this.deporte = deporte;
        this.arte = arte;
    }

    public int getIdActivExtra() {
        return idActivExtra;
    }

    public void setIdActivExtra(int idActivExtra) {
        this.idActivExtra = idActivExtra;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getArte() {
        return arte;
    }

    public void setArte(String arte) {
        this.arte = arte;
    }

    @Override
    public String toString() {
        return super.toString() +
                "AlumnoDeportistaArtista{" +
                "idActivExtra=" + idActivExtra +
                ", deporte='" + deporte + '\'' +
                ", arte='" + arte + '\'' +
                '}';
    }

    @Override
    public int ensayar(String disciplina) {
        System.out.println("El alumno esta ensayando " + this.arte);
        return 2;
    }

    @Override
    public boolean presentarObra() {
        System.out.println(getNombre() + " Esta presentando su obra...");
        return true;
    }

    @Override
    public int entrenar() {
        System.out.println(getNombre() + " esta entrenando el deporte " + deporte);
        return 2;
    }

    @Override
    public boolean presentarCompetencia(String ubicacion) {
        System.out.println(getNombre() + " esta en competencia del deporte " + deporte);
        return true;
    }
}
