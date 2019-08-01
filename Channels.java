package project;
import java.util.Comparator;

public class Channels implements Comparator<Channels>{
	private int channel_id;
	private String channel_name;
	private int trp_count;
	private int channel_cost;
	
	public Channels() {
		
	}
	
	public Channels(int i,String n,int c,int c1) {
		this.channel_id=i;
		this.channel_name=n;
		this.trp_count=c;
		this.channel_cost=c1;
	}
	
	public String toString() {
		
		return channel_id+" "+channel_name+"   "+trp_count+"   "+channel_cost;
		
	}
	public int getChannel_id() {
		return channel_id;
	}
	public void setChannel_id(int channel_id) {
		this.channel_id = channel_id;
	}
	public String getChannel_name() {
		return channel_name;
	}
	public void setChannel_name(String channel_name) {
		this.channel_name = channel_name;
	}
	public int getTrp_count() {
		return trp_count;
	}
	public void setTrp_count(int trp_count) {
		this.trp_count = trp_count;
	}
	public int getChannel_cost() {
		return channel_cost;
	}
	public void setChannel_cost(int channel_cost) {
		this.channel_cost = channel_cost;
	}

	@Override
	public int compare(Channels arg0, Channels arg1) {
		if(arg0.trp_count>arg1.trp_count) {
			return -1;
		}
		else if(arg0.trp_count<arg1.trp_count) {
			return 1;
		}
		else {
			return 0;
		}
	}

	
	
}
