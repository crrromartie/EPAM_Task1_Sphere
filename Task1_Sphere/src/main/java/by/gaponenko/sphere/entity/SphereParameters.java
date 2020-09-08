package by.gaponenko.sphere.entity;

import java.util.StringJoiner;

public class SphereParameters {
    private double volume;
    private double square;

    public SphereParameters(double volume, double square) {
        this.volume = volume;
        this.square = square;
    }

    public SphereParameters() {
    }

    public double getVolume() {
        return volume;
    }

    public double getSquare() {
        return square;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setSquare(double square) {
        this.square = square;
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
        SphereParameters that = (SphereParameters) o;
        if (Double.compare(that.volume, volume) != 0) return false;
        return Double.compare(that.square, square) == 0;
    }

    @Override
    public int hashCode() {
        return (int) (31 * volume + square);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SphereParameters.class.getSimpleName() + "[", "]")
                .add("volume=" + volume)
                .add("square=" + square)
                .toString();
    }
}
