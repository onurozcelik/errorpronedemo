package net.onurozcelik.errorpronedemo;

public class ArrayEquals implements BugPattern {
    public boolean compare(String[] firstList, String[] secondList) {
        return firstList.equals(secondList);
    }

    @Override
    public void generate() {
        String[] firstList = {"apple", "apple", "apple"};
        String[] secondList = {"orange", "orange", "orange"};
        compare(firstList, secondList);
    }
}
