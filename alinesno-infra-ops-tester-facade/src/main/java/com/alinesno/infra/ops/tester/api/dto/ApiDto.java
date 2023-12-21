package com.alinesno.infra.ops.tester.api.dto;

import lombok.Data;

@Data
public class ApiDto {

    private String name; // 接口名称

    private String url; // 接口URL

    private String method; // 请求方法

    private Long categoryId; // 接口分类ID

}