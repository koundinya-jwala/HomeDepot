package com.homedepot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homedepot.model.Tool;

@Repository
public interface ToolRepository extends JpaRepository<Tool, Integer> {

	Tool findByToolCode(String toolCode);
	

}
