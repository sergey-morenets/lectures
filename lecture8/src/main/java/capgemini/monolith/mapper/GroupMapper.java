package capgemini.monolith.mapper;

import capgemini.monolith.dto.GroupDTO;
import capgemini.monolith.model.Group;

public class GroupMapper {

    public GroupDTO toDTO(Group group) {
        GroupDTO groupDTO = new GroupDTO();
        groupDTO.setId(group.getId());
        groupDTO.setName(groupDTO.getName());
        return groupDTO;
    }
}
