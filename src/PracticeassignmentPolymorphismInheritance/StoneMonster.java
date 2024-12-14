package PracticeassignmentPolymorphismInheritance;

public class StoneMonster extends Monster {
    public StoneMonster() {
        super();
    }
    public StoneMonster(String name) {
        super(name);
    }
    @Override
    public String Attack() {
        return getName() + " Attack with Stone! ";
    }
}
