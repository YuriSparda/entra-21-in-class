package exep7;

import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JColorChooser C1 = new JColorChooser();
		JFrame f = new JFrame();// creating instance of JFrame
		JTextArea t = new JTextArea(sc.next());
		JButton b = new JButton("Iniciar");// creating instance of JButton
		b.setBounds(120, 0, 120, 20);// x axis, y axis, width, height
		t.setBounds(120, 60, 120, 20);// x axis, y axis, width, height
		f.add(b);// adding button in JFrame
		f.add(t);// add text box
		f.setSize(400, 500);// 400 width and 500 height
		f.setLayout(null);// using no layout managers
		f.setVisible(true);// making the frame visible

		String text = t.getText();
	}

}
