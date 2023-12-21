package com.alinesno.infra.ops.tester.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.ops.tester.entity.TestExecutionEntity;
import com.alinesno.infra.ops.tester.mapper.TestExecutionMapper;
import com.alinesno.infra.ops.tester.service.ITestExecutionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestExecutionServiceImpl extends IBaseServiceImpl<TestExecutionEntity, TestExecutionMapper> implements ITestExecutionService {
}
