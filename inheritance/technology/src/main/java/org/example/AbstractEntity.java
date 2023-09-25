package org.example;

public class AbstractEntity {

    private int Id;
    private static int nextId = 1;

    public AbstractEntity() {
        Id = nextId;
        nextId++;
    }

    public int getId() {
        return Id;
    }
}
