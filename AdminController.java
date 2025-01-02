package com.tester.Tester.Controller;

import com.tester.Tester.Entity.Match;
import com.tester.Tester.Entity.player;
import com.tester.Tester.Service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AdminController {
    @Autowired
        private MatchService matchService;

       @PostMapping("/save")
        public String saveplayer(@RequestBody player player)
        {
            matchService.saveplayer(player);
            return "palyer data saved";

        }


        @GetMapping("/Allsavedata")
        public List<player> getplayer()
        {
            return matchService.getplayer();
        }


        @GetMapping("/Allsavedata/{id}")
        public Optional<player> findbyid(@PathVariable Long id)
        {
            return matchService.findbyid(id);
        }

        @PostMapping ("/playing11")
        public List<player> playing11(@RequestBody List<player> players)
        {
            return matchService.playing11(players);
        }



        @PostMapping("/savematch")
    public Match saveMatch(@RequestBody Match match)
        {
            return matchService.saveMatch(match);
        }

        @GetMapping("/allmatch")
        public List<Match> allmatch()
        {
            return matchService.allmatch();
        }

        @DeleteMapping("/allmatch/{id}")
        public void deletematch(@PathVariable Long id)
        {
            matchService.deletematch(id);


        }
//
//        @PutMapping("/match/{id}")
//    public Match updatematch(@PathVariable int teamAs)






//
//        @GetMapping("/matches")
//        public List<Match> manageMatches(Match match) {
//            return matchService.getAllMatches();

//        }
//

//        @PostMapping("/updateScore")
//        public Match updateScore(@RequestParam Long id, @RequestParam int teamAScore, @RequestParam int teamBScore) {
//            Match match = matchService.getMatchById(id);
//            if (match != null) {
//                match.setTeamAScore(teamAScore);
//                match.setTeamBScore(teamBScore);
//                matchService.saveMatch(match);
//            }
//
//            return match;
//        }


        }
