package by.gaponenko.sphere.generator;

public class IdGenerator {
    private static final long MIN_ID = 1L;
    private static final long MAX_ID = 100_000L;
    private static long id;

    private IdGenerator() {
    }

    public static long generateId() {
        id++;
        if (MIN_ID + id >= MAX_ID) {
            id = 0;
        }
        return id;
    }

    public static void setId(long id) {
        IdGenerator.id = id;
    }
}
