package gods;
import java.util.Map;
import java.util.WeakHashMap;

public class AttributesStorage {
    public static final Map<Object, Integer> requiredActionPoints = new WeakHashMap<>();
    public static final Map<Object, Integer> currentActionPoints = new WeakHashMap<>();

}