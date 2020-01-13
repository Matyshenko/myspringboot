package by.matyshenko.services.interfaces;

import by.matyshenko.entity.Note;

import java.util.Optional;

public interface UserServise {
    Optional<Note> save(Note note);
}
