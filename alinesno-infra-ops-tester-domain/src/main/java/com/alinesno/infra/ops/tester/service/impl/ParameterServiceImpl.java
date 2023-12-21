package com.alinesno.infra.ops.tester.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.ops.tester.entity.ParameterEntity;
import com.alinesno.infra.ops.tester.mapper.ParameterMapper;
import com.alinesno.infra.ops.tester.service.IParameterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ParameterServiceImpl extends IBaseServiceImpl<ParameterEntity, ParameterMapper> implements IParameterService {
}
