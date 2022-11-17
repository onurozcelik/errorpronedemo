package net.onurozcelik.errorpronedemo;

public class MissingCasesInEnumSwitch implements BugPattern {
    enum Colors {RED, GREEN, BLUE}

    @Override
    public void generate() {
        Colors color = Colors.BLUE;
        switch (color) {
            case RED:
            case GREEN:
                paint(color);
                break;
        }
    }

    void paint(Colors color) {
        //do some stuff
    }
}
