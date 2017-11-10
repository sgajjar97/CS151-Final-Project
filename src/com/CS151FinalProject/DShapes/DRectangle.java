package com.CS151FinalProject.DShapes;

import java.awt.Graphics;
//import java.awt.Rectangle;

import com.CS151FinalProject.DModel.DRectangleModel;

public class DRectangle extends DShape {

	public DRectangle() {

		super();

		model = new DRectangleModel();

	}

	@Override
	public void draw(Graphics g) {

		g.drawRect(model.getX(), model.getY(), model.getWidth(), model.getHeight());

	}

}
