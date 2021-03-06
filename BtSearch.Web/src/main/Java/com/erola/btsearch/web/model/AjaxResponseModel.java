package com.erola.btsearch.web.model;

//import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Erola on 2017/9/30.
 */
public class AjaxResponseModel<T> {
    //@JsonProperty(value = "Status")
    private Integer status;
    //@JsonProperty(value = "Message")
    private String message;
    //@JsonProperty(value = "Data")
    private T data;

    public AjaxResponseModel(){}

    public AjaxResponseModel(Integer status, String message, T data){
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Integer getStatus(){
        return this.status;
    }
    public String getMessage(){
        return this.message;
    }
    public T getData(){
        return this.data;
    }

    public void setStatus(Integer status){
        this.status=status;
    }
    public void setMessage(String message){
        this.message=message;
    }
    public void setData(T data){
        this.data=data;
    }

    /**
     * 返回响应错误对象的方法
     * @param message
     * @return
     */
    public static AjaxResponseModel<Object> getErrorResponse(String message){
        return new AjaxResponseModel<Object>(0, message, null);
    }

    /**
     * 返回响应成功对象的方法
     * @param value
     * @param <T>
     * @return
     */
    public static <T> AjaxResponseModel<T> getSuccessResponse(T value){
        return new AjaxResponseModel<T>(1, "", value);
    }
}