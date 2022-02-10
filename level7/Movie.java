public class Movie {
    public static int movie(int card, int ticket, double perc) {
        double prev = ticket;
        double cardPrice = card;
        int priceTicket = 0;
        int count = 0;

        do{
            priceTicket+=ticket;
            prev*=perc;
            System.out.println(prev);
            cardPrice+=prev;
            count++;
        }while(priceTicket<cardPrice);

        return count;
    }

    public static void main(String[] args) {
        System.out.println(movie(500, 15, 0.9) );
    }
}
