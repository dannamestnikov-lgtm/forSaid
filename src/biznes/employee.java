package biznes;

public class employee {
    private String name;
    private int salary;
    private int experience;

    public employee(String name, int salary, int experience) {
        setName(name);
        this.name = name;
        setSalary(salary);
        this.salary = salary;
        this.experience = experience;
    }

    public void setName(String name) {
        if (name.length() < 15) {
            this.name = name;
        } else {
            System.out.println("Ошибка. Слишком длинное имя");
            this.name = "неизвестно";
        }
    }

    public void setSalary(int salary) {
        if (salary > 50000) {
            this.salary = salary;
        } else {
            System.out.println("Ошибка. Зарплата не может быть меньше 50.000 рублей");
            this.salary = 0;
        }
    }

    // input: пять плюс пять
    // output: десять
    // input: восемь плюс восемь
    // output: шестнадцать
    // input: сто двадцать шесть минус тридцать два
    // output: девяносто четыре
//    public String dapohui() {
//        String sum = "Пять +пять";
//    }


    public employee(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public int getSalary() {
        return this.salary;
    }
    public int getExperience() {
        return this.experience;
    }
}

