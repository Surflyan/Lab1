package test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;
import graph.*;

public class testBridgeWords {
	Text2Graph text2Graph = new Text2Graph();
	@Before
	public void init() throws FileNotFoundException {
		text2Graph.init();
		System.out.println("test");
		
	}
	
	@Test
	public void test() {
		String res = text2Graph.queryBridgeWords("world","love");
		assertEquals("No world or love in the graph!",res);
	}
	@Test
	public void test2() {
		String res = text2Graph.queryBridgeWords("this","and");
		assertEquals("The bridge words from this to and are:software",res);
	}

	
	@Test
	public void test3() {
		String res = text2Graph.queryBridgeWords("this","of");
		assertEquals("No bridge words from this to of!",res);
	}
	@Test
	public void test4() {
		String res = text2Graph.queryBridgeWords("and","");
		assertEquals("No and or  in the graph!",res);
	}
	
	@Test
	public void test7() {
		String res = text2Graph.queryBridgeWords("and","sell");
		assertEquals("The bridge words from and to sell are:associated and or.",res);
	}
	@Test
	public void test6() {
		String res = text2Graph.queryBridgeWords("free","this");
		assertEquals("The bridge words from free to this are:of",res);
	}
	@Test
	public void test5() {
		String res = text2Graph.queryBridgeWords("of","the");
		assertEquals("No bridge words from of to the!",res);
	}

}
