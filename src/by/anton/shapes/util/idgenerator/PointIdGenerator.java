package by.anton.shapes.util.idgenerator;

public class PointIdGenerator {
    private static long id;

    public static long generatePointId(){
        return id++;
    }
}
