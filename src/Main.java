import java.util.Scanner;
import java.util.Random; 
public class Main {
    public static void main(String[] args) throws Exception {
        PetNeeds petNeeds = new PetNeeds();
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
       // petNeeds.setName("fluffy");

       petNeeds.setHunger(rand.nextInt(5, 100+1));
       petNeeds.setDirtiness(rand.nextInt(5, 100+1));
       petNeeds.setExhaustion(rand.nextInt(5, 100+1));
       petNeeds.setLoneliness(rand.nextInt(5, 100+1));
       petNeeds.setThirst(rand.nextInt(5, 100+1));
        

        System.out.println("Welcome to your virtual pet, would you like to get started? Type yes"+
        " to get started or no to end");

        String start = scan.nextLine(); 

        System.out.println("Name your pet:");
            String name = scan.nextLine();

        while(start.equalsIgnoreCase("yes"))
        {
            

            
            System.out.println("Your pets name is:" + name);
            petNeeds.setName(name);

            System.out.println("Your pet's hunger is at " + petNeeds.getHunger());
            System.out.println("Your pet's dirtiness is at " + petNeeds.getDirtiness());
            System.out.println("Your pet's exhaustion is at " + petNeeds.getExhaustion());
            System.out.println("Your pet's loneliness is at " + petNeeds.getLoneliness());
            System.out.println("Your pet's thirst is at " + petNeeds.getThirst());

            petNeeds.decay();

            if(petNeeds.getHunger() < 50)
            {
                System.out.println("Your pet is getting a little bit hungry");
                System.out.println();
                System.out.println("_._     _,-'\"\"`-._");
                System.out.println("(,-.`._,'(       |\\`-/|");
                System.out.println("    `-.-' \\ )-`( , o o)");
                System.out.println("     `-    \\`_`\"\'-");
            }
            else if(petNeeds.getDirtiness() < 50)
            {
                System.out.println("Your pet is starting to smell ");
                System.out.println();
                System.out.println(",-"+""+"+"+"-"+".");
                System.out.println("/\\j__/\\  (  \\`--.");
                System.out.println("\\`@_@'/  _)  >--.`.");
                System.out.println("_{.:Y:_}_{{_,'  ) )");
                System.out.println("{_}`-^{_} ```     (_/");
            }
            else if(petNeeds.getExhaustion() < 50 )
            {
                System.out.println("Your pet's getting tired");
                System.out.println();
                System.out.println("|\\__/,|   (`\\");
                System.out.println("|_ _  |.--.) )");
                System.out.println("( T   )     /");
                System.out.println("(((^_(((/(((_/");
            }
            else if(petNeeds.getLoneliness() < 50)
            {
                System.out.println("Your pet is starting to get lonely");
                System.out.println();
                System.out.println("           __..--''``---....___   _..._    __");
                System.out.println(" /// //_.-'    .-/"+ ";  `        ``<._  ``.''_ `. /" +"// /");
                System.out.println("///_.-' _..--.'"+"     "+"                   `( ) ) // //");
                System.out.println("/ (_..-' // (< _     ;_..__               ; `' / ///");
                System.out.println(" / // // //  `-._,_)' // / ``--...____..-' /// / //");
            }
            else if(petNeeds.getThirst() < 50)
            {
                System.out.println("Your pet's getting thirsty");
                System.out.println("                       /)");
                System.out.println("              /\\___/\\ ((");
                System.out.println("              \\`@_@'/  ))");
                System.out.println("              {_:Y:.}_//");
                System.out.println("     ---------{_}^-'{_}----------");

            }

            System.out.println("Would you like to continue?");

            start = scan.nextLine();

            System.out.println("Would you like to feed you pet?"
            + "Your options are: feed, wash, hydrate, sleep");
            String option = scan.nextLine();
            if(option.equalsIgnoreCase("feed"))
            {
                petNeeds.feed();
            }
            else if(option.equalsIgnoreCase("wash"))
            {
                petNeeds.wash();
            }
            else if(option.equalsIgnoreCase("hydrate"))
            {
                petNeeds.hydrate();
            }
            else if(option.equalsIgnoreCase("sleep"))
            {
                petNeeds.sleep();
            }
            else if(option.equalsIgnoreCase("play"))
            {
                petNeeds.play();
            }

            

            
            
            
        }
        System.out.println("GoodBye!");


     
    }

    
}
 