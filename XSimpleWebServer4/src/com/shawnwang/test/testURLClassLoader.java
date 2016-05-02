package com.shawnwang.test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import org.junit.Test;

public class testURLClassLoader {
	@SuppressWarnings("deprecation")
	@Test
	public void test1() throws MalformedURLException, IOException, ClassNotFoundException, Exception, Exception{
		URL[] urls=new URL[1];
		File file=new File(".");
		System.out.println(file.getCanonicalPath());
		System.out.println(System.getProperty("Java.class.path"));
		File f = new File(this.getClass().getResource("/").getPath());//第一种方式成功~~~
        System.out.println(f);
	         
		urls[0]=new URL(f.toURL().toString());
		System.out.println(urls[0]);
		URLClassLoader loader=new URLClassLoader(urls);
		Class clz=loader.loadClass("com.shawnwang.test.testURLClassLoader");
		testURLClassLoader c=(testURLClassLoader) clz.newInstance();
		c.sayHi();
	}
	public void sayHi(){
		System.out.println("hi,nice to see you.");
	}
}
