public class TasteTester {

    public static void main(String[] args) {
        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setCandles(12);
        birthdayCake.setFlavor("lavendar");
        birthdayCake.setPrice(12000);

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setTiers(6);
        weddingCake.setFlavor("glamour");
        weddingCake.setPrice(24000);


        System.out.println("birthday cake has " + birthdayCake.getFlavor() + " flavour and "+
                birthdayCake.getCandles() + " candles, cost is " + String.format("%.2f", birthdayCake.getPrice()));

        System.out.println("Wedding cake cost "+ String.format("%.2f", weddingCake.getPrice()) + " for "+ weddingCake.getTiers()
                + " tiers with a flavour of " + weddingCake.getFlavor());
    }
}
