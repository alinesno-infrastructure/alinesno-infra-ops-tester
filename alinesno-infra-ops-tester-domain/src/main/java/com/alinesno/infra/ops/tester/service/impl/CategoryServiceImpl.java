package com.alinesno.infra.ops.tester.service.impl;

import com.alinesno.infra.ops.tester.entity.CategoryEntity;
import com.alinesno.infra.ops.tester.mapper.CategoryMapper;
import com.alinesno.infra.ops.tester.service.ICategoryService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CategoryServiceImpl extends IBaseServiceImpl<CategoryEntity, CategoryMapper> implements ICategoryService {
}
