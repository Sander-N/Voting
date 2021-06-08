package voting.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class VotingController {

    @CrossOrigin
    @PostMapping(value = "/", consumes = "application/json", produces = "application/json")
    public String newVote(@RequestBody String vote) {
        System.out.println(vote);
        return vote;
    }


    @GetMapping("/")
    public String index() {
        return "";
    }
}
