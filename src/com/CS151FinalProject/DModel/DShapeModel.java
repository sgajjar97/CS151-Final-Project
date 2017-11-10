package com.CS151FinalProject.DModel;

import java.awt.Color;

public class DShapeModel {

	int x, y;

	int width, height;

	Color color;

	public DShapeModel() {

		x = 0;

		y = 0;

		width = 0;

		height = 0;

		color = Color.gray;

	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
