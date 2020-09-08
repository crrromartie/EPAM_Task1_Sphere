package by.gaponenko.sphere.factory;

import by.gaponenko.sphere.entity.Point;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PointFactory {
    static Logger logger = LogManager.getLogger();

    public Point create(double x, double y, double z) {
        Point point = new Point(x, y, z);
        logger.log(Level.INFO, "New point created successfully!");
        return point;
    }
}
