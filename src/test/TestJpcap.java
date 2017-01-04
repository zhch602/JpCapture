package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import capture.*;

public class TestJpcap {
	public static void main(String[] args) {

		//example:
		//如何获取每个数据包的详细信息
//		Analyse analyse = new Analyse(); 
//		analyse.startClassify(packet);
//		LinkedHashMap<String, ArrayList<String>> info = analyse.getInfo();
//		for(Iterator it = info.entrySet().iterator();it.hasNext();){  
//			Entry<String, ArrayList<String>> entry = (Entry<String, ArrayList<String>>) it.next();
//			System.out.println(entry.getKey());
//			ArrayList<String> arrayList = entry.getValue();
//			for (String s : arrayList) {
//				System.out.println("  "+s);
//			}
//		}
		
		
		Captor captor = new Captor(); // 初始化Captor对象
		String[] device = captor.showDevice(); //显示网卡列表
		captor.chooseDevice(0); //选择网卡
		captor.setFilter("http"); //设置过滤器
		captor.capturePackets(); //开始捕获
//		captor.stopCaptureThread(); //停止捕获
		
	}
}
