package ua.lviv.lgs.entrant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.lgs.entrant.domain.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer>{

}
