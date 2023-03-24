public class MaquinaCafe {

    //Atributos
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;

    //Constructor por defecto
    public MaquinaCafe() {
        this.agua = 5000;
        this.cafe = 1000;
        this.crema = 1500;
        this.vasos = 50;
    }

    //Constructor sobrecargado
    public MaquinaCafe(int agua, int cafe, int crema, int vasos) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
    }

    //Getters and Setters
    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        this.crema = crema;
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;
    }

    //ToString
    @Override
    public String toString() {
        return "MaquinaCafe{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vasos=" + vasos +
                '}';
    }

    //Metodos

    //Servir cafeAmericano
    public void hacerAmericado(){
    if(this.agua >= 180 && this.cafe >= 15 && this.vasos > 0) {
        this.agua -= 180;
        this.cafe -= 15;
        this.vasos--;
        System.out.println("Se ha servido un cafe americano :)");
     }else{
        System.out.println("Lo sentimos no se puede servir más cafe :(");
     }
    }

    //Servir cafeExpreso
    public void hacerExpreso(){
        if(this.agua >= 120 && this.cafe >= 20 && this.vasos > 0) {
            this.agua -= 120;
            this.cafe -= 20;
            this.vasos--;
            System.out.println("Se ha servido un cafe expreso :)");
        }else{
            System.out.println("Lo sentimos no se puede servir más cafe :(");
        }
    }

    //Servir capuchino
    public void hacerCapuchino(){
        if(this.agua >= 100 && this.cafe >= 70 && this.crema >= 14 && this.vasos > 0) {
            this.agua -= 100;
            this.cafe -= 70;
            this.crema -= 14;
            this.vasos--;
            System.out.println("Se ha servido un cafe expreso :)");
        }else{
            System.out.println("Lo sentimos no se puede servir más cafe :(");
        }
    }

    //cantidadIngredientes
    public void cantidadIngredientes(){
        System.out.println();
        System.out.println("Agua restante: " + this.agua + " ml");
        System.out.println("Cafe restante: " + this.cafe + " g");
        System.out.println("Crema restante: " + this.crema + " ml");
        System.out.println("Vasos restantes: " + this.vasos );
    }
}


