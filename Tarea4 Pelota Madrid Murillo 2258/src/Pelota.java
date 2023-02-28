public class Pelota {

     private String tipo;

     private int tamaño;

     private String color;

     private String marca;

     private int precio;

     public Pelota() {

     }

     //Creación de el contructor sobrecargado

     public Pelota(String tipo, int tamaño, String color, String marca, int precio) {
          this.tipo = tipo;
          this.tamaño = tamaño;
          this.color = color;
          this.marca = marca;
          this.precio = precio;
     }

     //Getters and Setters

     public String getTipo() {
          return tipo;
     }

     public void setTipo(String tipo) {
          this.tipo = tipo;
     }

     public float getTamaño() {
          return tamaño;
     }

     public void setTamaño(int tamaño) {
          this.tamaño = tamaño;
     }

     public String getColor() {
          return color;
     }

     public void setColor(String color) {
          this.color = color;
     }

     public String getMarca() {
          return marca;
     }

     public void setMarca(String marca) {
          this.marca = marca;
     }

     public float getPrecio() {
          return precio;
     }

     public void setPrecio(int precio) {
          this.precio = precio;
     }

     //ToString

     @Override
     public String toString() {
          return "Pelota{" +
                  "tipo='" + tipo + '\'' +
                  ", tamaño=" + tamaño +
                  ", color='" + color + '\'' +
                  ", marca='" + marca + '\'' +
                  ", precio=" + precio +
                  '}';
     }

     //Metodos

     public boolean lanzar() {
          System.out.println("Haz lanzado a la pelota de " + tipo + " al aire!!!");
          boolean lanzado = Math.random() > 0.5;
          return lanzado;
     }

     public boolean agarrar() {
          System.out.println("Haz agarrado a la pelota de " + tamaño + "mts" + " y de color " + color);
          boolean agarrando = Math.random() > 0.5;
          return agarrando;
     }

     public boolean desinflar() {
          System.out.println("Haz desinflado a la pelota de marca" + marca + ", esta cuesta  $" + precio);
          boolean reposo = Math.random() > 0.5;
          return reposo;
     }


}
