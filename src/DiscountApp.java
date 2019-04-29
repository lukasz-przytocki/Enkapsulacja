public class DiscountApp {
    public static void main(String[] args) {
        Client client1 = new Client("Jan", "Kowalski",true);
        double price1 = 1100;

        Client client2 = new Client("Karol", "Nowak", false);
        double price2 = 1100;

    DiscountService discountService = new DiscountService();
    double discount1 = discountService.calculateDiscountPrice(client1,price1);
    double discount2 = discountService.calculateDiscountPrice(client2,price2);

        System.out.println("Witaj " + client1.getFirstName() + " " + client1.getLastName());
        System.out.println("Kwota przed rabatem: " + price1);
        System.out.println("Kowota po rabacie: "+ discount1 +"\n");

        System.out.println("Witaj " + client2.getFirstName() + " " + client2.getLastName());
        System.out.println("Kwota przed rabatem: " + price2);
        System.out.println("Kowota po rabacie: "+ discount2);

    }



}
