import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    //     System.out.println("Enter your username:");

    //     Scanner loginScanner = new Scanner(System.in);

    //     String username_from_input = loginScanner.nextLine();

    //     System.out.println("Enter your password:");

    //     String password_from_input = loginScanner.nextLine();

    //     // System.out.println("Your username is:" + username_from_input);
    //     // System.out.println("Your password is:" + password_from_input);

    //     //DECLARE USER Object
    //     user Remm = new user(username_from_input, password_from_input);

    //     // declare object
    //     File myfile = new File ("accounts.txt");

    //     // check if the file exists
    //     if (myfile.exists()) {
    //       //  System.out.println("File exists");
    //     }

    //     //read file
    //     Scanner fileScanner = new Scanner (myfile);

    //     Boolean accountexists = false;
    //     while (fileScanner.hasNextLine()) {
    //         String filedata = fileScanner.nextLine();

    //         System.out.println(filedata);

    //         String username_from_file = filedata.split(",")[0];

    //         String password_from_file = filedata.split(",")[1];
            
    //         //validation/compare
    //         if (username_from_input.equals(username_from_file) && password_from_input.equals(password_from_file)) {
    //             accountexists = true;
    //             break;
    //         }
    //     }

    //     if (accountexists){
    //         System.out.println("Login successful! HELLO!");
    //     }
    //     else { System.out.println("Login unsuccessful - Not existing");
    //     }

    // fileScanner.close();

    // }

    //Datascientist as object
    DataScientist dScientist1 = new DataScientist("John", null, null);
    //System.out.println ("My name is" + dScientist1.name + "he works as a"+dScientist1.getwork()+ "and his salary is"+ dScientist1.getsalary());
    
    System.out.println("His name is" + dScientist1.name);
    System.out.println("His works is" + dScientist1.getwork());
    System.out.println("He earns" + dScientist1.getsalary());

}
}