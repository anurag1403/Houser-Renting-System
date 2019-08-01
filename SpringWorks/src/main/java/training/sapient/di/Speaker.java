package training.sapient.di;

import org.springframework.stereotype.Component;

@Component
public class Speaker {
	private String type;
	private int volLevels;
	public Speaker() {}
	public Speaker(String type, int volLevels) {
		super();
		this.type = type;
		this.volLevels = volLevels;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getVolLevels() {
		return volLevels;
	}
	public void setVolLevels(int volLevels) {
		this.volLevels = volLevels;
	}
	@Override
	public String toString() {
		return "Speaker [type=" + type + ", volLevels=" + volLevels + "]";
	}
	
}
