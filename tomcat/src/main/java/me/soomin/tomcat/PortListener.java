package me.soomin.tomcat;

import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class PortListener implements ApplicationListener<ServletWebServerInitializedEvent> {

    @Override
    public void onApplicationEvent(ServletWebServerInitializedEvent event) {
        ServletWebServerApplicationContext context = event.getApplicationContext();
        int port = context.getWebServer().getPort();
        System.out.println(port);
    }
}
