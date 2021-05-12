package SnakeV2;

import java.awt.*;

public class Token {
    private int x, y, score;
    private Snake snake;

    public Token(Snake s){
        x = (int)(Math.random() * 395);
        y = (int)(Math.random() * 395);
        this.snake = s;
    }
    public void changePosition(){
        x = (int)(Math.random() * 395);
        y = (int)(Math.random() * 395);
    }

    public int getScore(){
        return score;
    }
    public void draw(Graphics g){  //this is the apple
        g.setColor(Color.RED);
        g.fillRect(x,y,10,10);
    }
    public boolean snakeCollision(){
        int snakeX = snake.getX() + 2;
        int snakeY = snake.getY() + 2;
        if(snakeX >= x-1 && snakeX <= (x + 7)){
            if(snakeY >= y - 1 && snakeY <= (y + 7)){
                changePosition();
                score++;
                snake.setElongate(true);
                return true;
            }
        }
        return true;
    }
}
