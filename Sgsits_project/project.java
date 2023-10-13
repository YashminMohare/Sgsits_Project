import java.util.*;
import java.lang.*;
interface utility {
    public void get_details();
    public void set_details();
}
public class project {
    static void main_menu() {
    System.out.println();
    System.out.println("======================= *** WELCOME TO SHOWROOM  *** =======================");
    System.out.println();
    System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
    System.out.println();
    System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
    System.out.println();
    System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
    System.out.println();
    System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice =100;
        while (choice!=0) {
            main_menu();
            choice = sc.nextInt();
            while (choice!=9 && choice!=0) {
                switch (choice) {
                    case 1:
                        System.out.println("case 1");
                        break;
                    case 2:
                     System.out.println("case 2");
                        break;
                    case 3:
                        System.out.println("case 3");
                     break;
                    case 4:
                     System.out.println("case 4");
                        break;
                    case 5:
                        System.out.println("case 5");
                     break;
                    case 6:
                        System.out.println("case 6");
                        break;
                    default:
                        System.out.println("enter valid choice");
                   
                }
            }
        }

    }
}
