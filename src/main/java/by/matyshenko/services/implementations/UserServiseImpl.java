package by.matyshenko.services.implementations;

import by.matyshenko.entity.Note;
import by.matyshenko.repository.UserRepository;
import by.matyshenko.services.interfaces.UserServise;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserServiseImpl implements UserServise {
    private final UserRepository userRepository;

    @Autowired
    public UserServiseImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<Note> save(Note note) {
        return Optional.of(userRepository.save(note));
    }
}
