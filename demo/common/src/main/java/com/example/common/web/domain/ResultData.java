package com.example.common.web.domain;

import java.util.HashMap;

/**
 * @Description:
 * @author: rui
 * @date: 2022/5/20 15:44
 */
public class ResultData extends HashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    /**
     * 状态码
     */
    public static final String CODE_TAG = "rtnCode";

    /**
     * 返回内容
     */
    public static final String MSG_TAG = "errorMsg";

    /**
     * 数据对象
     */
    public static final String DATA_TAG = "resultData";

    /**
     * 初始化一个新创建的 AjaxResult 对象，使其表示一个空消息。
     */
    public ResultData() {
    }


    /**
     * 初始化一个新创建的 AjaxResult 对象
     *
     * @param code 状态码
     * @param msg  返回内容
     * @param data 数据对象
     */
    public ResultData(int code, String msg, Object data) {
        super.put(CODE_TAG, code);
        super.put(MSG_TAG, msg);
        super.put(DATA_TAG, data);

    }
}
