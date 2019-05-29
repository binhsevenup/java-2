package entity;

public class Student {
    private String enrolId;
    private String firstName;
    private String lastName;
    private int age;

    public Student() {
    }



    public Student(String enrollId, String firstName, String lastName, int age) {
        this.enrolId = enrollId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getEnrollId() {
        return enrolId;
    }

    public void setEnrollId(String enrollId) {
        this.enrolId = enrollId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
