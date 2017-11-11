package com.CS151FinalProject.Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import com.CS151FinalProject.DModel.DShapeModel;
//import com.CS151FinalProject.DModel.DShapeModel;
import com.CS151FinalProject.DShapes.DShape;

@SuppressWarnings("serial")
public class Canvas extends JPanel implements ModelListener {

	// Graphics g;

	List<DShape> shapes = new ArrayList<>();

	DShape selectedShape;

	public Canvas() {

		super();

		this.setPreferredSize(new Dimension(400, 400));

		this.setBackground(Color.white);

		SelectedShapeListener listener = new SelectedShapeListener();

		this.addMouseListener(listener);

		this.addMouseMotionListener(listener);

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

		shape.getModel().addListener(WhiteBoard.getWhiteBoard().canvas);

		selectedShape = shape;

		this.repaint();

		this.revalidate();

	}

	@Override
	public void modelChanged(DShapeModel model) {

		this.repaint();

		this.revalidate();

	}

	private class SelectedShapeListener implements MouseListener, MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseClicked(MouseEvent e) {

			for (int i = shapes.size() - 1; i >= 0; i--) {

				if (shapes.get(i).getModel().getBounds().contains(e.getPoint())) {
					selectedShape = shapes.get(i);
					break;

				}
			}

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}

}
