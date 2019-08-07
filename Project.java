public class Project{
    private String name;
    private String description;
    private double initialCost;
    public String elevatorPitch(){
        String pitch = this.name + " (" + this.initialCost + "): " + this.description;
        return pitch;
    }
    public Project(){
        
    }
    public Project(String name){
        this.name = name;
    }
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    public Project(String name, String description, double cost){
        this.name = name;
        this.description = description;
        this.initialCost = cost;
    }
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public double getInitialCost(){
        return this.initialCost;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setInitialCost(double initialCost){
        this.initialCost = initialCost;
    }
}