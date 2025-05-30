package nl.cape.academy.solidprinciples.services.impl;

import java.io.PrintWriter;

public class LoggerImpl {
    public void logMessage(String message) {
        this.getWriter().println(message);
    }

    public void logMessage(String messageTemplate, Object...args) {
        this.getWriter().println(String.format(messageTemplate, args));
    }

    private PrintWriter getWriter() {
        return System.console().writer();
    }
}