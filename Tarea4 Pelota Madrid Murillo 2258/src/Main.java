public class Main {
    public static void main(String[] args) {

        Pelota ball = new Pelota("Americano", 3, "Cafe", "Puma", 500);
        System.out.println(ball.lanzar());
        System.out.println(ball.agarrar());
        System.out.println(ball.desinflar());
        System.out.println(ball);
    }
}