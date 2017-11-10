package com.CS151FinalProject.Main;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
//import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
//import javax.swing.JPanel;
import javax.swing.JTextField;

import com.CS151FinalProject.DShapes.*;

public class Controls {

	String[] fonts = { "Arial", "Times New Roman" };

	JButton rectangle;

	JButton oval;

	JButton line;

	JButton text;

	JButton setColor;

	JButton moveToFront;

	JButton moveToBack;

	JButton removeShape;

	JTextField textField;

	JLabel selectTextLabel;

	JLabel enterTextLabel;

	@SuppressWarnings("rawtypes")
	JComboBox fontOptions;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Controls() {

		rectangle = new JButton("Rect");

		rectangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				DShape rect = new DRectangle();

				rect.getModel().setX(10);

				rect.getModel().setY(10);

				rect.getModel().setWidth(50);

				rect.getModel().setHeight(50);

				WhiteBoard.getWhiteBoard().canvas.addShape(rect);

			}
		});

		oval = new JButton("Oval");

		oval.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				DShape oval = new DOval();

				oval.getModel().setX(20);

				oval.getModel().setY(20);

				oval.getModel().setWidth(50);

				oval.getModel().setHeight(50);

				WhiteBoard.getWhiteBoard().canvas.addShape(oval);

			}
		});

		line = new JButton("Line");

		text = new JButton("Text");

		setColor = new JButton("Color");

		moveToFront = new JButton("Move to Front");

		moveToBack = new JButton("Move to Back");

		removeShape = new JButton("Remove Shape");

		textField = new JTextField();

		textField.setPreferredSize(new Dimension(150, 150));

		textField.setMaximumSize(new Dimension(250, 350));

		fontOptions = new JComboBox(fonts);

		fontOptions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		selectTextLabel = new JLabel("Select Font ");

		enterTextLabel = new JLabel("Enter Text ");

	}

	public Box getControls() {

		Box verticalBox = Box.createVerticalBox();

		Box firstBox = Box.createHorizontalBox();

		firstBox.setPreferredSize(new Dimension(75, 75));

		firstBox.add(rectangle);

		firstBox.add(oval);

		firstBox.add(line);

		firstBox.add(text);

		firstBox.add(setColor);

		Box thirdBox = Box.createHorizontalBox();

		thirdBox.add(selectTextLabel);

		thirdBox.add(fontOptions);

		Box fourthBox = Box.createHorizontalBox();

		fourthBox.add(moveToFront);

		fourthBox.add(moveToBack);

		fourthBox.add(removeShape);

		Box fifthBox = Box.createHorizontalBox();

		fifthBox.add(enterTextLabel);

		fifthBox.add(textField);

		verticalBox.add(firstBox);

		verticalBox.add(fifthBox);

		verticalBox.add(thirdBox);

		verticalBox.add(fourthBox);

		for (Component comp : verticalBox.getComponents()) {
			((JComponent) comp).setAlignmentX(Box.LEFT_ALIGNMENT);

		}

		return verticalBox;
	}

}
