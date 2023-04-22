public class DriverVehiculo {

    public static void main(String[]args){
        Camion camion = new Camion("Diesel",3);
        System.out.println(camion.encender());
        camion.avanzar();
        camion.frenar();
        System.out.println(camion.apagar());
        System.out.println("-----motocicleta-----");
        Motocicleta moto = new Motocicleta(150,"Yamaha");
        System.out.println(moto);
        moto.encender();
        moto.avanzar();
        moto.hacerCaballito();
        moto.frenar();
        moto.apagar();
    }

}
