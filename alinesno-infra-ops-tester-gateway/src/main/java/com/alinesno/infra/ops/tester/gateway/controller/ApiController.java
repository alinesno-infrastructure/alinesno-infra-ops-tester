package com.alinesno.infra.ops.tester.gateway.controller;

import com.alinesno.infra.common.facade.pageable.DatatablesPageBean;
import com.alinesno.infra.common.facade.pageable.TableDataInfo;
import com.alinesno.infra.common.facade.response.AjaxResult;
import com.alinesno.infra.common.web.adapter.rest.BaseController;
import com.alinesno.infra.ops.tester.entity.ApiEntity;
import com.alinesno.infra.ops.tester.service.IApiService;
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
@RequestMapping("/api/infra/ops/tester/api")
public class ApiController extends BaseController<ApiEntity, IApiService> {

    @Autowired
    private IApiService service;

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
     * 解析api的yaml文件
     * @return
     */
    @PostMapping("/parseApiYaml")
    public AjaxResult parseApiYaml(@RequestBody String apiYaml){

        log.debug("api yaml = {}" , apiYaml);

        return AjaxResult.success() ;
    }

    @Override
    public IApiService getFeign() {
        return this.service;
    }
}