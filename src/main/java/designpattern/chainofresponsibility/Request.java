package designpattern.chainofresponsibility;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

public class Request {

	private Object body;
	private Map<String, Object> requestHeadersMap;
	private StringBuffer buffer;
	private Map<String, String> requestParamsMap;
	private String parseStringURL;
	private String domain;
	
	public Request(String urlString,Object body) throws UnknownHostException {
		this.parseStringURL = urlString;
		this.body = body;
		String[] extractdomain = this.parseStringURL.split("\\?");
		setDomain(extractdomain[0]);
	//	getMapFromStringUrl();
		requestHeadersMap = new HashMap<String, Object>();
		requestHeadersMap.put("Host", Inet4Address.getLocalHost().getHostName());
		requestHeadersMap.put("Accept-Encoding", "gzip, deflate, br");
		requestHeadersMap.put("X-Forwarded-For", InetAddress.getLocalHost().getHostAddress());
		requestHeadersMap.put("X-Forwarded-Proto", "http");
		requestHeadersMap.put("User-Agent", "Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)");
		requestHeadersMap.put("X-Request-Start", Math.random());
		requestHeadersMap.put("X-Forwarded-Port", 80);
		requestHeadersMap.put("Accept", "*/*");
		requestHeadersMap.put("Connection", "close");
		
		requestParamsMap = new HashMap<String, String>();
	}
	
	public void addRequestParams(Map<String, String> newParams) {
		requestParamsMap.putAll(newParams);
	}
	
	public String getParseStringURLfromMap() {
		setDomain(this.domain); 
		buffer.append("?");
		for (Map.Entry<String, String> entry: requestParamsMap.entrySet()) {
			buffer.append(entry.getKey().replace(" ", "+"))
				  .append("=")
				  .append(entry.getValue().replace(" ", "+"))
				  .append("&");
		}
		this.parseStringURL = buffer.toString();
		return parseStringURL;
	}
	
	public void setDomain(String domain) {
		this.domain = domain;
		buffer = new StringBuffer(domain);
	}
	
	public Map<String, String> getMapFromStringUrl() {
		String[] extractdomain = this.parseStringURL.split("\\?");
		this.setDomain(extractdomain[0]);
		String[] extractreqparam = extractdomain[1].split("\\&");
		for (int i = 0; i < extractreqparam.length; i++) {
			String[] extractKV = extractreqparam[i].split("\\=");
			this.requestParamsMap.put(extractKV[0], extractKV[1]);
		}
		return this.requestParamsMap;
	}
	
	public String getParseStringUrl() {
		return this.parseStringURL;
	}
	
	public void setParseStringUrl(String urlString) {
		this.parseStringURL = urlString;
	}

	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}
}
