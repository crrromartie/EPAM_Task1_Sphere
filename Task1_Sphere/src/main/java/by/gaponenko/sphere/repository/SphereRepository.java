package by.gaponenko.sphere.repository;

import by.gaponenko.sphere.comparator.SphereComparator;
import by.gaponenko.sphere.entity.Sphere;
import by.gaponenko.sphere.specification.Specification;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public final class SphereRepository {
    private static SphereRepository instance;
    private List<Sphere> spheres = new ArrayList<>();

    private SphereRepository() {
    }

    public static SphereRepository getInstance() {
        if (instance == null) {
            instance = new SphereRepository();
        }
        return instance;
    }

    public List<Sphere> query(Specification specification) {
        List<Sphere> resultSpheres = spheres.stream()
                .filter(o -> specification.specify(o))
                .collect(Collectors.toList());
        return resultSpheres;
    }

    public Sphere get(int index) {
        return spheres.get(index);
    }

    public boolean remove(Sphere sphere) {
        return spheres.remove(sphere);
    }

    public boolean add(Sphere sphere) {
        return spheres.add(sphere);
    }

    public boolean addAll(Collection<? extends Sphere> c) {
        return spheres.addAll(c);
    }

    public void sort(SphereComparator sphereComparator) {
        spheres.sort(sphereComparator);
    }
}
