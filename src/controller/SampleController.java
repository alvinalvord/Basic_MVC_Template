/**
*	SAMPLE CONTROLLER DISREGARD IF YOU WANT
*	@author: Pillejera, Jasper Glen A.
*	last modified: Oct. 28, 2018
*/

package controller;

import model.*;
import view.*;

public class SampleController extends Controller <SampleView, ApplicationController> {
	
	private SampleModel model;
	
	public SampleController (ApplicationController mainController, SampleModel model) {
		super (new SampleView (), mainController);
		this.model = model;
		
		setView ();
	}
	
	private void setView () {
		model.attach (view);
		
		view.setLabelUpdater ((label) -> label.setText (model.getText ()));
		view.setLabelEventHandler (() -> model.refresh ());
		view.update ();
	}
	
}