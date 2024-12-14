package PracticeassignmentPolymorphismInheritance;

public class WaterMonster extends Monster {
    public WaterMonster() {

    }
    public WaterMonster(String name) {
        super(name);
    }
    @Override
    public String Attack() {
        return getName() + " Attack with water! ";
    }
}
