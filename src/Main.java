import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int currentYear = 2024;
//        String usersDateOfBirth = "1999";
//
//        int dateOfBirth = Integer.parseInt(usersDateOfBirth);
//        System.out.println("Age = "+ (currentYear - dateOfBirth));
//
//        String usersAgeWithPartialYear = "22.5";
//
//        double ageWithPartialYears = Double.parseDouble(usersAgeWithPartialYear);
//        System.out.println("Age = "+ageWithPartialYears);
        try {
            System.out.println(getInputFromConsole(currentYear));
        }catch(NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }

    }

    public  static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi "+ name + ", Thanks for taking the course!");
        int age = currentYear - Integer.parseInt(System.console().readLine("What year were you born "));

        return "So you are "+ age + " years old";
    }

    public static String getInputFromScanner(int currentYear){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, What's your Name?");
        String name = sc.nextLine();
        boolean validDob = false;
        int age = 0;
        System.out.println("What year were you born? ");
        do {
            System.out.println("Enter a year of birth >= "+ (currentYear - 125) + " and <= "+currentYear);
            try {
                age = checkData(currentYear, sc.nextLine());
                validDob = age < 0 ? false : true;
            }catch(NumberFormatException e){
                System.out.println("Characters are not allowed");
            }
        }while(!validDob);
        return "So you are "+ age + " years old";
    }

    public static  int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if( (dob < minimumYear) || (dob > currentYear)){
            return -1;
        }

        return currentYear - dob;
    }
}
