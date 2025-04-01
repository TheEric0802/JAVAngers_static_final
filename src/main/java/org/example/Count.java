package org.example;

public class Count {

    private static int totalCount = 0;
    private int instanceCount = 0;

    public static void incrementTotalCount() {
        totalCount++;
    }

    public void incrementInstanceCount() {
        instanceCount++;
    }

    @Override
    public String toString() {
        return "Count{" +
                "totalCount=" + totalCount +
                ", instanceCount=" + instanceCount +
                '}';
    }
}
