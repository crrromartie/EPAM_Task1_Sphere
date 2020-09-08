package by.gaponenko.sphere.action;

import static java.lang.Math.abs;

import by.gaponenko.sphere.entity.Sphere;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CheckSphereAction {
    static Logger logger = LogManager.getLogger();

    public boolean isSphere(Sphere sphere) {
        if (sphere == null) {
            return false;
        }
        logger.log(Level.INFO, "Sphere checked!");
        return (sphere.getRadius() > 0);
    }

    public boolean isTouchesAnyCoordinatePlane(Sphere sphere) {
        if (sphere == null) {
            return false;
        }
        boolean flag = false;
        if (sphere.getRadius() == abs(sphere.getCenter().getX())
                || sphere.getRadius() == abs(sphere.getCenter().getY())
                || sphere.getRadius() == abs(sphere.getCenter().getZ())) {
            flag = true;
        }
        logger.log(Level.INFO, "Touches the coordinate plane - checked!");
        return flag;
    }
}
