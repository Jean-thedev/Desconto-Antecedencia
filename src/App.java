public class App {
    public static void main(String[] args) throws Exception {
       Reserva r1 = new Reserva("Jean", "24/09/2029", 1, 250);
       Reserva r2 = new Reserva("Laila", "25/09/2029", 5, 250);
       Reserva r3 = new Reserva("Gabe", "26/09/2029", 10, 250);
       Reserva r4 = new Reserva("John", "27/09/2029", 20, 250);

       System.out.println(r1.calcularValorFinal());
       r1.dadosReserva();
       System.out.println();

       System.out.println(r2.calcularValorFinal());
       r2.dadosReserva();
       System.out.println();

       System.out.println(r3.calcularValorFinal());
       r3.dadosReserva();
       System.out.println();

       System.out.println(r4.calcularValorFinal());
       r4.dadosReserva();
       System.out.println();







    }
}
