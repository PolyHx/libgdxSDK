package io.polyhx;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import io.polyhx.engine.entities.AnimatedSpriteEntity;
import io.polyhx.engine.entities.SpriteEntity;
import io.polyhx.engine.utils.Clock;
import io.polyhx.engine.utils.Constants;
import io.polyhx.engine.utils.Mouse;

import java.util.ArrayList;
import java.util.Calendar;

public class Game {

    private SpriteEntity background;
    private AnimatedSpriteEntity bird;
    private ArrayList<SpriteEntity> obstacles;
    private Clock clock;
    private final float spawnRate = 1.0f;
    private int scrollX;

    public Game() {
        background = new SpriteEntity("scrollingBackground.png");
        background.setWrapRepeat();
        clock = new Clock();
        bird = new AnimatedSpriteEntity("oiseaux.png", 2, 4);
        obstacles = new ArrayList<SpriteEntity>();
        scrollX = 0;
    }

    private void generateObstacle() {
        SpriteEntity tmp = new SpriteEntity("obstacle.png");
        int x = (int)(Math.random() * Constants.WIDTH);
        int velocityX = (int)(Math.random() * 40 - 20);
        int velocityY = (int)(Math.random() * 300 + 100);
        tmp.setPosition(new Vector2(x, 0));
        tmp.setVelocity(new Vector2(-velocityX, velocityY));
        obstacles.add(tmp);
    }

    public void act(float delta) {
        bird.setPosition(Mouse.getPosition());

        if (clock.getElapsedTime() >= 1 / spawnRate) {
            generateObstacle();
            clock.restart();
        }

        for (int i = 0; i < obstacles.size(); i++) {
            if (obstacles.get(i).getBounds().overlaps(bird.getBounds())) {
                obstacles.remove(i);
                i--;
            }

            else if (obstacles.get(i).getPosition().y > Constants.HEIGHT) {
                obstacles.remove(i);
                i--;
            }
        }
    }

    public void draw(Batch batch) {

        scrollX += 10;
        batch.draw(background.getSprite().getTexture(), 0.0f, 0.0f, scrollX, 0, Constants.WIDTH, Constants.HEIGHT);

        for (SpriteEntity it: obstacles) {
            it.draw(batch);
        }

        bird.draw(batch);
    }
}
