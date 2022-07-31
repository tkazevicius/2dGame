package com.code.object;

import com.code.main.GamePanel;

import java.awt.*;
import java.awt.image.BufferedImage;

public class SuperObject {

    public BufferedImage image;
    public String name;
    public boolean collision = false;
    public int worldX, worldY;
    public Rectangle solidArea = new Rectangle(0, 0, 48, 48);
    public int solidAreaDefaultX = 0;
    public int solidAreaDefaultY = 0;

    public void draw(GamePanel gamePanel,Graphics2D g2) {
        int screenX = worldX - gamePanel.player.worldX + gamePanel.player.screenX;
        int screenY = worldY - gamePanel.player.worldY + gamePanel.player.screenY;

        if (worldX + gamePanel.tileSize*2 > gamePanel.player.worldX - gamePanel.player.screenX &&
                worldX - gamePanel.tileSize*2 < gamePanel.player.worldX + gamePanel.player.screenX &&
                worldY + gamePanel.tileSize*2 > gamePanel.player.worldY - gamePanel.player.screenY &&
                worldY - gamePanel.tileSize*2 < gamePanel.player.worldY + gamePanel.player.screenY) {

            g2.drawImage(image, screenX, screenY, gamePanel.tileSize, gamePanel.tileSize, null);
        }
    }
}
