package test1;

import java.io.Serializable;

public class Color1 implements Serializable{
	private static final long serialVersionUID = 1L;

	private String color;

	public Color1(){
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}