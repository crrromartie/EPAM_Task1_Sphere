package by.gaponenko.sphere.factory;

import by.gaponenko.sphere.entity.Point;
import by.gaponenko.sphere.entity.Sphere;
import by.gaponenko.sphere.exception.SphereException;
import by.gaponenko.sphere.generator.IdGenerator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SphereFactory {
    static Logger logger = LogManager.getLogger();

    public Sphere create(Point point, double radius) throws SphereException {
        if (radius <= 0) {
           throw new SphereException("Radius must be greater than zero!");
        }
        logger.log(Level.INFO, "New sphere created successfully!");
        return new Sphere(IdGenerator.generateId(), point, radius);
    }
}
