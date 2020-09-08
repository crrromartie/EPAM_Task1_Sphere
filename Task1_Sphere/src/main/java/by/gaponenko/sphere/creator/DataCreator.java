package by.gaponenko.sphere.creator;

import by.gaponenko.sphere.entity.Point;
import by.gaponenko.sphere.entity.Sphere;
import by.gaponenko.sphere.generator.IdGenerator;
import by.gaponenko.sphere.validator.SphereValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class DataCreator {
    static Logger logger = LogManager.getLogger();

    public List<Sphere> createSpheres(List<List<Double>> sphereLines) {
        List<Sphere> spheres = new ArrayList<>();
        for (List<Double> item : sphereLines) {
            Point point = new Point();
            point.setX(item.get(0));
            point.setY(item.get(1));
            point.setZ(item.get(2));
            Sphere sphere = new Sphere();
            sphere.setSphereId(IdGenerator.generateId());
            sphere.setCenter(point);
            sphere.setRadius(item.get(3));
            if (SphereValidator.isSphere(sphere)) {
                spheres.add(sphere);
            }
        }
        logger.log(Level.INFO, "List spheres created successfully!");
        return spheres;
    }
}
