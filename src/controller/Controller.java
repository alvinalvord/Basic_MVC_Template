/**
*	Abstract parent for all controller classes.
*	The controller connects the model to the view and vice versa.
*	Whenever a view needs update from the model, the controller acts as a middleman to perform the update.
*	@author: Pillejera, Jasper Glen A.
*	last modified: Oct. 28, 2018
*/

package controller;

import view.*;

import javafx.scene.*;

public abstract class Controller <T extends Parent & View, E extends MainController> {
	
	protected T view;
	protected E mainController;
	
	protected Controller (T view, E mainController) {
		this.view = view;
		this.mainController = mainController;
	}
	
	public void setAsScene () {
		mainController.setScene (view);
	}
	
}
