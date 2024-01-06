package titan;

import java.util.Map;
import java.util.WeakHashMap;

public class AttributesStorage {
    public static final Map<Object, Integer> currentHealthPoints = new WeakHashMap<>();
    public static final Map<Object, Integer> currentBarrierPoints = new WeakHashMap<>();

}
