public class fastExamApps {
    public static void main(String[] args){
        String rightName = "Tomas carl";
        char answer = 'a';

        //** The fast way we got the Answer **
        System.out.println("** The fast way we got the Answer **");
        System.out.println("Who is the inventor of bulb?");

        if(rightName.equals("Samadul islam")){
            System.out.println("Yes! Mr Samadul islam did not invent the bulb");
        }else if(rightName.equals("Tomas Adison")){
            System.out.println("Yes! Mr Tomas Adison did invent the bulb");
        }else{
            System.out.println("No! I have no idea about this");
        }

        //** The second way we got the Answer **
        System.out.println("** The fast way we got the Answer **");
        System.out.println("Who is the inventor of bulb?");
        System.out.println("The answer of the quwestion is " + answer);

        if (answer == 'c'){
            System.out.println("Yes Tomas adison was invent the bulb");
        }else{
            System.out.println("I did not have any idea about this ");
        }
    }
}
