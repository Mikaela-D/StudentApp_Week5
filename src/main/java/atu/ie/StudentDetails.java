package atu.ie;

public class StudentDetails {
    private String name;
    private String email;
    private String course;

    public String getName() {
        return name;
    }

    public StudentDetails() {
        this.name = "";
        this.email = "";
        this.course = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}




