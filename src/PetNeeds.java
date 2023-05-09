public class PetNeeds {

    private String name;
    private int hunger;
    private int thirst;
    private int loneliness;
    private int exhaustion;
    private int dirtiness;


    
    

    public PetNeeds(){

    }

    

    public void setHunger(int hungerLevel){
        ///setter
        hunger = hungerLevel;
        
    }
    public int getHunger(){
        return hunger;
    }
    public void setName(String newName){
        ///setter
        name = newName;

    }
    //getter 
    public String getName(){
        return name;
    }

    public void setThirst(int thirstLevel) {
        thirst = thirstLevel;
    }

    public int getThirst() {
        return thirst;
    }

    public int getLoneliness() {
        return this.loneliness;
    }

    public void setLoneliness(int loneliness) {
        this.loneliness = loneliness;
    }

    public void decay(){
        loneliness -= 1;
        thirst -= 1;
        exhaustion -= 1;
        dirtiness -= 1;
        hunger -= 1;

    }

    public int getExhaustion() {
        return this.exhaustion;
    }

    public void setExhaustion(int exhaustion) {
        this.exhaustion = exhaustion;
    }

    public int getDirtiness() {
        return this.dirtiness;
    }

    public void setDirtiness(int dirtiness) {
        this.dirtiness = dirtiness;
    }

    public void feed(){
        hunger += 5;
    }

    public void wash(){
        dirtiness +=5;
    }

    public void hydrate()
    {
        dirtiness += 5;
    }

    public void sleep()
    {
        exhaustion += 5;
    }

    public void play(){
        loneliness += 5;
    }
}