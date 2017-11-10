package com.CS151FinalProject.Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

//import com.CS151FinalProject.DModel.DShapeModel;
import com.CS151FinalProject.DShapes.DShape;

@SuppressWarnings("serial")
public class Canvas extends JPanel {

	// Graphics g;

	List<DShape> shapes = new ArrayList<>();

	public Canvas() {

		super();

		this.setPreferredSize(new Dimension(400, 400));

		this.setBackground(Color.white);

	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		for (DShape shape : shapes) {
			g.setColor(shape.getModel().getColor());
			shape.draw(g);

		}

	}

	public void addShape(DShape shape) {

		shapes.add(shape);

		this.repaint();

		this.revalidate();

	}

}
