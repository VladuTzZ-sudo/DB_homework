package DeutscheBank.Day1;

public class Doctor{
    private String name;
    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                '}';
    }
    public Doctor(){

    }

    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
