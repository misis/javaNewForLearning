public class functionMethodApp {
    //** CALLING THE METHOD **

    public static void main(String[] args){
        System.out.println("** CALLING THE own created METHOD **");
        myMethod("samad");
        blockBoard(5);
        myGlass("Music");
        myGlass("Oliva");
        System.out.println("Get 10% of discount form the " + getTenPercentOfDiscount(10000));
        System.out.println("Get 50% of discount form the " + getDiscountPrice(10000, 50));
        System.out.println("Get 30% of discount form the " + getDiscountPrice(10000.50, 30));
    }

    //** creating the METHOD

    static void myMethod(String fname){
        System.out.println("** creating the METHOD **");
        System.out.println("my own method name is: " + fname);
    }
    static void blockBoard(int countNumber){
        for(int i = 1; i <= countNumber; i++){
            System.out.println("system run :" + countNumber + " time.");
        }
    }
    static void myGlass(String myGlassName){
        System.out.println("My new glass name is: " + myGlassName);
    }

    static double getTenPercentOfDiscount(int price){
        return price * 0.9;
    }

    static double getDiscountPrice(int price, int percent){
        return price * percent / 100.0;
    }
    static double getDiscountPrice(double price, int percent){
        return price * percent / 100;
    }
}
