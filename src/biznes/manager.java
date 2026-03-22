package biznes;

public class manager extends employee {
    private int teamSize;
    public manager (String name, int salary, int experience, int teamSize) {
        super(name, salary, experience);
        this.teamSize = teamSize;
        System.out.println("имя сотрудника: " + this.getName() + "\nзарплата: " + this.getSalary() + "\nопыт: " + this.getExperience() + " года" + "\nсотрудников под руководством: " + teamSize);
    }
}
