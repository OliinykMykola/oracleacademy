//package ua.oracleacademy.fp.domain;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//public class Freelancer extends User {
//
//@Column(name = "SKILLS")
//    private String skills;
//
//    @Column
//    @OneToMany(fetch = FetchType.LAZY)
//    private List <Task> workHistory;
//
//    public Freelancer() {
//    }
//
//    public String getSkills() {
//        return skills;
//    }
//
//    public void setSkills(String skills) {
//        this.skills = skills;
//    }
//
//    public List<Task> getWorkHistory() {
//        return workHistory;
//    }
//
//    public void setWorkHistory(List<Task> workHistory) {
//        this.workHistory = workHistory;
//    }
//}
