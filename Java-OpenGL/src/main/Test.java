package main;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;

public class Test {
	// what is up

	/*
	 * System.exit
	 */

	public static void main(String[] args) {
		GLProfile.initSingleton();

		GLProfile glProf = GLProfile.getDefault();
		GLCapabilities glCap = new GLCapabilities(glProf);
		GLContext glCon = GLContext.getCurrent();
		GLCanvas glCanv = new GLCanvas(glCap, glCon);

		Frame frame = new Frame("Hello, World!");
		frame.setSize(1024, 768);
		frame.add(glCanv);
		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}
}
