package main.java.PiTest;

public class Employee {
    private String Name;
    private String JobTitle;
    private Float Salary;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    public void setJobTitle(String jobTitle) {
        JobTitle = jobTitle;
    }

    public Float getSalary() {
        return Salary;
    }

    public void setSalary(Float salary) {
        Salary = salary;
    }

    public Employee(String name, String jobTitle, Float salary)
    {
        Name = name;
        JobTitle = jobTitle;
        Salary = salary;
    }

    public String Introduce(){
        if (Name != "") {
            return (String.format("Hi! My name is %s and I work as a %s.", Name, JobTitle));
        } else {
            return "Funcionario sem nome";
        }
    }

    public void GiveRaise(Float percentage){
        Salary = Salary + (Salary  (percentage / 100));
    }

    private Float Salary(float v) {
        return getSalary();
    }
}