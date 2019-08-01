package training.sapient.di;

import org.springframework.stereotype.Component;

@Component
public class Camera {
	private String type;
	private int pixels;
	public Camera() {}
	public Camera(String type, int pixels) {
		super();
		this.type = type;
		this.pixels = pixels;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPixels() {
		return pixels;
	}
	public void setPixels(int pixels) {
		this.pixels = pixels;
	}
	@Override
	public String toString() {
		return "Camera [type=" + type + ", pixels=" + pixels + "]";
	}
	
}
