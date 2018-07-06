package io.github.ningyu.jmeter.plugin.common;

public class Result {
	public int code ;
	public Object body;
	
	public int getCode() { return code; }
	
	public void setCode(int code) { this.code = code; }
	
	public Object getBody() { return body; }
	
	public void setBody(Object body){
		this.body = body;
	}
}
