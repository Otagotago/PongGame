package myPongGame;

import java.awt.Color;

public class Paddle extends Sprite {
		
	public static final int PADDLE_WIDTH = 10;
	public static final int PADDLE_HEIGHT = 100;
	public static final Color PADDLE_COLOUR = (Color.WHITE);
	public static final int DISTANCE_FROM_EDGE = 40;
	
	public Paddle(Player player, int panelWidth, int panelHeight) {
        setWidth(PADDLE_WIDTH);
        setHeight(PADDLE_HEIGHT);
        setColour(PADDLE_COLOUR);
        int xPos;
        if(player == Player.One) {
            xPos = DISTANCE_FROM_EDGE;
        } else {
            xPos = panelWidth - DISTANCE_FROM_EDGE - getWidth();
        }
        setInitialPosition(xPos, panelHeight / 2 - (getHeight() / 2));
        resetToInitialPosition();
    }
	
}