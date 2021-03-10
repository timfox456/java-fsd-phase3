package com.example.SpringExamples.beans;


import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component

public class CustomEventListener implements ApplicationListener<CustomEvent> {
        
	@Override
   public void onApplicationEvent(CustomEvent event) {
      System.out.println(event.toString());
   }
}
