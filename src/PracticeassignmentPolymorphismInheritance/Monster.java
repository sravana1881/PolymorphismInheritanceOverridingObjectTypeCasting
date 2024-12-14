package PracticeassignmentPolymorphismInheritance;

public class Monster {
    public String name;
    public Monster() {

    }
    public Monster(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String Attack(){
        return   "!^_&^$@+%$* I don't know how to attack!";

    }


    public void setName(String name) {
        this.name = name;
    }


}
