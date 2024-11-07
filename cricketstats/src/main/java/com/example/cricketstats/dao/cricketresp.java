
package com.example.cricketstats.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cricketstats.model.cricket;

@Repository
public interface cricketresp extends JpaRepository<cricket,Long>{

}
