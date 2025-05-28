import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String name;
    private String weapon;
    private String armor;
    private int level;
    private List<String> abilities;

    public Hero() {
        name = "Hero";
        level = 1;
        abilities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getArmor() {
        return armor;
    }

    public int getLevel() {
        return level;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setAbility(String ability) {
        this.abilities.add(ability);
    }
}
