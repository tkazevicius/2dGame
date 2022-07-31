package com.code.object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class BootsObject extends SuperObject {

    public BootsObject() {

        name = "Boots";
        try {

            image = ImageIO.read(getClass().getResourceAsStream("/res/objects/boots.png"));

        } catch(IOException e) {
            e.printStackTrace();
        }
        collision = true;
    }
}
