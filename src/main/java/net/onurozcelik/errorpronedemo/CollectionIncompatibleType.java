package net.onurozcelik.errorpronedemo;

import java.util.HashSet;
import java.util.Set;

public class CollectionIncompatibleType implements BugPattern {
    @Override
    public void generate() {
        Set<Short> s = new HashSet<>();
        for(short i = 0; i < 100; i++) {
            s.add(i);
            s.remove(i - 1);
        }
        System.out.println(s.size());
    }
}
