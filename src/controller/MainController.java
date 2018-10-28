/**
*	Abstract parent for all main program controllers.
*	Usually will be only using ApplicationController unless there is a
*		need for another window
*	@author: Pillejera, Jasper Glen A.
*	last modified: Oct. 28, 2018
*/

package controller;

import view.*;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;

public abstract class MainController {
	
	protected Stage mainStage;
	protected Scene scene;
	
	/**
	*	Default constructor of a main program controller
	*	@param stage the stage controlled by this main controller
	*/
	public MainController (Stage stage) {
		mainStage = stage;
		mainStage.setMinWidth (1280);
		mainStage.setMinHeight (720);
		
		scene = new Scene (new Group (), 
			mainStage.getWidth (), 
			mainStage.getHeight ());
		
		init ();
		stage.setScene (scene);
		stage.show ();
	}
	
	/**
	*	This function initializes all other controllers and values needed.
	*	This function is called before setting the scene and showing the stage
	*		so all edits to the scene and stage can be done in the subclass.
	*/
	protected abstract void init ();
	
	/**
	*	Returns a requested controller.
	*	Note: controller ID is defined by the developer, use as necessary
	*	@param controllerID integer ID for a controller
	*	@return the requested controller, throwing exceptions is up to the developer
	*/
	protected abstract Controller<?, ?> getController (int controllerID);
	
	/**
	*	Changes the scene of currently displayed in the stage.
	*	@param parent the view to be set as the new scene
	*/
	protected void setScene (Parent parent) {
		scene.setRoot (parent);
	}
	
	/**
	*	Returns the stage controlled by this main program controller
	*	@return the stage of this main controller
	*/
	public Stage getStage () {
		return mainStage;
	}
	
}