public class Oven {

    private String _name;
    private int _temp;
    private String _food;
    private int _cookTime;

    public String getName(){
        return _name;
    }

    public void setName(String name){
        _name = name; 
    }

    public int getTemp(){
        return _temp;
    }

    public void setTemp(int temp){
        _temp = temp; 
    }

    public String getFood(){
        return _food;
    }

    public void setFood(String food){
        _food = food; 
    }

    public int getCookTime(){
        return _cookTime;
    }

    public void setCookTime(int cookTime){
        _cookTime = cookTime; 
    }
    
}
