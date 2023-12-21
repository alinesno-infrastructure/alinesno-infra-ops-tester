package com.alinesno.infra.ops.tester.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.ops.tester.entity.TestPlanEntity;
import com.alinesno.infra.ops.tester.mapper.TestPlanMapper;
import com.alinesno.infra.ops.tester.service.ITestPlanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestPlanServiceImpl extends IBaseServiceImpl<TestPlanEntity, TestPlanMapper> implements ITestPlanService {
}
