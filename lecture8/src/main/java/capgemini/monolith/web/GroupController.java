package capgemini.monolith.web;

import capgemini.monolith.dto.GroupDTO;
import capgemini.monolith.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("groups")
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;

    private final ModelMapper modelMapper;

    @GetMapping
    public List<GroupDTO> findAll() {
        return groupService.findAll().stream().map(group -> modelMapper.map(group, GroupDTO.class)).toList();
    }
}
