package Lecture2.Important;

class Doo extends Protected {
    public void M() {
        Protected.count = 123;
    }
}

public class Protected {
    protected static Integer count;// заменили private на protected и вверху появился count
                                   // Protected.count = 123;

    public static Integer getCount() {
        return count;
    }
}
