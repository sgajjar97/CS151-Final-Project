package com.CS151FinalProject.DShapes;

import java.awt.Graphics;
//import java.awt.Rectangle;

import com.CS151FinalProject.DModel.DRectangleModel;

public class DRectangle extends DShape {

	public DRectangle() {

		super();

		this.setModel(new DRectangleModel());

	}

	@Override
	public void draw(Graphics g) {

		g.drawRect(this.getModel().getX(), this.getModel().getY(), this.getModel().getWidth(),
				this.getModel().getHeight());

	}

}
