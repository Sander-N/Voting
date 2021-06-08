package voting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import voting.messaging.Sender;

@RestController
public class VotingController {

    @Autowired
    Sender sender;

    @CrossOrigin
    @PostMapping(value = "/", consumes = "application/json", produces = "application/json")
    public String newVote(@RequestBody String vote) {
        sender.send(vote);
        return "Sent";
    }

    @GetMapping("/")
    public String index() {
        return "";
    }
}
