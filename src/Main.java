import java.nio.FloatBuffer;
import java.util.jar.Attributes.Name;

public class Main {
    public static void main(String[] args) throws Exception {
        PetNeeds petNeeds = new PetNeeds();
        petNeeds.setName("fluffy");
        String name = petNeeds.getName();
        System.out.println(name);
    }
}
 