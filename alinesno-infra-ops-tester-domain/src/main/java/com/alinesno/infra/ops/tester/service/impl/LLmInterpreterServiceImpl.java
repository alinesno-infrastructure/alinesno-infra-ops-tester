package com.alinesno.infra.ops.tester.service.impl;

import com.alinesno.infra.ops.tester.api.dto.ApiDto;
import com.alinesno.infra.ops.tester.service.ILLmInterpreterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 接口解析工具类
 */
@Slf4j
@Service
public class LLmInterpreterServiceImpl implements ILLmInterpreterService {

    @Override
    public List<ApiDto> parserApi(String apiJson) {



        return null;
    }

}
