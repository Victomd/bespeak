package com.bespeak.common;

/**
 * 基础包
 * @author cedo
 *
 */
public class ResultBean {

	//请求结果
	private boolean result;
	
	//错误代码
	private String code;
	
	//错误信息
	private String message;

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
