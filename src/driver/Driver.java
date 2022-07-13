package driver;

public class Driver {
    private String name;
    private int age;
    private int wonRaces;

    public Driver(String name, int age, int wonRaces) {
        this.name = name;
        this.age = age;
        this.wonRaces = wonRaces;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWonRaces() {
        return wonRaces;
    }

    public void setWonRaces(int wonRaces) {
        this.wonRaces = wonRaces;
    }
}
