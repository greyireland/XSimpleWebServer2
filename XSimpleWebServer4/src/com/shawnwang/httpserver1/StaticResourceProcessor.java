package com.shawnwang.httpserver1;

import java.io.IOException;


public class StaticResourceProcessor {

	public void process(Request1 request, Response1 response) {
		try {
			response.sendStaticResource();
		}
		catch (IOException e) {
			e.printStackTrace();
		} }

}
