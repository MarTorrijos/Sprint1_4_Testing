package org.Level_2.ejercici_2;

import java.util.Objects;

public class ObjectReference {

    private int id;

    public ObjectReference(int id) {
        this.id = id;
    }

    public static boolean isSameObject(Object object1, Object object2) {
        return object1.equals(object2);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ObjectReference that = (ObjectReference) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}