package ua.lviv.lgs.entrant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.lgs.entrant.domain.Enrolled;

public interface EnrolledRepository extends JpaRepository<Enrolled, Integer>{

}
