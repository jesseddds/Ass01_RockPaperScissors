import java.sql.SQLOutput;
import java.util.Scanner;

        void main() {
                Scanner input = new Scanner(System.in);
                String again = "Y";
                while (again.equals("Y")) {
                        System.out.println("PlayerA enter R, P or S");
                        String a = input.nextLine();
                        while (!a.equals("R") && !a.equals("P") && !a.equals("S")){
                                System.out.println("Invalid choice, PlayerA enter R, P or S");
                                a = input.nextLine();
                        }

                        System.out.println("PlayerB enter R, P or S");
                        String b = input.nextLine();
                        while (!b.equals("R") && !b.equals("P") && !b.equals("S")){
                                 System.out.println("Invalid choice, PlayerB enter R, P or S");
                                 b = input.nextLine();
                        }

                        if (a.equals("R") && b.equals("R")) {
                                System.out.println("Tie!");
                        } else if (a.equals("S") && b.equals("S")) {
                                System.out.println("Tie!");
                        } else if (a.equals("P") && b.equals("P")) {
                                System.out.println("Tie!");
                        } else if (a.equals("R") && b.equals("S")) {
                                System.out.println("PlayerA wins!");
                        } else if (a.equals("R") && b.equals("P")) {
                                System.out.println("PlayerB wins!");
                        } else if (a.equals("P") && b.equals("S")) {
                                System.out.println("PlayerB wins!");
                        } else if (a.equals("S") && b.equals("R")) {
                                System.out.println("PlayerB wins!");
                        } else if (a.equals("S") && b.equals("P")) {
                                System.out.println("PlayerA wins!");
                        } else if (a.equals("P") && b.equals("R")) {
                                System.out.println("PlayerA wins!");
                        }



                        System.out.println("Would you like to play again? Y/N");
                        again = input.nextLine();
                }




}