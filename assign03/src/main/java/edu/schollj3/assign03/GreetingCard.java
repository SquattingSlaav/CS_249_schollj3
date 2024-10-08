package edu.schollj3.assign03;

public class GreetingCard {
    private String[] cardLines;
    private char boundChar;

    public GreetingCard(String[] lines, char boundaryChar) {
        setLines(lines);
        boundChar = boundaryChar;
    }

    public char getBoundaryChar() {
        return boundChar;
    }

    public String getLines() {
        StringBuilder sb = new StringBuilder();
        for (String line : cardLines) {
            sb.append(line);
        }
        return sb.toString();
    }

    public void setBoundaryChar(char boundaryChar) {
        boundChar = boundaryChar;
    }

    public void setLines(String[] lines) {
        cardLines = new String[lines.length];
        System.arraycopy(lines, 0, cardLines, 0, lines.length);
    }

    public String generateBoundaryLine() {
        StringBuilder sb = new StringBuilder();
        sb.repeat(boundChar, 50);
        sb.append("\n");
        return sb.toString();
    }

    public String generateCenteredLine(String text) {
        StringBuilder sb = new StringBuilder();
        if(text.length() > 0)
            text = " " + text + " ";
        int padding = 50 - text.length();
        sb.repeat(boundChar, (int)(0.5 * padding));
        sb.append(text);
        sb.repeat(boundChar, (int)(0.5 * padding));
        sb.append("\n");
        return sb.toString();
    }

    public String toString() {
        final int width = 50;
        final int height = 9;

        StringBuilder sb = new StringBuilder();

        int lineC = 5;
        int extraLines = 0;
        if (lineC % 5 == 0) {
            lineC++;
            if (!sb.isEmpty()) {
                sb.append("\n");
            }
            generateBoundaryLine();
            generateBoundaryLine();

        }
        return sb.toString();
    }
}
