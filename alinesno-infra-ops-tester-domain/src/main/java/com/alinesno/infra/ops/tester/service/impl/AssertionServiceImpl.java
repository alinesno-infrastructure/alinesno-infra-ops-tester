package com.alinesno.infra.ops.tester.service.impl;

import com.alinesno.infra.ops.tester.entity.AssertionEntity;
import com.alinesno.infra.ops.tester.mapper.AssertionMapper;
import com.alinesno.infra.ops.tester.service.IAssertionService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AssertionServiceImpl extends IBaseServiceImpl<AssertionEntity , AssertionMapper> implements IAssertionService {
}
