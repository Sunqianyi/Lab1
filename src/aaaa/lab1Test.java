package aaaa;

import static org.junit.Assert.*;

import org.junit.Test;

public class lab1Test {
	
	public static lab1 m = new lab1();
	@Test
	//�������ʶ����ڲ������ŽӴ�
	public void testQueryBridgeWords1() {
		 m.showDirectedGraph("C:\\Users\\hasee\\Desktop\\test1.txt");
		 String result = m.queryBridgeWords("big", "time");
		 assertEquals("The bridgewords from \"big\" to \"time\" are:data ", result);
	}
	@Test
	//�������ʶ����ڲ���û���ŽӴ�
	public void testQueryBridgeWords2() {
		 m.showDirectedGraph("C:\\Users\\hasee\\Desktop\\test1.txt");
		 String result = m.queryBridgeWords("big", "the");
		 assertEquals("No bridge words from \"big\" to \"the\"!", result);
	}
	
	@Test
	//ǰһ�����ʲ�����
	public void testQueryBridgeWords3() {
		 m.showDirectedGraph("C:\\Users\\hasee\\Desktop\\test1.txt");
		 String result = m.queryBridgeWords("overwatch", "big");
		 assertEquals("No \"overwatch\" in the graph!", result);
	}
	
	@Test
	//��һ�����ʲ�����
	public void testQueryBridgeWords4() {
		 m.showDirectedGraph("C:\\Users\\hasee\\Desktop\\test1.txt");
		 String result = m.queryBridgeWords("big", "overwatch");
		 assertEquals("No \"overwatch\" in the graph!", result);
	}
	
	@Test
	//�������ʶ�������
	public void testQueryBridgeWords5() {
		 m.showDirectedGraph("C:\\Users\\hasee\\Desktop\\test1.txt");
		 String result = m.queryBridgeWords("ow", "overwatch");
		 assertEquals("No \"ow\" in the graph!", result);
	}
}
