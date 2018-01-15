package com.pahjha.motionwebapp.websocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.client.standard.WebSocketContainerFactoryBean;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

	@Bean
	public WebSocketContainerFactoryBean createWebSocketContainer() {
		WebSocketContainerFactoryBean container = new WebSocketContainerFactoryBean();
		container.setMaxTextMessageBufferSize(8192);
		container.setMaxBinaryMessageBufferSize(8192);
		return container;
	}

	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		registry.addHandler(new WebsocketMessagingHandler(), "/message")
				.addInterceptors(new HttpSessionHandshakeInterceptor());
	}

}