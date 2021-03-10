package com.example.SpringExamples.beans;


import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;


public class CustomEvent extends ApplicationEvent{
   
   public CustomEvent(Object source) {
      super(source);
   }
   public String toString(){
      return "This is a custom event";
   }
}
