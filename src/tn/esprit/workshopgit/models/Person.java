package tn.esprit.workshopgit.models;
public class Person {

    
    private String name;
    private String address;
    private int age;
    private String email;
    private String phone;
    private String password;
    private Job job;

    public Person() {
    }
    public Person(String name, String address, int age, String email, String phone, String password, Job job
    ) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.job = job;
    }   
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public String getPassword() {
        return password;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Job getJob() {
        return job;
    }
    public void setJob(Job job) {
        this.job = job;
    }
    @Override
    public String toString() {
        return "Person [address=" + address + ", age=" + age + ", email=" + email + ", name=" + name + ", password="
                + password + ", phone=" + phone + ", job name =" + job.getName() + "]";
    }
}