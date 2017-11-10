package com.CS151FinalProject.DShapes;

import java.awt.Graphics;

import com.CS151FinalProject.DModel.DOvalModel;
//import com.CS151FinalProject.DModel.DRectangleModel;
import com.CS151FinalProject.DModel.DRectangleModel;

public class DOval extends DShape {

	public DOval() {

		super();

		 this.setModel(new DOvalModel());

	}

	@Override
	public void draw(Graphics g) {

		g.drawOval(this.getModel().getX(), this.getModel().getY(), this.getModel().getWidth(), this.getModel().getHeight());

	}

}
