package by.matyshenko.repository;

import by.matyshenko.entity.Note;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Note, Integer> {
}
