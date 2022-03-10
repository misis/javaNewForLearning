public class controlFlowApps {
    public static void main(String[] args){
        boolean isDamaged = false;
        String carColor = "blue";
        char carEfficiencyModel = 'A';

        //** USE IF STATEMENT TO FIND OUT THE RESULT
        System.out.println("** USE IF STATEMENT TO FIND OUT THE RESULT **");
        if(isDamaged){
            System.out.println("Car is Damaged");
        }else {
            System.out.println("Car is no Damaged");
        }

        //** USE IF ELSE STATEMENT TO FIND OUT THE RESULT
        System.out.println("** USE IF ELSE STATEMENT TO FIND OUT THE RESULT **");
        if(carColor.equals("red")){
            System.out.println("The car color is red");
        }else if (carColor.equals("green")){
            System.out.println("The car color is Green");
        }else if (carColor.equals("blue")){
            System.out.println("The car color is Blue");
        } else{
            System.out.println("No idea about the color of car");
        }

        //** USE SWITCH STATEMENT TO FIND OUT THE RESULT
        System.out.println("** USE SWITCH STATEMENT TO FIND OUT THE RESULT **");
        switch (carEfficiencyModel){
            case 'A':
                System.out.println("The car is vary good at fuel");
                break;
            case 'B':
                System.out.println("The car is Energy consum vary low");
                break;
            case 'G':
                System.out.println("The car is Energy Efficiency");
                break;
            default:
                System.out.println("NOt defined about the Energy efficiency");
        }

        //** USE CODE BLOCK TO FIND OUT A NEW TEST
        System.out.println("** use CODE BLOCK to find out a new test **");
        {
            int numberOfOwner = 5;
            {
                numberOfOwner++;
            }
            System.out.println("The number of land owner is: " + numberOfOwner);
        }
    }
}
