public class PetNeeds {

    private String name;
    private int hunger;
    private int thirst;
    

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
}