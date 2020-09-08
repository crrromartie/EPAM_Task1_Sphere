package by.gaponenko.sphere.entity;

import java.util.HashMap;
import java.util.Map;

public final class WareHouse {
    private static WareHouse instance;
    private Map<Long, SphereParameters> parameters = new HashMap<>();

    private WareHouse() {
    }

    public static WareHouse getInstance() {
        if (instance == null) {
            instance = new WareHouse();
        }
        return instance;
    }

    public SphereParameters get(Long key) {
        return parameters.get(key);
    }

    public SphereParameters remove(Long key) {
        return parameters.remove(key);
    }

    public SphereParameters put(Long key, SphereParameters value) {
        return parameters.put(key, value);
    }

    public SphereParameters putIfAbsent(Long key, SphereParameters value) {
        return parameters.putIfAbsent(key, value);
    }

    public SphereParameters replace(Long key, SphereParameters value) {
        return parameters.replace(key, value);
    }
}
