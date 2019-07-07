package ua.lviv.lgs.entrant.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.lgs.entrant.domain.Record;

public interface RecordRepository extends JpaRepository<Record, Integer>{

}
