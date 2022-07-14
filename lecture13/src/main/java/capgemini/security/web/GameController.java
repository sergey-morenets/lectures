package capgemini.security.web;

import capgemini.security.model.Game;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("games")
public class GameController {

    @GetMapping
    public List<Game> findAll() {
        return List.of(new Game());
    }

    @PostMapping
    public void create(@RequestBody Game game) {

    }


}
