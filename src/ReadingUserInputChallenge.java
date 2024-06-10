import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;

        double sum = 0;
        do{
            System.out.println("Enter number #" +counter+": ");
            String inputNumber;
            inputNumber = sc.nextLine();
            try {
//                int number = Integer.parseInt(inputNumber);
                double number = Double.parseDouble(inputNumber);
                counter++;
                sum += number;
            }catch(NumberFormatException nfe){
                System.out.println("Invalid Number");
            }
        }while(counter <= 5);
        System.out.println("The sum of the 5 numbers = " + sum);
    }
}
