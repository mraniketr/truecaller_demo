package com.aniket.truecaller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aniket.truecaller.model.users;

public interface userRepo extends JpaRepository<users, Integer>{

	List<users> findByphone(String phone);
	
	@Query("from users where name like %?1%")
	List<users> findByname(String name);

}
