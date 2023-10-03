package com.example.demo.controller;

import com.example.demo.model.Arduino;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/led")
public class LedController {

    Arduino arduino = new Arduino();

    @GetMapping("/ligar")
    public String ligar(){
        arduino.comunicacaoArduino(1);
        //manda o arduino ligar o led
        return "ligado";

    }

    @GetMapping("/desligar")
    public String desligar(){
        arduino.comunicacaoArduino(2);
        //manda o arduino desligar o led
        return "desligado";
    }

}

