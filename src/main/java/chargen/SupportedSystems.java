package chargen;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
public class SupportedSystems {
	private List<SupportedSystem> systemNameUrlMap;
	
	public SupportedSystems() {
		this.systemNameUrlMap = new ArrayList<>();
		//this.systemNameUrlMap.add(new SupportedSystem("Old School Essentials", "ose"));
		this.systemNameUrlMap.add(new SupportedSystem("Багровая заря", "bz"));
	}
	
	public List<SupportedSystem> getSupportedSystems(){
		return systemNameUrlMap;
	}
	
	@Data
	public class SupportedSystem {
		private final String name;
		private final String url;
	}
}
