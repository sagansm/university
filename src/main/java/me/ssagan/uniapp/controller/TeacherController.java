package me.ssagan.uniapp.controller;

import me.ssagan.uniapp.model.Teachable;

public class TeacherController {
    public void letsTeach(Teachable teachable) {
        teachable.teach();
    }
}
