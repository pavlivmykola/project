package ua.lviv.lgs.entrant.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.lgs.entrant.domain.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	List<User>findByEmail(String email);
	
}
