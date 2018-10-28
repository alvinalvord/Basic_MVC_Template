/**
*	This is the Driver class of the JavaFX application containing
*		the main function.
*	This class only creates an instance of a MainController
*		and lets it handle the program from there.
*	@author: Pillejera, Jasper Glen A.
*	Last modified: Oct. 28, 2018
*/

import controller.*;

import javafx.application.*;
import javafx.stage.*;

public class Driver extends Application {
	
	private static String[] launchArguments;
	
	/**
	*	@return returns an array of launch arguments
	*/
	public String[] getLaunchArguments () {
		return launchArguments;
	}
	
	/**
	*	This function just passes the main stage to the main program controller
	*	@param mainStage the Stage object of the application, i.e. the main window.
	*/
	public void start (Stage mainStage) {
		new ApplicationController (mainStage);
	}
	
	/**
	*	The main function of the program, only purpose is to launch the application.
	*	@param args array of launch arguments
	*/
	public static void main (String[] args) {
		launchArguments = args;
		launch (args);
	}
	
}