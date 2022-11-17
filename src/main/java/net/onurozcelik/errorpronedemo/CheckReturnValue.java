package net.onurozcelik.errorpronedemo;

public class CheckReturnValue implements BugPattern {
    @Override
    public void generate() {
        String str = "Test";
        str = str.concat("\n");
    }
}
