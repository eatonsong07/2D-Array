public class Person {
    private String name;

    public Person(String x) {
        name = x;
    }

    @Override
    public String toString() {
        return "My name is " + name;
    }
}
