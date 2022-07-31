package com.code.main;

import com.code.object.BootsObject;
import com.code.object.ChestObject;
import com.code.object.DoorObject;
import com.code.object.KeyObject;

public class AssetManager {

    GamePanel gamePanel;

    public AssetManager(GamePanel gamePanel) {

        this.gamePanel = gamePanel;
    }

    public void setObject() {
        gamePanel.superObject[0] = new KeyObject();
        gamePanel.superObject[0].worldX = 23 * gamePanel.tileSize;
        gamePanel.superObject[0].worldY = 7 * gamePanel.tileSize;

        gamePanel.superObject[1] = new KeyObject();
        gamePanel.superObject[1].worldX = 23 * gamePanel.tileSize;
        gamePanel.superObject[1].worldY = 40 * gamePanel.tileSize;

        gamePanel.superObject[2] = new KeyObject();
        gamePanel.superObject[2].worldX = 38 * gamePanel.tileSize;
        gamePanel.superObject[2].worldY = 8 * gamePanel.tileSize;

        gamePanel.superObject[3] = new DoorObject();
        gamePanel.superObject[3].worldX = 10 * gamePanel.tileSize;
        gamePanel.superObject[3].worldY = 11 * gamePanel.tileSize;

        gamePanel.superObject[4] = new DoorObject();
        gamePanel.superObject[4].worldX = 8 * gamePanel.tileSize;
        gamePanel.superObject[4].worldY = 28 * gamePanel.tileSize;

        gamePanel.superObject[5] = new DoorObject();
        gamePanel.superObject[5].worldX = 12 * gamePanel.tileSize;
        gamePanel.superObject[5].worldY = 22 * gamePanel.tileSize;

        gamePanel.superObject[6] = new ChestObject();
        gamePanel.superObject[6].worldX = 10 * gamePanel.tileSize;
        gamePanel.superObject[6].worldY = 7 * gamePanel.tileSize;

        gamePanel.superObject[7] = new BootsObject();
        gamePanel.superObject[7].worldX = 37 * gamePanel.tileSize;
        gamePanel.superObject[7].worldY = 42 * gamePanel.tileSize;

    }
}
