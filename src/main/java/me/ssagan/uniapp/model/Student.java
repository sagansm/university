package me.ssagan.uniapp.model;

public class Student implements Studyble, Introduceble {
    private String name;
    private University university;
    private Teacher teacher;

    public Student() {
    }

    public Student(String name, University university, Teacher teacher) {
        this.name = name;
        this.university = university;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public University getUniversity() {
        return university;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void drinkBeer() {
        System.out.println(name + ": Слишком сложно. Выпью-ка я чайку!");
    }

    @Override
    public void study() {
        System.out.println(name + ": Пора бы поучиться");
    }

    @Override
    public void introduce() {
        System.out.format("Я студент %s %s. Мой научный руководитель %s.", university.getName(), name, teacher.getName());
        System.out.println();
    }
}
