package com.alinesno.infra.ops.tester.service;

import com.alinesno.infra.common.facade.services.IBaseService;
import com.alinesno.infra.ops.tester.entity.ProjectEntity;

public interface IProjectService extends IBaseService<ProjectEntity> {

    /**
     * 创建项目
     * @param project
     */
    void createProject(ProjectEntity project);

}
