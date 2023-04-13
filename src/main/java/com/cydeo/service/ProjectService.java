package com.cydeo.service;

import com.cydeo.dto.ProjectDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProjectService {

    ProjectDTO getByProjectCode(String code);
    List<ProjectDTO> listAllProjects();
    void save(ProjectDTO dto);
    void delete(String code);

}
