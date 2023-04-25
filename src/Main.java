import java.util.Scanner;
import java.util.Random; 
public class Main {
    public static void main(String[] args) throws Exception {
        PetNeeds petNeeds = new PetNeeds();
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
       // petNeeds.setName("fluffy");
        petNeeds.setHunger(50);

        System.out.println("Welcome to your virtual pet, would you like to get started? Type yes"+
        " get started or no to end");

        String start = scan.nextLine(); 

        if(start.equalsIgnoreCase("yes"))
        {
            System.out.println("Name your pet:");
            String name = scan.nextLine();
            System.out.println("Your pets name is:" + name);
            petNeeds.setName(name);
            petNeeds.setHunger(rand.nextInt(100+1));
            System.out.println(petNeeds.getHunger());

            System.out.println(petNeeds.getName());
            
        }
        else{System.out.println("GoodBye!");}
     
    }
}
 