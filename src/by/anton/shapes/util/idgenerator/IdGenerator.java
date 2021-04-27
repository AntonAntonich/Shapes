package by.anton.shapes.util.idgenerator;

public class IdGenerator {
    private static long rectangleId;
    private static long pointId;

    public static  long generateRectangleId(){
        return ++rectangleId;
    }

    public static long generatePointId () {
        return ++pointId;
    }

}
