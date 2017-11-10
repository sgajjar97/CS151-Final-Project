package com.CS151FinalProject.DShapes;

import java.awt.Graphics;

import com.CS151FinalProject.DModel.DOvalModel;
//import com.CS151FinalProject.DModel.DRectangleModel;

public class DOval extends DShape {

	public DOval() {

		super();

		model = new DOvalModel();

	}

	@Override
	public void draw(Graphics g) {

		g.drawOval(model.getX(), model.getY(), model.getWidth(), model.getHeight());

	}

}
