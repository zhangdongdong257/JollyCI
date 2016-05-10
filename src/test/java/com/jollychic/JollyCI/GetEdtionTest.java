package com.jollychic.JollyCI;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.PostMethod;
import org.testng.annotations.Test;


@Test
public class GetEdtionTest {
	
	public static String url = "http://192.168.3.33:9091/jollychic_app2/goods/getEdtion.do";
	public static String result;
	
	/**
	 * 
	 * @param url
	 * @param method
	 * @return
	 */
	public static String getEdtionTest(String url, String method){
		HttpClient http = new HttpClient(); 
		PostMethod post = new PostMethod(url);
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
		GetEdtionTest.getEdtionTest(url, "");
		System.out.println(result);
	}
	
	@Test
	public void execute2(){
		System.out.println("execute2");
	}
	
}
