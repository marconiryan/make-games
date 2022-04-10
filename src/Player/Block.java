package Player;

import java.awt.*;


public class Block {
    int posx, posy;
    Keyboard keyboard;
    public Block(Keyboard keyboard){
        this.posx = 400;
        this.posy = 300;
        this.keyboard = keyboard;
    }
    public void drawBlock(Graphics2D graph){
        graph.setColor(Color.CYAN);
        graph.fillRect(this.posx,this.posy, 20,20);

    }
    public void update(){
        if(keyboard.Key_Right){
            this.posx += 5;
        }
        else if (keyboard.Key_Left){
            this.posx -= 5;
        }
        else if (keyboard.Key_Down){
            this.posy += 5;
        }
        else if (keyboard.Key_UP){
            this.posy -= 5;
        }
    }
}
