package by.matyshenko.services.implementations;

import by.matyshenko.entity.Note;
import by.matyshenko.repository.NoteRepository;
import by.matyshenko.services.interfaces.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NoteServiceImpl implements NoteService{

    private NoteRepository repository;

    @Autowired
    public void setProductRepository(NoteRepository repository) {
        this.repository = repository;
    }

    @Override
    public Note getNoteById(Integer id) {
                return null;
    }

    @Override
    public void saveNote(Note note) {
        repository.save(note);
    }

    @Override
    public void updateNote(Integer id, String message, boolean done) {

    }

    @Override
    public void deleteNote(Integer id) {

    }

    @Override
    public List<Note> findAllByOrderByDateAsc() {
        return repository.findAllByOrderByDateAsc();
    }

    @Override
    public List<Note> findAllByOrderByDateDesc() {
        return repository.findAllByOrderByDateDesc();
    }
}