package utils;

import entity.Ride;

import java.util.Comparator;

public class VisitorComparator implements Comparator<Ride> {
    @Override
    public int compare(Ride v1, Ride v2) {
        // 首先根据年龄比较
        if (v1.getAge() != v2.getAge()) {
            return Integer.compare(v1.getAge(), v2.getAge());
        }
        // 如果年龄相同，则根据名字比较
        return v1.getName().compareTo(v2.getName());
    }
}