/**
*	SAMPLE VIEW DISREGARD IF YOU WANT
*	@author: Pillejera, Jasper Glen A.
*	last modified: Oct. 28, 2018
*/

package view;

import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class SampleView extends VBox implements View {
	
	private Label lbl;
	private LabelUpdater labelUpdater;
	private LabelEventHandler labelEventHandler;
	
	public SampleView () {
		Label hello = new Label ("HELLO WORLD");
		hello.setId ("hello");
		lbl = new Label ();
		lbl.setId ("lbl");
		lbl.setOnMouseClicked (e -> labelEventHandler.handle ());
		getChildren ().add (hello);
		getChildren ().add (lbl);
	}
	
	public interface LabelUpdater {
		public void update (Label lbl);
	}
	
	public void setLabelUpdater (LabelUpdater labelUpdater) {
		this.labelUpdater = labelUpdater;
	}
	
	public interface LabelEventHandler {
		public void handle ();
	}
	
	public void setLabelEventHandler (LabelEventHandler labelEventHandler) {
		this.labelEventHandler = labelEventHandler;
	}
	
	public void update () {
		labelUpdater.update (lbl);
	}
	
}