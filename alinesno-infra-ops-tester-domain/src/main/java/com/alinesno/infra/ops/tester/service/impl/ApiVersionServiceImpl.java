package com.alinesno.infra.ops.tester.service.impl;

import com.alinesno.infra.ops.tester.entity.ApiVersionEntity;
import com.alinesno.infra.ops.tester.mapper.ApiVersionMapper;
import com.alinesno.infra.ops.tester.service.IApiVersionService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ApiVersionServiceImpl extends IBaseServiceImpl<ApiVersionEntity, ApiVersionMapper> implements IApiVersionService {
}
