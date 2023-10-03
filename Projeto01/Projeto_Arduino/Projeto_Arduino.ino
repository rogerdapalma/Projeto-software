int ledPin = 13; // Atribui o pino 13 à variável ledPin
char dado; // Variável que receberá os dados da porta serial

void setup() {
  Serial.begin(9600); // Frequência da porta serial
  pinMode(ledPin, OUTPUT); // Define o pino ledPin como saída
}

void loop() {
  if (Serial.available() > 0) { // Verifica se existe comunicação com a porta serial
    dado = Serial.read(); // Lê os dados da porta serial como um caractere
    switch (dado) {
      case 1:
        digitalWrite(ledPin, HIGH); // Liga o pino ledPin
        break;
      case 2:
        digitalWrite(ledPin, LOW); // Desliga o pino ledPin
        break;
    }
  }
}
