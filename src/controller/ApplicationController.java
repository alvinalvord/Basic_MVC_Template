/**
*	A subclass of MainController.
*	Concrete implementation of the MainController.
*	Focuses on creating/getting the necessary models, controllers, and styles
*		and sets exit behaviours if necessary (in case of threading).
*	@author: Pillejera, Jasper Glen A.
*	last modified: Oct. 28, 2018
*/

package controller;

import model.*;

import javafx.application.*;
import javafx.stage.*;

public class ApplicationController extends MainController {
	
	public static final String APP_NAME = "MVC TEMPLATE"; // edit as necessary
	public static final int SAMPLE_CONTROLLER = 1;
	
	private SampleModel sampleModel;
	
	private SampleController sampleController;
	
	/**
	*	Default constructor calls parent constructor
	*/
	public ApplicationController (Stage mainStage) {
		super (mainStage);
	}
	
	/**
	*	Initialize any necessary resource needed
	*	Edit as necessary
	*/
	protected void init () {
		mainStage.setTitle (APP_NAME);
		
		setOnExit (); // modify exit behaviour if there are threads
		initModels (); // init models
		initControllers ();	//init controllers
		initCSS (); // get CSS 
		
		sampleController.setAsScene (); // set initial scene
	}
	
	/**
	*	return the requested controller using its ID defined by public static fields defined here
	*	@param controllerID the integer ID of a controller
	*	return the requested Controller
	*/
	protected Controller <?, ?> getController (int controllerID) {
		switch (controllerID) {
			case SAMPLE_CONTROLLER:
			default:
				return sampleController;
		}
	}
	
	private void initModels () {
		sampleModel = new SampleModel ();
	}
	
	private void initControllers () {
		sampleController = new SampleController (this, sampleModel);
	}
	
	private void initCSS () {
		scene.getStylesheets ().add ("res/sample.css");
	}
	
	private void setOnExit () {
		mainStage.setOnCloseRequest (
			e -> {
				// close threads if necessary to avoid undead/zombie threads
				// unless you're into that then i don't judge
				Platform.exit (); // closes the stage and application
			}
		);
	}
	
}