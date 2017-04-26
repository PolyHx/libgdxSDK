package io.polyhx.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import io.polyhx.engine.MainGame;
import io.polyhx.engine.utils.Constants;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Constants.Companion.getWIDTH();
		config.height = Constants.Companion.getHEIGHT();
		new LwjglApplication(new MainGame(), config);
	}
}
