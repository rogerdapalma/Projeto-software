package com.example.demo.model;
import javax.swing.JButton;

public class Arduino {
    private ControlePorta arduino;

    public Arduino(){
        arduino = new ControlePorta("COM3",9600);//Windows - porta e taxa de transmissão
        //arduino = new ControlePorta("/dev/ttyUSB0",9600);//Linux - porta e taxa de transmissão
    }

    public void comunicacaoArduino(int opcao) {
        arduino.enviaDados(opcao);

        }
    }
