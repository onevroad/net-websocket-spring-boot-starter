package org.net.websocket.core;

public interface WebSocketEventHandler<Request, Response>  {

    Response onSubscribe(String topic, Request data);

    Response onMessage(String topic, Request data);

    Response onCancel(String topic, Request data);
}
