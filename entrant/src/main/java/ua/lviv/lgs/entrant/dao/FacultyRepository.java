package ua.lviv.lgs.entrant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.lgs.entrant.domain.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Integer>{

}
