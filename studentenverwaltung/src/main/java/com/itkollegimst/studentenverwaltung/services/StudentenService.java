package com.itkollegimst.studentenverwaltung.services;

import com.itkollegimst.studentenverwaltung.domain.Student;
import com.itkollegimst.studentenverwaltung.exceptions.StudentNichtGefunden;

import java.util.List;

public interface StudentenService {

    List<Student> gibAlleStudenten();
    Student studentEinfuegen(Student student);
    Student studentMitId(Long id) throws StudentNichtGefunden;
    List<Student> alleStudentenMitPlz(String plz);
    void studentLoeschenMitId(Long id);

}
