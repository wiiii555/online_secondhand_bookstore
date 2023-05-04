package com.books.domain;

public class HttpResult{
    /** 请求是否成功 */
    private boolean result;

    /** 请求结果（文字） */
    private String requestResult;

    /** 请求数据（对象） */
    private Object requestData;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getRequestResult() {
        return requestResult;
    }

    public void setRequestResult(String requestResult) {
        this.requestResult = requestResult;
    }

    public Object getRequestData() {
        return requestData;
    }

    public void setRequestData(Object requestData) {
        this.requestData = requestData;
    }

    public HttpResult(boolean result, String requestResult, Object requestData) {
        this.result = result;
        this.requestResult = requestResult;
        this.requestData = requestData;
    }
}
