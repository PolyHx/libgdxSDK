package io.polyhx;

import com.badlogic.gdx.graphics.g2d.Batch;
import io.polyhx.engine.entities.AnimatedSpriteEntity;
import io.polyhx.engine.utils.Mouse;

public class Game {

    private AnimatedSpriteEntity bird;

    public Game() {
        bird = new AnimatedSpriteEntity("oiseaux.png", 2, 4);
    }

    public void act(float delta) {
        bird.setPosition(Mouse.getPosition());
    }

    public void draw(Batch batch) {
        bird.draw(batch);
    }
}
