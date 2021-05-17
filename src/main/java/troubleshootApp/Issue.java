package troubleshootApp;

import java.util.List;
import java.util.Scanner;

import java.util.Scanner;

public class Issue {
    public static void main(String[] args) {
        System.out.println("Is the car silent when you turn the key?");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();

        if(answer.equals("y")){
            System.out.println("Are the battery terminals corroded?");
            answer = in.nextLine();
            if(answer.equals("y")){
                System.out.println("Clean terminals and starting again");
            }
            else if(answer.equals("n")){
                System.out.println("Replace cable and try again");
            }
        }else if(answer.equals("n")){
            System.out.println("Does a car make a clicking noise?");
            answer = in.nextLine();
            if(answer.equals("y")){
                System.out.println("Replace the battery");
            }else if(answer.equals("n")){
                System.out.println("Does the car crank up but fail to start?");
                answer = in.nextLine();
                if(answer.equals("y")){
                    System.out.println("Check spark plug connections");
                }
                else if(answer.equals("n")){
                    System.out.println("Does engine start and then die?");
                    answer = in.nextLine();
                    if(answer.equals("y")){
                        System.out.println("Does your car have fuel injection?");
                        answer = in.nextLine();
                        if(answer.equals("y")){
                            System.out.println("Get it in for service");
                        }else if(answer.equals("n")){
                            System.out.println("Check to ensure the choke is opening and closing");
                        }
                    }
                }
            }
        }
    }
}