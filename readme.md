
# Number Guessing Game

Um jogo simples de adivinhação de números para testar sua sorte no terminal.

---

## Sobre

Este é um jogo CLI onde o computador escolhe um número aleatório entre 1 e 100, e você deve tentar adivinhá-lo em um número limitado de tentativas, dependendo da dificuldade escolhida. O jogo informa se o seu palpite é maior ou menor que o número secreto e termina quando você acerta ou esgota as chances.

---

## Funcionalidades

- Seleção de nível de dificuldade (Fácil, Médio, Difícil) que define as chances do jogador.
- Feedback se o palpite é maior ou menor que o número secreto.
- Mensagem de vitória com a quantidade de tentativas feitas.
- Mensagem de derrota mostrando o número correto.
- Jogo simples e direto via linha de comando.

---

## Como jogar

Você pode executar o jogo diretamente pela linha de comando usando o arquivo `n.bat` que facilita rodar o jogo sem complicações:

```bash
n.bat play
````

Ou, se preferir executar diretamente pela JVM:

```bash
java -cp seu_jar_completo.jar org.example.StartGame
```

---

## Exemplo de saída

```
Welcome to the Number Guessing Game!
I'm thinking of a number between 1 and 100.
You have 5 chances to guess the correct number.

Please select the difficulty level:
1. Easy (10 chances)
2. Medium (5 chances)
3. Hard (3 chances)

Enter your choice: 2

Great! You have selected the Medium difficulty level.
Let's start the game!

Enter your guess: 50
Incorrect! The number is less than 50.

Enter your guess: 25
Incorrect! The number is greater than 25.

Enter your guess: 35
Incorrect! The number is less than 35.

Enter your guess: 30
Congratulations! You guessed the correct number in 4 attempts.
```

---

## Sugestões de melhorias

* Permitir múltiplas rodadas até o usuário decidir sair.
* Adicionar um temporizador para medir o tempo gasto para adivinhar.
* Implementar sistema de dicas para ajudar o jogador.
* Registrar o recorde de menos tentativas por nível de dificuldade.

---

## Tecnologias utilizadas

* Java
* Picocli (para CLI)
* Random (Java API para números aleatórios)

---

## Link do desafio original

Este projeto é uma solução para o desafio do roadmap.sh:

🔗 [Number Guessing Game - roadmap.sh](https://roadmap.sh/projects/number-guessing-game)

