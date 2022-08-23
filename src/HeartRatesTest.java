import java.util.Scanner;
public class HeartRatesTest {


    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);


        System.out.print("Enter your first name:");
        String firstName = input.nextLine();

        System.out.print("Enter your last name:");
        String lastName = input.nextLine();

        System.out.print("Enter date of birth:");
        int dateOfBirth = input.nextInt();

        System.out.print("Enter month of birth:");
        int monthOfBirth = input.nextInt();

        System.out.print("Enter year of birth:");
        int yearOfBirth = input.nextInt();

        System.out.print("Enter current year:");
        int currentYear = input.nextInt();

        HeartRates firstPatient = new HeartRates(firstName,lastName, dateOfBirth, monthOfBirth, yearOfBirth, currentYear);


        System.out.println(firstPatient.age());
        System.out.println(firstPatient.maximumHeartRate());
        System.out.println(firstPatient.targetHeartRate());








    }
}
