package PracticeassignmentPolymorphismInheritance;

public class FireMonster extends Monster {
    public FireMonster() {

    }
    public FireMonster(String name) {
      super(name);
    }

    @Override
    public String Attack() {
        return getName() + " Attack with fire! ";
        }
    }

