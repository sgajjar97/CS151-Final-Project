package com.CS151FinalProject.DModel;

import java.awt.Color;
import java.awt.Rectangle;
import java.util.ArrayList;

import com.CS151FinalProject.Main.ModelListener;

public class DShapeModel {

	private int x, y;

	private int width, height;

	private Color color;

	private ArrayList<ModelListener> listeners = new ArrayList<>();

	public DShapeModel() {

		x = 0;

		y = 0;

		width = 0;

		height = 0;

		color = Color.gray;

	}

	public Rectangle getBounds() {
		return new Rectangle(getX(), getY(), getWidth() + 9, getHeight() + 9);
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {

		this.color = color;

		notifyListeners();

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;

		notifyListeners();
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;

		notifyListeners();
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;

		notifyListeners();
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;

		notifyListeners();
	}

	public void addListener(ModelListener listener) {
		listeners.add(listener);
	}

	public void removeListener(ModelListener listener) {
		listeners.remove(listener);
	}

	public void notifyListeners() {

		for (ModelListener listener : listeners)
			listener.modelChanged(DShapeModel.this);

	}

	public ArrayList<ModelListener> getListeners() {
		return listeners;
	}

}
