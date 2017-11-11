package com.CS151FinalProject.DShapes;

import java.awt.Graphics;
import java.awt.Point;

import com.CS151FinalProject.DModel.*;
//import com.CS151FinalProject.Main.*;

public class DShape {

	DShapeModel model;

	// private WhiteBoard whiteBoard;

	public DShape() {

	}

	public DShapeModel getModel() {
		return model;
	}

	public void setModel(DShapeModel model) {
		this.model = model;
	}

	public void draw(Graphics g) {

	}

	public Point[] getKnobs() {

		Point topLeft = new Point(model.getX() - (9 / 2), model.getY() - (9 / 2));

		Point bottomLeft = new Point(model.getX() - (9 / 2), model.getY() + model.getHeight() - (9 / 2));

		Point topRight = new Point(model.getX() + model.getWidth() - (9 / 2), model.getY() - (9 / 2));

		Point bottomRight = new Point(model.getX() + model.getWidth() - (9 / 2),
				model.getY() + model.getHeight() - (9 / 2));

		Point[] knobs = { topLeft, bottomLeft, topRight, bottomRight };

		return knobs;
	}

}
