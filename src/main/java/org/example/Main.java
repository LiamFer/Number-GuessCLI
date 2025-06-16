package org.example;
import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(
        name = "number-guessing",
        mixinStandardHelpOptions = true,
        version = "number-guessing 1.0",
        description = "Aplicativo de advinhar número no terminal.",
        subcommands = {StartGame.class}
)
public class Main implements Runnable {
    @Override
    public void run() {
        System.out.println("Use um comando!");
    }
    public static void main(String[] args) {
        int exitCode = new CommandLine(new Main()).execute(args);
        System.exit(exitCode);
    }
}




