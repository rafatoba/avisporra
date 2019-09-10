package com.avisporra.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avisporra.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long>{
    
    List<Team> findByCompetitionGroup(String competitionGroup);

}
