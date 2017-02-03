package com.dakota.mystarfield;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class MyStarField extends ApplicationAdapter {

	ShapeRenderer myRenderer;
	
	@Override
	public void create () {

		myRenderer = new ShapeRenderer();
	}

	@Override
	public void render () {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		myRenderer.begin(ShapeRenderer.ShapeType.Point);
		myRenderer.point(100, 100, 0);
		myRenderer.end();
	}
	
	@Override
	public void dispose () {

	}
}
