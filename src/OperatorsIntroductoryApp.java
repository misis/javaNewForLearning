public class OperatorsIntroductoryApp {
    public static void main(String [] args){
        String carModel1 = "Dodge challenger SRT 392";
        int price = 14999;
        int moneyInTheBank = 100000;
        boolean isDamaged = true;

        System.out.println("price $" + price);
        int priceIncreased = price + 1000;
        System.out.println("Incresed price by: $ " + priceIncreased);
        int priceDecreased = price - 1000;
        System.out.println("Decresed price by: $ " + priceDecreased);
        int priceIntoTwocar = price * price;
        System.out.println("price by two car: $ " + priceIntoTwocar);
        int priceDivided = price / 1000;
        System.out.println("Price Divided by 1000: $" + priceDivided);
        int priceModules = moneyInTheBank % price;
        System.out.println("Price percentage $" + priceModules);
    }
}
