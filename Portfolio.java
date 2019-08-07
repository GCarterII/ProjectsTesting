import java.util.ArrayList;

public class Portfolio{
    private ArrayList<Project> projList = new ArrayList<>();
    public Portfolio(){
    }
    public Portfolio(Project proj){
        this.projList.add(proj);
    }
    public void addProject(Project proj){
        this.projList.add(proj);
    }
    public void removeProject(Project proj){
        this.projList.remove(proj);
    }
    public double getPortfolioCost(){
        double totalCost = 0.0;
        for(Project proj : this.projList){
            totalCost += proj.getInitialCost();
        }
        return totalCost;
    }
    public void showPortfolio(){
        for(Project proj : this.projList){
            System.out.println(proj.elevatorPitch());
        }

        System.out.println(this.getPortfolioCost());
    }
}