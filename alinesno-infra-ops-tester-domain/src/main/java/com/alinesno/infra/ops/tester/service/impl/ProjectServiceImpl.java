package com.alinesno.infra.ops.tester.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.ops.tester.entity.ProjectEntity;
import com.alinesno.infra.ops.tester.mapper.ProjectMapper;
import com.alinesno.infra.ops.tester.service.IProjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProjectServiceImpl extends IBaseServiceImpl<ProjectEntity, ProjectMapper> implements IProjectService {

    @Override
    public void createProject(ProjectEntity project) {
        this.save(project) ;
    }

}
