package com.itkollegimst.studentenverwaltung.controller;

import com.itkollegimst.studentenverwaltung.domain.Student;
import com.itkollegimst.studentenverwaltung.exceptions.StudentNichtGefunden;
import com.itkollegimst.studentenverwaltung.services.StudentenService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/studenten")
public class StudentRestController {

    private StudentenService studentService;

    public StudentRestController(StudentenService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<List<Student>> gibAlleStudenten()
    {
        return ResponseEntity.ok(this.studentService.gibAlleStudenten());
    }

    @PostMapping
    public ResponseEntity<Student> studentEinfuegen(@RequestBody Student student){

        return ResponseEntity.ok(this.studentService.studentEinfuegen(student));
    }

    @DeleteMapping("/{id}")
    public String studentLoeschen(@PathVariable Long id){

        this.studentService.studentLoeschenMitId(id);
        return "Student gelöscht";
    }

    @GetMapping("/mitplz/{plz}")
    public ResponseEntity<List<Student>> alleStudentenMitPlz(@PathVariable String plz){

        return ResponseEntity.ok(this.studentService.alleStudentenMitPlz(plz));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> studentMitId(@PathVariable Long id) throws StudentNichtGefunden {

        return ResponseEntity.ok(this.studentService.studentMitId(id));
    }
}
