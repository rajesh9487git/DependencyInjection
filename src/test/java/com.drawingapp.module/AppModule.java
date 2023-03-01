package com.drawingapp.module;

import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule {
    @Override
    protected void configure(){

        bind(DrawShape.class).to(DrawSquare.class);

    }


}

// App module class is necessary if you need to bind an interface(Injecting an interface),
// if you are injecting a class you do not need to bind
