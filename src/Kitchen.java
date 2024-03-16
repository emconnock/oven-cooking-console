import java.util.Scanner;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

public class Kitchen {
    public static void main(String[] args) throws InterruptedException {
        
        Oven oven = new Oven();

        System.out.println("\nHello! Nice to meet you! \nI am here to help you cook a meal today!\n\nAnswer the following 4 questions to get your food started:");
        System.out.println("------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQuestion 1: \nWhat would you like to call your oven? ");
        oven.setName(scanner.nextLine());
        System.out.println(oven.getName() + " is a great name for an oven!");
        System.out.println("-------------------------------------------------------");
        

        System.out.println("\nQuestion 2: \nWhat temperature would you like to set your oven to? (Degrees Celcius)");
        oven.setTemp(scanner.nextInt());
        System.out.println("\nTurning the dial to set the temperature to " + oven.getTemp() + "* Celcius.\nBe careful, I'm going to get hot!!!");
        System.out.println("-------------------------------------------------------");
       

        System.out.println("\nQuestion 3: \nWhat are we cooking today?: ");
        scanner.nextLine();
        oven.setFood(scanner.nextLine());
        System.out.println("\nOoooh I love " + oven.getFood() + "!\nAbout to put your " + oven.getFood() + " into the oven, I just have one more question for you.");
        System.out.println("-------------------------------------------------------");
        //System.out.print("\nIs that all? Would you like to cook anything else in the oven? ");
     

        System.out.println("\nQuestion 4: \nHow long does your " + oven.getFood() + " need to be cooked for? (minutes)");
        oven.setCookTime(scanner.nextInt());
        System.out.println("-------------------------------------------------------");
       

        //System.out.print("\nAbout to put your " + oven.getFood() + "into the oven, just one more question!");

        scanner.close();

        System.out.print("\nThe timer has been set for " + oven.getCookTime() + " minutes. It will beep once the " + oven.getFood() + " is ready!");

        for (int i = oven.getCookTime(); i >= 1; i --){
            System.out.print("\033\143");  
            System.out.println("Timer: " + i + " seconds left");
            TimeUnit.SECONDS.sleep(1);
        }
        
        System.out.print("\033\143"); 
        System.out.println("Beep");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("\033\143"); 
        System.out.println("Beeeep");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("\033\143"); 
        System.out.println("BEEEEEEEEEP");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("\033\143"); 

        System.out.println("Your " + oven.getFood() + " is cooked, enjoy your delicious meal!");


    }
}
