import java.util.ArrayList;
import java.util.List;

public class Folder implements Component {
    private List<Component> componentList;
    private String name;

    public Folder(String name) {
        this.name = name;
        componentList = new ArrayList<>();
    }

    @Override
    public void show(String indent) {
        System.out.println(indent + name);

        for (Component c: componentList) {
            c.show(indent + "  ");
        }
    }

    @Override
    public void add(Component c) {
        componentList.add(c);
    }
}
