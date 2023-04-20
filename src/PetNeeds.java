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
}