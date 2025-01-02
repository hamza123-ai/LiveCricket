package com.tester.Tester.Service;

import com.tester.Tester.Entity.Match;
import com.tester.Tester.Entity.player;
import com.tester.Tester.Repository.MatchRepository;
import com.tester.Tester.Repository.playerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatchService {
    @Autowired
    private MatchRepository matchRepository;
    @Autowired
    private playerRepository playerRepository;


    public player saveplayer(player player) {
        return playerRepository.save(player);
    }

    public List<player> getplayer() {
        return playerRepository.findAll();
    }

    public Optional<player> findbyid(long id) {
        return playerRepository.findById(id);
    }

    public List<player> playing11(List<player> players) {
        return playerRepository.saveAll(players);
    }

//
//    public List<Match> getAllMatches() {
//        return matchRepository.findAll();
//    }
//
//    public Match getMatchById(Long id) {
//        return matchRepository.findById(id).orElse(null);
//    }
//
    public Match saveMatch(Match match) {
         return matchRepository.save(match);
    }

    public List<Match >allmatch() {
        return matchRepository.findAll();
    }

    public void deletematch(Long id) {
        matchRepository.deleteById(id);
    }
//
//    public Match getMatchById(Long id) {
//        return matchRepository.findById(id);
//    }
}
