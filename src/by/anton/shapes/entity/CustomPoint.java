package by.anton.shapes.entity;

import static by.anton.shapes.util.idgenerator.IdGenerator.*;


public class CustomPoint {
    private final long id;
    private double coordinateX;
    private double coordinateY;


    public CustomPoint(){ id = generatePointId();}

    public CustomPoint(double coordinateX, double coordinateY) {
        this();
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomPoint that = (CustomPoint) o;
        return Double.compare(that.coordinateX, coordinateX) == 0 &&
                Double.compare(that.coordinateY, coordinateY) == 0;
    }

    @Override
    public int hashCode() {
        return (int)(17 * id+ coordinateX + 32 * coordinateY);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("\nCustomPoint{");
        sb.append("\nid = ").append(id);
        sb.append("\ncoordinateX=").append(coordinateX);
        sb.append("\ncoordinateY=").append(coordinateY);
        sb.append("\n}\n");
        return sb.toString();
    }
}
