package com.drawingapp.requests;

import com.drawingapp.module.AppModule;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class SquareRequest {

    // Interface DrawShape can also be injected as below, but then binding will
    // be needed in case of interface injection
//    @Inject
//    DrawShape d;

    @Inject
    DrawSquare d;

    public void makeRequest(){
        d.draw();
    }


    // Object can be created using injector in the same class as well, as below
//    private static void sendRequest(){
//
//            Injector injector = Guice.createInjector(new AppModule());
//            SquareRequest request = injector.getInstance(SquareRequest.class);
//            request.makeRequest();
//        }
//
//
//    public static void main (String [] args){
//
//        sendRequest();
//
//    }


}
