package com.alinesno.infra.ops.tester.service.impl;

import com.alinesno.infra.ops.tester.entity.DataEntity;
import com.alinesno.infra.ops.tester.mapper.DataMapper;
import com.alinesno.infra.ops.tester.service.IDataService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DataServiceImpl extends IBaseServiceImpl<DataEntity, DataMapper> implements IDataService {
}
