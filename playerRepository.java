package com.tester.Tester.Repository;

import com.tester.Tester.Entity.player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface playerRepository  extends JpaRepository<player, Long> {


}
