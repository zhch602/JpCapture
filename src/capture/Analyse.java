package capture;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import classify.*;
import jpcap.packet.Packet;

public class Analyse {
	
	private List<PacketClassify> classify =new ArrayList<PacketClassify>();
	
	LinkedHashMap<String, ArrayList<String>> info = new LinkedHashMap<>();
	
	public void startClassify(Packet p){
		classify.add(new Ethernet());
		classify.add(new IPv4());
		classify.add(new IPv6());
		classify.add(new ARP());
		classify.add(new TCP());
		classify.add(new UDP());
		classify.add(new HTTP());
		for (PacketClassify each : classify) {
			if(each.isBelong(p)){
				each.analyze(p);
				info.put(each.getProtocolName(), each.getData());
			}
		}
	}
	
	public LinkedHashMap<String, ArrayList<String>> getInfo(){
		return info;
	}
	
}
