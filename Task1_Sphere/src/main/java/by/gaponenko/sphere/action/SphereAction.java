package by.gaponenko.sphere.action;

import by.gaponenko.sphere.entity.Sphere;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.Math.abs;

public class SphereAction {
    static Logger logger = LogManager.getLogger();

    public double volume(Sphere sphere) {
        double volume = 4 / 3.0 * PI * pow(sphere.getRadius(), 3.0);
        logger.log(Level.INFO, "Volume sphere is counted!");
        return volume;
    }

    public double square(Sphere sphere) {
        double square = 4 * PI * pow(sphere.getRadius(), 2);
        logger.log(Level.INFO, "Square sphere is counted!");
        return square;
    }

    public double segmentVolume(Sphere sphere, double height) {
        double radius = sphere.getRadius();
        return (1 / 3.0 * PI * pow(radius, 2) * (3 * radius - height));
    }

    public double volumeRatioCuttingXY(Sphere sphere) {
        if (abs(sphere.getCenter().getZ()) >= sphere.getRadius()) {
            return 0;
        }
        double radius = sphere.getRadius();
        double heightSegment = 2 * radius - abs(sphere.getCenter().getZ());
        double segmentVolume = segmentVolume(sphere, heightSegment);
        double restVolume = volume(sphere) - segmentVolume;
        double result = segmentVolume / restVolume;
        logger.log(Level.INFO, "Volume ratio cutting XY sphere is counted!");
        return result;

    }

    public double volumeRatioCuttingXZ(Sphere sphere) {
        if (abs(sphere.getCenter().getY()) >= sphere.getRadius()) {
            return 0;
        }
        double radius = sphere.getRadius();
        double heightSegment = 2 * radius - abs(sphere.getCenter().getY());
        double segmentVolume = segmentVolume(sphere, heightSegment);
        double restVolume = volume(sphere) - segmentVolume;
        double result = segmentVolume / restVolume;
        logger.log(Level.INFO, "Volume ratio cutting XZ sphere is counted!");
        return result;

    }

    public double volumeRatioCuttingYZ(Sphere sphere) {
        if (abs(sphere.getCenter().getX()) >= sphere.getRadius()) {
            return 0;
        }
        double radius = sphere.getRadius();
        double heightSegment = 2 * radius - abs(sphere.getCenter().getX());
        double segmentVolume = segmentVolume(sphere, heightSegment);
        double restVolume = volume(sphere) - segmentVolume;
        double result = segmentVolume / restVolume;
        logger.log(Level.INFO, "Volume ratio cutting YZ sphere is counted!");
        return result;
    }
}
