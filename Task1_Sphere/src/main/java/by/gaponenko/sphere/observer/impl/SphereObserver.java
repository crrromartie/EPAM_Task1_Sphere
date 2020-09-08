package by.gaponenko.sphere.observer.impl;

import by.gaponenko.sphere.action.SphereAction;
import by.gaponenko.sphere.entity.Sphere;
import by.gaponenko.sphere.entity.SphereParameters;
import by.gaponenko.sphere.observer.Observer;
import by.gaponenko.sphere.entity.WareHouse;

public class SphereObserver implements Observer {
    @Override
    public void actionPerformed(Sphere sphere) {
        SphereAction sphereAction = new SphereAction();
        double volume = sphereAction.volume(sphere);
        double square = sphereAction.square(sphere);
        SphereParameters sphereParameters = new SphereParameters();
        sphereParameters.setVolume(volume);
        sphereParameters.setSquare(square);
        WareHouse wareHouse = WareHouse.getInstance();
        wareHouse.put(sphere.getSphereId(), sphereParameters);
    }
}
