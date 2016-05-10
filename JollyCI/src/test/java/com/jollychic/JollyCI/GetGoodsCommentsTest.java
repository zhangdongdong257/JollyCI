package com.jollychic.JollyCI;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.testng.annotations.Test;

public class GetGoodsCommentsTest {
	public static String url = "http://192.168.3.33:9091/jollychic_app2/goods/getGoodsComment.do";
	public static String result;
	
	/**
	 * 
	 * @param url
	 * @param method
	 * @return
	 */
	public static String getGoodsCommentsTest(String url, String method){
		HttpClient http = new HttpClient(); 
		PostMethod post = new PostMethod(url);
        post.setRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=gbk"); 
        NameValuePair[] param = { new NameValuePair("goodsId","257401"),
                                  new NameValuePair("pageNum","1")} ;
        post.setRequestBody(param);
        post.releaseConnection();
		try {
			http.executeMethod(post);
			result = post.getResponseBodyAsString();
		} catch (HttpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
/*	public static void main(String[] args) {
		GetEdtionTest.getEdtionTest(url, "");
		System.out.println(result);
	}*/
	
	@Test
	public void execute(){
		getGoodsCommentsTest(url, "");
		System.out.println(result);
	}
	
	@Test
	public void execute2(){
		System.out.println("execute2");
	}
}
