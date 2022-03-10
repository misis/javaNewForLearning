import java.util.Locale;

public class ObjectReferenceApp {

    public static void main(String[] args){
        byte numberOfSeats = 5;
        short horsePower = 392;
        Integer price = 14999;
        Long registerNumber = 234578787564L;

        Float fuelConsumptionUrban = 15.5F;
        Double fuelConsumptionAverage = 15.23243455656354;

        Boolean isDamaged = true;
        Character fuelEfficiencyCategory = 'G';

        String carType = "Dodge challenger SRT 392";
        String carTypeNewKeyword = new String("Dodge challenger SRT 392");

        System.out.println("Now we can see our all Object oriented variable");
        System.out.println("Number of seats " + numberOfSeats);
        System.out.println("Horse power of car " + horsePower);
        System.out.println("Price of car " + price);
        System.out.println("Registration of car " + registerNumber);
        System.out.println("Urban fuel consumption of car  " + fuelConsumptionUrban);
        System.out.println("Fuel consumption in Average of car " + fuelConsumptionAverage);
        System.out.println("Damaged of car " + isDamaged);
        System.out.println("Fuel Efficiency of car " + fuelEfficiencyCategory);
        System.out.println("The car Type will show lower case " + carType.toLowerCase(Locale.ROOT));
        System.out.println("The New car Keyword will show upper case " + carTypeNewKeyword.toUpperCase());

    }


}
