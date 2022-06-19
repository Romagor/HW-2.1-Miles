public class Main {
    public static void main(String[] args) {

        int ticketPrice = 100;
        int minRubles = 20;

        int miles;
        if (ticketPrice >= 20) {
            miles = ticketPrice / minRubles;
        } else {
            miles = 0;
        }
        System.out.println(miles);
    }
}