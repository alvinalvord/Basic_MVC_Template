/**
*	Abstract parent for all models of the application.
*	Employs observer pattern, i.e. the model is the subject and the views observe the model.
*	@author: Pillejera, Jasper Glen A.
*	last modified: Oct. 28, 2018
*/

package model;

import view.*;

import java.util.*;

public abstract class Model {
	
	protected ArrayList<View> views;
	
	/**
	*	Defualt constructor of model. Constructs a container (list) for observers.
	*/
	protected Model () {
		views = new ArrayList <> ();
	}
	
	/**
	*	Attaches a view v into the list of observers, i.e. adds it to the list.
	*	@param v the view that wants to observe this model.
	*/
	public void attach (View v) {
		views.add (v);
	}
	
	/**
	*	Detaches a view v from the list of observers, i.e. removes it from the list.
	*	@param v the view that will stop observing this model.
	*/
	public void detach (View v) {
		views.remove (v);
	}
	
	/**
	*	Notifies all observing views. Call this function if visual update is needed.
	*/
	public void notifyViews () {
		for (View v: views)
			v.update ();
	}
	
}