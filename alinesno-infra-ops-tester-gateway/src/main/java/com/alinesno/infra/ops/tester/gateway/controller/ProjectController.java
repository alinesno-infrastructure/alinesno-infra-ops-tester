package com.alinesno.infra.ops.tester.gateway.controller;

import com.alinesno.infra.common.facade.pageable.DatatablesPageBean;
import com.alinesno.infra.common.facade.pageable.TableDataInfo;
import com.alinesno.infra.common.facade.response.AjaxResult;
import com.alinesno.infra.common.web.adapter.rest.BaseController;
import com.alinesno.infra.ops.tester.entity.ProjectEntity;
import com.alinesno.infra.ops.tester.service.IProjectService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * 应用构建Controller
 * 处理与ApplicationEntity相关的请求
 * 继承自BaseController类并实现IApplicationService接口
 * 
 * @version 1.0.0
 * @since 2023-09-30
 */
@Slf4j
@RestController
@Scope("prototype")
@RequestMapping("/api/infra/ops/tester/project")
public class ProjectController extends BaseController<ProjectEntity, IProjectService> {

    @Autowired
    private IProjectService service;

    /**
     * 获取ApplicationEntity的DataTables数据
     * 
     * @param request HttpServletRequest对象
     * @param model Model对象
     * @param page DatatablesPageBean对象
     * @return 包含DataTables数据的TableDataInfo对象
     */
    @ResponseBody
    @PostMapping("/datatables")
    public TableDataInfo datatables(HttpServletRequest request, Model model, DatatablesPageBean page) {
        log.debug("page = {}", ToStringBuilder.reflectionToString(page));
        return this.toPage(model, this.getFeign(), page);
    }

    /**
     * 创建项目
     * @param project
     * @return
     */
    @PostMapping("/createProject")
    public AjaxResult createProject(@RequestBody ProjectEntity project){

        log.debug("project = {}" , project);

        service.createProject(project) ;

        return AjaxResult.success() ;
    }

    @Override
    public IProjectService getFeign() {
        return this.service;
    }
}