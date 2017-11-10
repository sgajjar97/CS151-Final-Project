package com.CS151FinalProject.Main;

import java.awt.BorderLayout;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class WhiteBoard extends JFrame {

	Canvas canvas;

	Controls controls;

	final static WhiteBoard whiteBoard = new WhiteBoard();

	private WhiteBoard() {

		super("WhiteBoard");

		canvas = new Canvas();

		this.setLayout(new BorderLayout());

		this.add(canvas, BorderLayout.CENTER);

		controls = new Controls();

		this.add(controls.getControls(), BorderLayout.WEST);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.pack();

		this.setVisible(true);

	}

	public static WhiteBoard getWhiteBoard() {

		return whiteBoard;
	}

	public static void main(String[] args) {

		WhiteBoard.getWhiteBoard();
		
	}

}
