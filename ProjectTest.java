public class ProjectTest{
    public static void main(String[] args){
        Project proj1 = new Project();
        Project proj2 = new Project("Romeo");
        Project proj3 = new Project("Juliet", "She is the moon");
        Project proj4 = new Project("Testing", "Takes forever", 99.99);
        System.out.println(proj1.elevatorPitch());
        System.out.println(proj2.elevatorPitch());
        System.out.println(proj3.elevatorPitch());
        System.out.println(proj4.elevatorPitch());
        
        System.out.println(proj4.getName());
        System.out.println(proj4.getDescription());
        System.out.println(proj4.getInitialCost());
        
        proj1.setName("Kevin");
        proj1.setDescription("I like EGGS");
        proj1.setInitialCost(3665.3665);
        
        System.out.println(proj1.elevatorPitch());

        Portfolio port1 = new Portfolio();
        Portfolio port2 = new Portfolio(proj4);
        port1.showPortfolio();
        port1.addProject(proj1);
        port1.addProject(proj2);
        port1.addProject(proj3);
        port1.addProject(proj4);
        port1.showPortfolio();
        port1.removeProject(proj4);
        port1.showPortfolio();
        port2.showPortfolio();


    }
}