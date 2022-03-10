public class controlFolowApp {
    public static void main(String[] args){
        sayHello();
        blackBoardResult(5);
        System.out.println("YOu will get " + getTenPercentOfDiscount(20000) + " take discount");
    }

    static void sayHello(){
        System.out.println("Hello!!!!");
    }
    static void blackBoardResult(int resultNumber){
        for(int i = 1; i <= resultNumber; i++){
            System.out.println("The result is " + resultNumber);
        }
    }
    static double getTenPercentOfDiscount(int price){
        return price * .9;
    }
}
