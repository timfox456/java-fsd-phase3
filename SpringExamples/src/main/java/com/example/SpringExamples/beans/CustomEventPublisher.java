package com.example.SpringExamples.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component

public class CustomEventPublisher {
   @Autowired
   private ApplicationEventPublisher publisher;
   
   public void publish() {
       System.out.println("Publishing custom event. ");

      CustomEvent ce = new CustomEvent(this);
      publisher.publishEvent(ce);
   }
}
