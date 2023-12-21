package com.alinesno.infra.ops.tester.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.ops.tester.entity.TestReportEntity;
import com.alinesno.infra.ops.tester.mapper.TestReportMapper;
import com.alinesno.infra.ops.tester.service.ITestReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestReportServiceImpl extends IBaseServiceImpl<TestReportEntity, TestReportMapper> implements ITestReportService {
}
