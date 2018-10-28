/**
*	SAMPLE MODEL DISREGARD IF YOU WANT
*	@author: Pillejera, Jasper Glen A.
*	last modified: Oct. 28, 2018
*/

package model;

import model.beans.*;

public class SampleModel extends Model {
	
	private SampleBean bean;
	
	public SampleModel () {
		bean = new SampleBean ();
	}
	
	public void refresh () {
		bean.setText  (bean.getText () + " lol");
		notifyViews ();
	}
	
	public String getText () {
		return bean.getText ();
	}
	
}