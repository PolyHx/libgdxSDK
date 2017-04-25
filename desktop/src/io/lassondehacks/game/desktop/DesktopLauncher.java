package io.lassondehacks.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import io.lassondehacks.game.MainGame;
import io.lassondehacks.game.utils.Constants;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Constants.Companion.getWIDTH();
		config.height = Constants.Companion.getHEIGHT();
		new LwjglApplication(new MainGame(), config);
	}
}
