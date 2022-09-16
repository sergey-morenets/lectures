package capgemini.monolith.service;

import capgemini.monolith.model.Group;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {

    public List<Group> findAll() {
        return List.of(new Group(1, "Java Advanced"));
    }
}
