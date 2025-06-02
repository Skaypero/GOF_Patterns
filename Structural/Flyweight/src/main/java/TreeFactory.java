import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private Map<String, TreeType> treeMap;

    public TreeFactory() {
        treeMap = new HashMap<>();
        treeMap.put("Oak", new TreeType("Oak", "Texture1", "Brown"));
        treeMap.put("Pine", new TreeType("Pine", "Texture2", "Green"));
    }

    public TreeType getTree(String index) {
        if (!treeMap.containsKey(index)) {
            treeMap.put(index, new TreeType(index, "Texture", "Color"));
        }

        return treeMap.get(index);
    }
}
