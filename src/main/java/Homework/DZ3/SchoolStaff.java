package Homework.DZ3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class SchoolStaff implements Iterator {
    private List staff = new LinkedList<>();

    public SchoolStaff() {
        staff = new LinkedList<Objects>();
    }

    public List getStaff() {
        return staff;
    }
    public void addSchoolStaff(Object object) {
        staff.add(object);
    }
    int index;
    @Override
    public boolean hasNext() {
        return index < staff.size();
    }
    @Override
    public Object next() {
        return staff.get(index++);
    }
}


