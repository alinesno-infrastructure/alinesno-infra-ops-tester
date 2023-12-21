package com.alinesno.infra.ops.tester.http;

import okhttp3.*;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;

/**
 * 接口请求测试，包括GET/POST/PUT/DELETE等几类型的请求支持
 */
@Component
public class ApiHttpClient {

    private static final OkHttpClient client = new OkHttpClient();

    /**
     * get请求
     *
     * @param url    请求URL
     * @param params 请求参数
     * @return Response
     * @throws IOException
     */
    public static Response get(String url, Map<String, String> params) throws IOException {
        HttpUrl.Builder httpBuilder = Objects.requireNonNull(HttpUrl.parse(url)).newBuilder();
        if (params != null) {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                httpBuilder.addQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        return client.newCall(request).execute();
    }

    /**
     * post请求
     *
     * @param url      请求URL
     * @param params   请求参数
     * @param jsonBody 请求体
     * @return Response
     * @throws IOException
     */
    public static Response post(String url, Map<String, String> params, String jsonBody) throws IOException {
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), jsonBody);
        FormBody.Builder formBuilder = new FormBody.Builder();
        if (params != null) {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                formBuilder.add(entry.getKey(), entry.getValue());
            }
        }
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();
        return client.newCall(request).execute();
    }

    /**
     * put请求
     *
     * @param url      请求URL
     * @param params   请求参数
     * @param jsonBody 请求体
     * @return Response
     * @throws IOException
     */
    public static Response put(String url, Map<String, String> params, String jsonBody) throws IOException {
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), jsonBody);
        FormBody.Builder formBuilder = new FormBody.Builder();
        if (params != null) {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                formBuilder.add(entry.getKey(), entry.getValue());
            }
        }
        Request request = new Request.Builder()
                .url(url)
                .put(requestBody)
                .build();
        return client.newCall(request).execute();
    }

    /**
     * delete请求
     *
     * @param url    请求URL
     * @param params 请求参数
     * @return Response
     * @throws IOException
     */
    public static Response delete(String url, Map<String, String> params) throws IOException {
        HttpUrl.Builder httpBuilder = Objects.requireNonNull(HttpUrl.parse(url)).newBuilder();
        if (params != null) {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                httpBuilder.addQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        Request request = new Request.Builder()
                .url(url)
                .delete()
                .build();
        return client.newCall(request).execute();
    }
}