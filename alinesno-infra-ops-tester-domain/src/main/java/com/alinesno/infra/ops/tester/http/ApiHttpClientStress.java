package com.alinesno.infra.ops.tester.http;

import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.*;

@Component
public class ApiHttpClientStress {

    @Autowired
    private ApiHttpClient apiHttpClient;

    private final ExecutorService executorService;

    public ApiHttpClientStress() {
        // 创建线程池，设置最大线程数为100
        executorService = Executors.newFixedThreadPool(100);
    }

    public void startStressTest(String url, Map<String, String> params, String jsonBody, int requestCount) {
        // 创建CountDownLatch，用于等待所有请求完成
        CountDownLatch countDownLatch = new CountDownLatch(requestCount);

        // 发送请求
        for (int i = 0; i < requestCount; i++) {
            executorService.execute(() -> {
                try {
                    // 发送请求
                    Response response = ApiHttpClient.get(url, params);
                    // 输出响应码
                    System.out.println("Request - Response Code: " + response.code());
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    // 请求完成，计数器减一
                    countDownLatch.countDown();
                }
            });
        }

        try {
            // 等待所有请求完成
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 关闭线程池
        executorService.shutdown();
    }
}