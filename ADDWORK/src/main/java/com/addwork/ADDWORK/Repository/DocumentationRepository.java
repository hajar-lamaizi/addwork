package com.addwork.ADDWORK.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.addwork.ADDWORK.entities.Documentation;

@Repository
public interface DocumentationRepository extends JpaRepository<Documentation, Long > {

}
