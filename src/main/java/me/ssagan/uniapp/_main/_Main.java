package me.ssagan.uniapp._main;

import me.ssagan.uniapp.controller.DrinkController;
import me.ssagan.uniapp.controller.IntroduceController;
import me.ssagan.uniapp.controller.StudentController;
import me.ssagan.uniapp.controller.TeacherController;
import me.ssagan.uniapp.model.Student;
import me.ssagan.uniapp.model.Teacher;
import me.ssagan.uniapp.model.University;

//- Написать мини-приложение реализующее следующий функционал:
//    1. Сущности студент, университет, преподаватель
//    2. Сущности являются полями друг друга в зависимости от логики
//      (Например если бы у нас были сущности: "кот", "хозяйка кота", то
//      кот мог бы быть полем "питомец" у человека, а человек полем "хозяин" у кота).
//      В вашем же случае у нас 3 сущности.
//    3. Создать интерфейсы с действиями преподавателя, студента.
//      (три интерфейса, один с общими действиями, и по 1 с уникальным поведением для этих 2 сущностей)
//    4. в классе _Main, методе main() вызвать сервис, запускающий методы студента и продемонстрировать часть методов поведения
//    5. в классе _Main, методе main() вызвать сервис, запускающий методы преподавателя и продемонстрировать часть методов поведения
//    6. создаем несколько сущностей, инициализируем поля, и запускаем у сервисов методы демонстрации
//    7. само поведение должно запускаться с использованием интерфейсов
public class _Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();
        DrinkController drinkController = new DrinkController();
        IntroduceController introduceController = new IntroduceController();

        University universityYRGU = new University("ЯрГУ");
        Teacher teacherDolnikov = new Teacher("Дольников", universityYRGU);
        Teacher teacherKubishkin = new Teacher("Кубышкин", universityYRGU);
        Student studentSvetlana = new Student("Светлана", universityYRGU, teacherKubishkin);
        Student studentMaria = new Student("Мария", universityYRGU, teacherKubishkin);
        Student studentLubov = new Student("Любовь", universityYRGU, teacherDolnikov);

        introduceController.intro(teacherDolnikov);
        introduceController.intro(teacherKubishkin);
        introduceController.intro(studentSvetlana);
        introduceController.intro(studentMaria);
        introduceController.intro(studentLubov);
        teacherController.letsTeach(teacherKubishkin);
        drinkController.letsDrinkBeer(teacherKubishkin);
        teacherController.letsTeach(teacherDolnikov);
        drinkController.letsDrinkBeer(teacherDolnikov);
        studentController.letsStudy(studentSvetlana);
        drinkController.letsDrinkBeer(studentSvetlana);
        studentController.letsStudy(studentMaria);
        drinkController.letsDrinkBeer(studentMaria);
        studentController.letsStudy(studentLubov);
        drinkController.letsDrinkBeer(studentLubov);
    }
}
