package capgemini.security.web;

import capgemini.security.model.Game;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("games")
public class GameController {

    @GetMapping
    @Secured("ROLE_ADMIN")
    public List<Game> findAll() {
        return List.of(new Game());
    }

    @PostMapping
    @Secured("ADMIN")
    public void create(@RequestBody Game game) {

    }


}
