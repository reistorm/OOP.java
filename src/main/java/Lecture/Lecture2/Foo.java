package Lecture.Lecture2;

class Doo extends Foo {
    public void M() {
        Foo.count = 14;
    }
}

public class Foo {
    public Integer value;
    protected static Integer count;
    public static int getCount() {
        return count;
    }
    static {
        count = 0;
    }
    public Foo() {
        count++;
    }
    public void printCount() {
        System.out.println(count);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
