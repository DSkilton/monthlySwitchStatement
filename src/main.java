import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        switchMonth();
    }

    public static void switchMonth() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number from 1 - 12: ");
        int input = sc.nextInt();

        if (input > 0 || input < 12){
            switchMonth();
        }

        switch(input){
            case 0:
                System.out.println("Month " + input + " is not a month");
                break;
            case 1:
                System.out.println("Month " + input + " is January");
                break;
            case 2:
                System.out.println("Month " + input + " is February");
                break;
            case 3:
                System.out.println("Month " + input + " is March");
                break;
            case 4:
                System.out.println("Month " + input + " is April");
                break;
            case 5:
                System.out.println("Month " + input + " is May");
                break;
            case 6:
                System.out.println("Month " + input + " is June");
                break;
            case 7:
                System.out.println("Month " + input + " is July");
                break;
            case 8:
                System.out.println("Month " + input + " is August");
                break;
            case 9:
                System.out.println("Month " + input + " is September");
                break;
            case 10:
                System.out.println("Month " + input + " is October");
                break;
            case 11:
                System.out.println("Month " + input + " is November");
                break;
            case 12:
                System.out.println("Month " + input + " is December");
                break;
            default:
                System.out.println("Month " + input + "is an invalid month");
                break;
        }
    }

}
