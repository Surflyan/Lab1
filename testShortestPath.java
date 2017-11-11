package test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;

import graph.Text2Graph;

public class testShortestPath {
	
	Text2Graph text2Graph = new Text2Graph();
	@Before
	public void init() throws FileNotFoundException {
		text2Graph.init();
		System.out.println("test");
		
	}
	
	@Test
	public void test1() {
		String res = text2Graph.calcShortestPath("no", "world");
		assertEquals("No path from no to world.",res);
	}
	@Test
	public void test2() {
		String res = text2Graph.calcShortestPath("is", "Permission");
		assertEquals("No path from is to Permission.",res);
	}
	@Test
	public void test3() {
		String res = text2Graph.calcShortestPath("is", "granted");
		assertEquals("The length of shortest path is: 2" + "\n" + "is->hereby->granted",res);
	}
	@Test
	public void test4() {
		String res = text2Graph.calcShortestPath("and", "of");
		assertEquals("The length of shortest path is: 4" + "\n" + "and->to->use->copy->of",res);
	}


}
