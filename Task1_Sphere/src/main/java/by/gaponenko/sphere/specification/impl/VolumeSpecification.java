package by.gaponenko.sphere.specification.impl;

import by.gaponenko.sphere.entity.Sphere;
import by.gaponenko.sphere.entity.SphereParameters;
import by.gaponenko.sphere.entity.WareHouse;
import by.gaponenko.sphere.specification.Specification;


public class VolumeSpecification implements Specification {
    private double volume;

    public VolumeSpecification(double volume) {
        this.volume = volume;
    }

    @Override
    public boolean specify(Sphere sphere) {
        WareHouse wareHouse = WareHouse.getInstance();
        SphereParameters parameters = wareHouse.get(sphere.getSphereId());
        return (parameters.getVolume() == volume);
    }
}
