package person;

public abstract class Employee {
    public String tester;
    public void Info(String tester){
        this.tester=tester;
    }

 abstract public void name();

    @Override
    public String toString() {
        return "Employee{" +
                "tester='" + tester + '\'' +
                '}';
    }
}
