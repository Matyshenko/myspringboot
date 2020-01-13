package by.matyshenko.repository;

import by.matyshenko.entity.Note;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Integer> {

    List<Note> findAllByOrderByDateAsc();
    List<Note> findAllByOrderByDateDesc();
    Page<Note> findAllByDoneTrueOrderByDateDesc(Pageable pageable);
}
