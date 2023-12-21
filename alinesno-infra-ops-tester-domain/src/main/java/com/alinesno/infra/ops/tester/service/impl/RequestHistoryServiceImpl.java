package com.alinesno.infra.ops.tester.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.ops.tester.entity.RequestHistoryEntity;
import com.alinesno.infra.ops.tester.mapper.RequestHistoryMapper;
import com.alinesno.infra.ops.tester.service.IRequestHistoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RequestHistoryServiceImpl extends IBaseServiceImpl<RequestHistoryEntity, RequestHistoryMapper> implements IRequestHistoryService {
}
