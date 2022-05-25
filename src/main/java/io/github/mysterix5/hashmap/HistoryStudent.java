package io.github.mysterix5.hashmap;

import java.util.Objects;
import java.util.UUID;

public class HistoryStudent implements Student {
    final private String ID = UUID.randomUUID().toString();

    private String name;
    private int codewarsRanking;
    private String course;

    public HistoryStudent() {
        name = "name";
        codewarsRanking = 0;
        course = "School of life";
    }

    public HistoryStudent(String name, int codewarsRanking, String course){
        this.name = name;
        this.codewarsRanking = codewarsRanking;
        this.course = course;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, i am a history student!");
    }
    public String getID() {
        return ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistoryStudent student = (HistoryStudent) o;
        return codewarsRanking == student.codewarsRanking && Objects.equals(name, student.name) && Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, codewarsRanking, course);
    }


    @Override
    public String toString() {
        return "Student " + name + " is in " + course + " and is ranked " + codewarsRanking;
    }
}
