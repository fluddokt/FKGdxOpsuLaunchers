package com.mygdx.game.desktop;

import fluddokt.ex.DeviceInfo;
import fluddokt.opsu.fake.GameOpsu;

import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	static LwjglApplicationConfiguration config;
	public static void main (String[] arg) {
		config = new LwjglApplicationConfiguration();
		config.width = 800;
		config.height = 600;
		config.addIcon("res/icon16.png", FileType.Internal);
		config.addIcon("res/icon32.png", FileType.Internal);
		config.vSyncEnabled = false;
		config.foregroundFPS = 240;
		config.backgroundFPS = 240;
		//config.audioDeviceBufferCount=240;
		DeviceInfo.info = new DeviceInfo(){

			@Override
			public void setFPS(int targetFPS) {
				config.foregroundFPS = targetFPS;
			}
			
		};
		new LwjglApplication(new GameOpsu(), config);
		
	}
}
