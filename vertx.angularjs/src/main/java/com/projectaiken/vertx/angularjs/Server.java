package com.projectaiken.vertx.angularjs;

import org.vertx.java.core.Handler;
import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.platform.Verticle;

public class Server extends Verticle {
    public void start() {
        vertx.createHttpServer().requestHandler(new Handler<HttpServerRequest>() {
            public void handle(HttpServerRequest req) {
                String file = req.path().equals("/") ? "Index.html" : req.path();
                req.response().sendFile("webapp/" + file);
            }
        }).listen(8080);
    }
}
