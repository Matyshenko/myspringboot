package by.matyshenko.controllers;

import by.matyshenko.entity.Note;
import by.matyshenko.services.interfaces.NoteService;
import by.matyshenko.services.interfaces.UserServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class NoteController {

    private NoteService service;

    @Autowired
    public void setNoteService(NoteService service) {
        this.service = service;
    }

      @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        Note note = service.getNoteById(id);
        model.addAttribute("note", note);
        return "operations/edit";
    }

    @PostMapping("/update")
    public String saveNote(@RequestParam Integer id, @RequestParam String message,
                           @RequestParam(value = "done", required = false) boolean done) {
        service.updateNote(id, message, done);
        return "redirect:/";
    }

}
