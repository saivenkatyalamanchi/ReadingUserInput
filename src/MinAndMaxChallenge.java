import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isOver = false;
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
        int min = 0;
        int max = 0;
        int loopCount = 0;
        while(!isOver){
            System.out.println("Enter any Integer to continue or character to quit.");
            String inputNumber = sc.nextLine();
            try {
                int number = Integer.parseInt(inputNumber);
                if(number < min || loopCount == 0){
                    min = number;
                }
                if(number > max || loopCount==0){
                    max = number;
                }
                loopCount++;
            }catch(NumberFormatException nfe){
                System.out.println("Quitting.......");
                isOver = true;
            }
        }
        if(loopCount > 0) {
            System.out.println("Maximum = " + max + " Minimum = " + min);
        }else{
            System.out.println("No valid data entered");
        }
    }
}
