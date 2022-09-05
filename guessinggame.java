import java.util.Scanner;
public class guessinggame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mynumber = (int)(Math.random()*100);
        int guessnumber = 0;

        do {
            System.out.println("Enter my number (In range 0 to 100): ");
            guessnumber = sc.nextInt();

            if(guessnumber == mynumber){
                System.out.println("Woohoo You won, The number you entered is correct!");
                break;
            } else if (guessnumber > mynumber) {

                System.out.println("The number you entered is larger than my number");
            }
            else {
                System.out.println("The number you entered is less than my number");
            }

        }while (guessnumber >= 0 && guessnumber <= 100);

        System.out.println("The End");
    }

}
