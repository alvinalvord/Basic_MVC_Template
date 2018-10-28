/**
*	SAMPLE BEAN DISREGARD IF YOU WANT
*	@author: Pillejera, Jasper Glen A.
*	last modified: Oct. 28, 2018
*/
package model.beans;

public class SampleBean {
	
	private String text;
	
	public SampleBean () {
		text = "lol";
	}
	
	public void setText (String text) {
		this.text = text;
	}
	
	public String getText () {
		return text;
	}
	
}