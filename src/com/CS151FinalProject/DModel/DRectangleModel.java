package com.CS151FinalProject.DModel;

import java.util.ArrayList;

import com.CS151FinalProject.Main.ModelListener;

public class DRectangleModel extends DShapeModel {

	ArrayList<ModelListener> listeners = new ArrayList<>();

	public DRectangleModel() {

		super();

	}

	public void addListener(ModelListener listener) {
		listeners.add(listener);
	}

	public void removeListener(ModelListener listener) {
		listeners.remove(listener);
	}

	public void notifyListeners() {
		for (ModelListener listener : listeners) {
			listener.modelChanged(DRectangleModel.this);
		}
	}

}
