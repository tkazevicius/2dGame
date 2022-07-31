package com.code.object;

import com.code.tile.Tile;

import javax.imageio.ImageIO;
import java.io.IOException;

public class KeyObject extends SuperObject {

    public KeyObject() {

        name = "Key";
        try {

            image = ImageIO.read(getClass().getResourceAsStream("/res/objects/key.png"));

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
