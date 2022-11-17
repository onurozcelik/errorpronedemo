package net.onurozcelik.errorpronedemo;

public class ErrorProneDemo {
    public static void main(String[] args) {
        BugPattern[] patterns = {new ArrayEquals(), new CollectionIncompatibleType()
                , new MissingCasesInEnumSwitch(), new CheckReturnValue()};
        for (BugPattern pattern : patterns) {
            pattern.generate();
        }
    }
}
