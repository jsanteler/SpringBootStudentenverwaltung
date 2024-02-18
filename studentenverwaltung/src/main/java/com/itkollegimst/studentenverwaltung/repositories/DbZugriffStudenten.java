package com.itkollegimst.studentenverwaltung.repositories;

import com.itkollegimst.studentenverwaltung.domain.Student;
import com.itkollegimst.studentenverwaltung.exceptions.StudentNichtGefunden;

import java.util.List;

public interface DbZugriffStudenten {

    Student studentSpeichern (Student student);
    List<Student> alleStudenten();
    Student studentMitId(Long id) throws StudentNichtGefunden;
    List<Student> alleStudentenAusDemOrt(String plz);
    void studentLoeschenMitId(Long id);
}
