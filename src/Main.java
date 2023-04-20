import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        PetNeeds petNeeds = new PetNeeds();
        Scanner scan = new Scanner(System.in);
        petNeeds.setName("fluffy");
        petNeeds.setHunger(50);
        String name = petNeeds.getName();
        int hunger = petNeeds.getHunger();
        System.out.println(name);
        System.out.println(hunger);
        

        

        
    }
}
 