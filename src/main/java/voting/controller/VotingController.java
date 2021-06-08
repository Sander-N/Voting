package voting.controller;

import org.springframework.web.bind.annotation.*;
import voting.Vote;

@RestController
public class VotingController {

    @CrossOrigin
    @PostMapping("/")
    public String vote(@RequestParam (required = true, defaultValue = "Vote") Vote vote) {
        return "";
    }


    @GetMapping("/")
    public String index() {
        return "";
    }
}
