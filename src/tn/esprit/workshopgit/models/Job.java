package tn.esprit.workshopgit.models;

public class Job {
    
    private String name;
    private String description;
    private int salary;
    private String location;

    public Job() {
    }
    public Job(String name, String description, int salary, String location) {
        this.name = name;
        this.description = description;
        this.salary = salary;
        this.location = location;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getSalary() {
        return salary;
    }
    public String getLocation() {
        return location;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    @Override
    public String toString() {
        return "Job{" + "name=" + name + ", description=" + description + ", salary=" + salary + ", location=" + location + '}';
    }
    
}
