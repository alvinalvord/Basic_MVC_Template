/**
*	Parent interface for all views.
*	Views observe a specific model and is controlled by a controller.
*	@author: Pillejera, Jasper Glen A.
*	last modified: Oct. 28, 2018
*/

package view;

public interface View {
	
	/**
	*	Updates the view of subclasses. Each node which needs to be updated, e.g. label text change, textfield reset, password field reset, etc. should be scheduled to be updated by the controller / immediately updated here.
	*	This function is called whenever a request for update from the model is needed.
	*/
	public void update ();
	
}