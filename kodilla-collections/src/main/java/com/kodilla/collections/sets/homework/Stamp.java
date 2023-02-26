package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    private String stampName;
    private String dimensions;
    private boolean isStamped;

    public Stamp(String stampName, String dimensions, boolean isStamped) {
        this.stampName = stampName;
        this.dimensions = dimensions;
        this.isStamped = isStamped;
    }

    public String getStampName() {
        return stampName;
    }

    public String getDimensions() {
        return dimensions;
    }

    public boolean isStamped() {
        return isStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp stamp)) return false;
        return isStamped() == stamp.isStamped() && Objects.equals(getStampName(), stamp.getStampName()) && Objects.equals(getDimensions(), stamp.getDimensions());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStampName(), getDimensions(), isStamped());
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", dimensions='" + dimensions + '\'' +
                ", isStamped=" + isStamped +
                '}';
    }
}
