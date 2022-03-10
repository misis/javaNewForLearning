public class loopsApp {
   public static void main(String[] args){
       //WHILE LOOPS EXAMPLE
       System.out.println("**WHILE LOOPS EXAMPLE**");
       int i = 1;
       while (i <=5 ){
           System.out.println(i + ". Being sucks are");
           i++;
       }
       System.out.println("The last number value:" + i);
       System.out.println();

       //DO WHILE LOOPS EXAMPLE
       System.out.println("**DO WHILE LOOPS EXAMPLE**");
       int j = 1;
       do{
           System.out.println(j + ". Being sucks are");
           j++;
       }while (j <= 5);
       System.out.println("The last number value:" + j);
       System.out.println();

       //FOR LOOPS EXAMPLE
       System.out.println("**FOR LOOPS EXAMPLE**");
       for(int k = 1;k <=5; k++){
           System.out.println(k + ". Bar for loops looping");
       }


       //**USE CONTINUE INSIDE OF FOR LOOPS**
       System.out.println("**USE CONTINUE AND BREAK INSIDE OF FOR LOOPS**");
       for(int x = 1;x <= 5;x++){
           if(x == 3){
               continue;
           }
           System.out.println(x + ". Bar for loops looping");
       }

       //**USE BREAK INSIDE OF FOR LOOPS**
       System.out.println("**USE CONTINUE AND BREAK INSIDE OF FOR LOOPS**");
       for(int y = 1;y <= 5;y++){
           if(y == 3){
               break;
           }
           System.out.println(y + ". Bar for loops looping");
       }
       //**USE NESTED FOR LOOPS**
       System.out.println("**Nested FOR LOOPS EXAMPLE**");
       for(int m = 1;m <=3; m++){
           for(int l = 1;l <=5; l++) {
               System.out.println("m = " + m + ",l = " + l +" Bar for loops looping");
           }
       }
   }
}
