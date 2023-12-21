package com.alinesno.infra.ops.tester.service;

import com.alinesno.infra.ops.tester.api.dto.ApiDto;

import java.util.List;

/**
 * 对外提供的解析器接口
 */
public interface ILLmInterpreterService {

    List<ApiDto> parserApi(String apiJson) ;

}
