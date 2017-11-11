package aaaa;

import static org.junit.Assert.*;

import org.junit.Test;

public class lab1Test {
	
	public static lab1 m = new lab1();
	@Test
	//两个单词都存在并且有桥接词
	public void testQueryBridgeWords1() {
		 m.showDirectedGraph("C:\\Users\\hasee\\Desktop\\test1.txt");
		 String result = m.queryBridgeWords("big", "time");
		 assertEquals("The bridgewords from \"big\" to \"time\" are:data ", result);
	}
	@Test
	//两个单词都存在并且没有桥接词
	public void testQueryBridgeWords2() {
		 m.showDirectedGraph("C:\\Users\\hasee\\Desktop\\test1.txt");
		 String result = m.queryBridgeWords("big", "the");
		 assertEquals("No bridge words from \"big\" to \"the\"!", result);
	}
	
	@Test
	//前一个单词不存在
	public void testQueryBridgeWords3() {
		 m.showDirectedGraph("C:\\Users\\hasee\\Desktop\\test1.txt");
		 String result = m.queryBridgeWords("overwatch", "big");
		 assertEquals("No \"overwatch\" in the graph!", result);
	}
	
	@Test
	//后一个单词不存在
	public void testQueryBridgeWords4() {
		 m.showDirectedGraph("C:\\Users\\hasee\\Desktop\\test1.txt");
		 String result = m.queryBridgeWords("big", "overwatch");
		 assertEquals("No \"overwatch\" in the graph!", result);
	}
	
	@Test
	//两个单词都不存在
	public void testQueryBridgeWords5() {
		 m.showDirectedGraph("C:\\Users\\hasee\\Desktop\\test1.txt");
		 String result = m.queryBridgeWords("ow", "overwatch");
		 assertEquals("No \"ow\" in the graph!", result);
	}
}
