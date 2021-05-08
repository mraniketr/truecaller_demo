package com.aniket.truecaller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aniket.truecaller.model.users;

public interface userRepo extends JpaRepository<users, Integer>{

}
