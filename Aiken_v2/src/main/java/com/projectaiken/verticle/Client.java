package com.projectaiken.verticle;

import org.vertx.java.core.Handler;
import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.platform.Verticle;

public class Client extends Verticle {
    public void start() {
        vertx.createHttpServer().requestHandler(new Handler<HttpServerRequest>() {
            public void handle(HttpServerRequest req) {
                String file = req.path().equals("/") ? "index.html" : req.path();
                req.response().sendFile("../../../../" + file);
            }
        }).listen(8080);
    }
}
