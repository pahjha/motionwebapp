package com.pahjha.motionwebapp.websocket;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class WebsocketMessagingHandler extends TextWebSocketHandler {

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {

	}

	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {

	}

}
