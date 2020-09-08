package by.gaponenko.sphere.specification.impl;

import by.gaponenko.sphere.entity.Sphere;
import by.gaponenko.sphere.entity.SphereParameters;
import by.gaponenko.sphere.entity.WareHouse;
import by.gaponenko.sphere.specification.Specification;

public class IntervalVolumeSpecification implements Specification {
    private double minVolume;
    private double maxVolume;

    public IntervalVolumeSpecification(double minVolume, double maxVolume) {
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    @Override
    public boolean specify(Sphere sphere) {
        WareHouse wareHouse = WareHouse.getInstance();
        SphereParameters parameters = wareHouse.get(sphere.getSphereId());
        return (parameters.getVolume() >= minVolume
                && parameters.getVolume() <= maxVolume);
    }
}
