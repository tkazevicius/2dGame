package com.code.main;

import com.code.object.KeyObject;

import java.awt.*;
import java.awt.image.BufferedImage;

public class UI {

    GamePanel gamePanel;
    Font arialFont, arialBold;
    BufferedImage keyImage;

    public boolean messageOn = false;
    public String message = "";
    int messageCounter = 0;
    public boolean gameFinished = false;

    public UI (GamePanel gamePanel) {
        this.gamePanel = gamePanel;

        arialFont = new Font("Arial", Font.PLAIN, 40);
        arialBold = new Font("Arial", Font.BOLD, 80);
        KeyObject keyObject = new KeyObject();
        keyImage = keyObject.image;
    }

    public void showMessage (String text) {

        message = text;
        messageOn = true;
    }

    public void draw (Graphics2D g2) {

        if (gameFinished) {

            String text;
            int textLength;
            int x, y;

            g2.setFont(arialFont);
            g2.setColor(Color.GREEN);
            text = "You found the treasure!";
            textLength = (int) g2.getFontMetrics().getStringBounds(text, g2).getWidth();
            x = gamePanel.screenWidth/2 - textLength/2;
            y = gamePanel.screenHeight/2 - (gamePanel.tileSize * 3);
            g2.drawString(text, x, y);

            g2.setFont(arialBold);
            g2.setColor(Color.GREEN);
            text = "Congratulations!";
            textLength = (int) g2.getFontMetrics().getStringBounds(text, g2).getWidth();

            x = gamePanel.screenWidth/2 - textLength/2;
            y = gamePanel.screenHeight/2 + (gamePanel.tileSize * 2);
            g2.drawString(text, x, y);

            gamePanel.gameThread = null;

        } else {
            g2.setFont(arialFont);
            g2.setColor(Color.WHITE);
            g2.drawImage(keyImage, gamePanel.tileSize/2, gamePanel.tileSize/2, gamePanel.tileSize, gamePanel.tileSize, null);
            g2.drawString("X "+ gamePanel.player.keyAmount, 75, 63);

            if (messageOn) {

                g2.drawString(message, 48, 550);
                messageCounter++;

                if (messageCounter > 120) {
                    messageCounter = 0;
                    messageOn = false;
                }
            }
        }

    }
}
