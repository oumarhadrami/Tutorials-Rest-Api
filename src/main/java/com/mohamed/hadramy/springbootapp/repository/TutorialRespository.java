package com.mohamed.hadramy.springbootapp.repository;

import java.util.List;

import com.mohamed.hadramy.springbootapp.model.Tutorial;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRespository extends JpaRepository<Tutorial, Long> {
    Page<Tutorial> findByPublished(boolean published, Pageable pageable);

    Page<Tutorial> findByTitleContaining(String title, Pageable pageable);
    
    List<Tutorial> findByTitleContaining(String title, Sort sort);
}
