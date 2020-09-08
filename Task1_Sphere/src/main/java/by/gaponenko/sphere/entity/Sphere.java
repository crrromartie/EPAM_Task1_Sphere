package by.gaponenko.sphere.entity;

import by.gaponenko.sphere.observer.Observable;
import by.gaponenko.sphere.observer.Observer;
import by.gaponenko.sphere.observer.impl.SphereObserver;

import java.util.StringJoiner;

public class Sphere implements Observable {
    private long sphereId;
    private Point center;
    private double radius;
    private Observer observer = new SphereObserver();

    public Sphere(long sphereId, Point center, double radius) {
        this.sphereId = sphereId;
        this.center = center;
        this.radius = radius;
    }

    public Sphere() {
    }

    public long getSphereId() {
        return sphereId;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public void setSphereId(long sphereId) {
        this.sphereId = sphereId;
        notifyObservers();
    }

    public void setCenter(Point center) {
        this.center = center;
        notifyObservers();
    }

    public void setRadius(double radius) {
        this.radius = radius;
        notifyObservers();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        Sphere sphere = (Sphere) o;
        if (sphereId != sphere.sphereId) {
            return false;
        }
        if (center == null) {
            if (sphere.center != null) {
                return false;
            }
        } else if (!center.equals(sphere.center)) {
            return false;
        }
        return Double.compare(sphere.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return (int) (31 * sphereId + (center != null ? center.hashCode() : 0) + radius);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Sphere.class.getSimpleName() + "[", "]")
                .add("sphereId=" + sphereId)
                .add("center=" + center)
                .add("radius=" + radius)
                .toString();
    }

    @Override
    public void attach(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void detach(Observer observer) {
        this.observer = null;
    }

    @Override
    public void notifyObservers() {
        observer.actionPerformed(this);
    }
}
