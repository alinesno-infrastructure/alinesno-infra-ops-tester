# alinesno-infra-ops-tester
专门设计用于执行接口自动化测试的工具。其主要目的是帮助团队有效地管理和执行接口测试用例，验证系统各个接口的功能、性能和可靠性。

# 系统功能列表如下：

1. 用户管理功能：包括用户注册、登录、权限管理等功能。
2. 接口管理功能：包括接口的新增、编辑、删除、查询等功能。
3. 接口分类功能：支持对接口进行分类管理，方便用户按照需求进行查找和管理。
4. 接口参数配置功能：支持对接口的请求参数进行配置，包括参数类型、参数名称、参数值等。
5. 接口请求功能：支持对接口进行请求，包括GET、POST、PUT、DELETE等请求方法。
6. 接口请求历史记录功能：记录用户对接口的请求历史，方便用户进行回溯和查看。
7. 接口断言功能：支持对接口的返回结果进行断言，判断接口是否符合预期结果。
8. 接口测试报告功能：生成接口测试报告，包括接口请求的成功率、错误信息、响应时间等。
9. 接口测试计划功能：支持对接口进行测试计划的制定，包括测试用例的编写、执行计划的设定等。
10. 接口测试执行功能：支持对接口测试计划的执行，自动化执行接口测试用例。
11. 接口测试结果分析功能：对接口测试结果进行分析，包括成功率、错误率、性能指标等的统计和分析。
12. 接口监控功能：对接口进行监控，实时监测接口的可用性和性能。
13. 接口批量执行功能：支持对多个接口进行批量执行，提高测试效率。
14. 接口数据管理功能：支持对接口的测试数据进行管理，包括数据的新增、编辑、删除等操作。
15. 接口数据驱动功能：支持使用测试数据驱动的方式进行接口测试，提高测试覆盖率。
16. 接口性能测试功能：支持对接口的性能进行测试，包括并发测试、负载测试等。
17. 接口安全性测试功能：支持对接口的安全性进行测试，包括SQL注入、XSS攻击等。
18. 接口版本管理功能：支持对接口进行版本管理，方便用户进行接口的回滚和管理。
19. 接口协作功能：支持多人协作，方便团队成员共同管理和执行接口测试任务。
20. 接口文档生成功能：支持根据接口的配置信息自动生成接口文档，方便开发人员进行接口开发和测试。


根据上述功能列表，可以设计出以下MySQL数据库表结构：

2. 接口表（interface）
    - name (接口名称)
    - url (接口URL)
    - method (请求方法)
    - category_id (接口分类ID)

3. 接口分类表（category）
    - name (分类名称)

4. 接口参数表（parameter）
    - interface_id (接口ID)
    - name (参数名称)
    - value (参数值)
    - type (参数类型)

5. 接口请求历史记录表（request_history）
    - interface_id (接口ID)
    - user_id (用户ID)
    - request_time (请求时间)
    - response_time (响应时间)
    - response_code (响应状态码)
    - response_body (响应内容)

6. 接口断言表（assertion）
    - interface_id (接口ID)
    - assertion_type (断言类型)
    - expected_value (期望值)

7. 接口测试报告表（test_report）
    - interface_id (接口ID)
    - user_id (用户ID)
    - success_rate (成功率)
    - error_message (错误信息)

8. 接口测试计划表（test_plan）
    - name (计划名称)
    - interface_id (接口ID)
    - test_case (测试用例)
    - execution_time (执行时间)

9. 接口测试执行表（test_execution）
    - test_plan_id (测试计划ID)
    - interface_id (接口ID)
    - execution_time (执行时间)

10. 接口数据表（data）
    - interface_id (接口ID)
    - name (数据名称)
    - value (数据值)

11. 接口版本表（version）
    - interface_id (接口ID)
    - version_number (版本号)

以上是一个简单的数据库表结构设计，根据实际需求可能还需要添加其他表和字段。


1. 接口表（InterfaceEntity）

```java
package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("interface")
public class InterfaceEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id; // 接口ID

    @TableField("name")
    private String name; // 接口名称

    @TableField("url")
    private String url; // 接口URL

    @TableField("method")
    private String method; // 请求方法

    @TableField("category_id")
    private Long categoryId; // 接口分类ID

}
```

2. 接口分类表（CategoryEntity）

```java
package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("category")
public class CategoryEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id; // 分类ID

    @TableField("name")
    private String name; // 分类名称

}
```

3. 接口参数表（ParameterEntity）

```java
package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("parameter")
public class ParameterEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id; // 参数ID

    @TableField("interface_id")
    private Long interfaceId; // 接口ID

    @TableField("name")
    private String name; // 参数名称

    @TableField("value")
    private String value; // 参数值

    @TableField("type")
    private String type; // 参数类型

}
```

4. 接口请求历史记录表（RequestHistoryEntity）

```java
package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("request_history")
public class RequestHistoryEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id; // 请求历史记录ID

    @TableField("interface_id")
    private Long interfaceId; // 接口ID

    @TableField("user_id")
    private Long userId; // 用户ID

    @TableField("request_time")
    private Date requestTime; // 请求时间

    @TableField("response_time")
    private Date responseTime; // 响应时间

    @TableField("response_code")
    private String responseCode; // 响应状态码

    @TableField("response_body")
    private String responseBody; // 响应体

}
```

5. 接口断言表（AssertionEntity）

```java
package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("assertion")
public class AssertionEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id; // 断言ID

    @TableField("interface_id")
    private Long interfaceId; // 接口ID

    @TableField("assertion_type")
    private String assertionType; // 断言类型

    @TableField("expected_value")
    private String expectedValue; // 期望值

}
```

6. 接口测试报告表（TestReportEntity）

```java
package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("test_report")
public class TestReportEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id; // 测试报告ID

    @TableField("interface_id")
    private Long interfaceId; // 接口ID

    @TableField("user_id")
    private Long userId; // 用户ID

    @TableField("success_rate")
    private Double successRate; // 成功率

    @TableField("error_message")
    private String errorMessage; // 错误消息

}
```

7. 接口测试计划表（TestPlanEntity）

```java
package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("test_plan")
public class TestPlanEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id; // 测试计划ID

    @TableField("name")
    private String name; // 计划名称

    @TableField("interface_id")
    private Long interfaceId; // 接口ID

    @TableField("test_case")
    private String testCase; // 测试用例

    @TableField("execution_time")
    private Date executionTime; // 执行时间

}
```

8. 接口测试执行表（TestExecutionEntity）

```java
package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("test_execution")
public class TestExecutionEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id; // 测试执行ID

    @TableField("test_plan_id")
    private Long testPlanId; // 测试计划ID

    @TableField("interface_id")
    private Long interfaceId; // 接口ID

    @TableField("execution_time")
    private Date executionTime; // 执行时间

}
```

9. 接口数据表（DataEntity）

```java
package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("data")
public class DataEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id; // 数据ID

    @TableField("interface_id")
    private Long interfaceId; // 接口ID

    @TableField("name")
    private String name; // 数据名称

    @TableField("value")
    private String value; // 数据值

}
```

10. 接口版本表（VersionEntity）

```java
package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("version")
public class VersionEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id; // 版本ID

    @TableField("interface_id")
    private Long interfaceId; // 接口ID

    @TableField("version_number")
    private String versionNumber; // 版本号

}
```

以上是根据给定的数据库设计转换成的Java类。每个类都添加了@Entity注解，并使用Lombok的@Data注解简化了getter、setter等方法的编写。同时，每个类都添加了MyBatis-Plus的注解和字段注释，用于与数据库进行映射。