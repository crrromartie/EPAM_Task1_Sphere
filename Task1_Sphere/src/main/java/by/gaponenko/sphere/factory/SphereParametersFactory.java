package by.gaponenko.sphere.factory;

import by.gaponenko.sphere.action.SphereAction;
import by.gaponenko.sphere.entity.Sphere;
import by.gaponenko.sphere.entity.SphereParameters;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SphereParametersFactory {
    static Logger logger = LogManager.getLogger();

    public SphereParameters create(Sphere sphere) {
        SphereAction sphereAction = new SphereAction();
        double volume = sphereAction.volume(sphere);
        double square = sphereAction.square(sphere);
        SphereParameters sphereParameters = new SphereParameters(volume, square);
        logger.log(Level.INFO, "New sphere parameters created successfully!");
        return sphereParameters;
    }
}
