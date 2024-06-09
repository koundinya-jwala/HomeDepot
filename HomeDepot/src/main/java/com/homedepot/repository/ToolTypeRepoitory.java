package com.homedepot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homedepot.model.ToolType;


@Repository
public interface ToolTypeRepoitory extends JpaRepository<ToolType, Integer> {

}
