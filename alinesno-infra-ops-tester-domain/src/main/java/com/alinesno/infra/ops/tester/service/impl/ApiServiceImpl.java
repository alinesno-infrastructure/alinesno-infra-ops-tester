package com.alinesno.infra.ops.tester.service.impl;

import com.alinesno.infra.ops.tester.entity.ApiEntity;
import com.alinesno.infra.ops.tester.mapper.ApiMapper;
import com.alinesno.infra.ops.tester.service.IApiService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ApiServiceImpl extends IBaseServiceImpl<ApiEntity , ApiMapper> implements IApiService {
}
