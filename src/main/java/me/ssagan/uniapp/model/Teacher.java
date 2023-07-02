package me.ssagan.uniapp.model;

public class Teacher implements Teachable, Introduceble {
    private String name;
    private University university;

    public Teacher() {
    }
    public Teacher(String name, University university) {
        this.name = name;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    @Override
    public void drinkBeer() {
        System.out.println(name + ": Бесполезно их учить - лучше выпью я чайку!");
    }

    @Override
    public void teach() {
        System.out.println(name + ": Я учу лентяев.");
    }

    @Override
    public void introduce() {
        System.out.format("Я преподаватель %s %s.", university.getName(), name);
        System.out.println();
    }
}
