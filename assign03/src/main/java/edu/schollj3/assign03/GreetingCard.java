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
            sb.append("\n");
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
        if(!text.isEmpty())
            text = " " + text + " ";
        int padding = 50 - text.length();
        int padding1 = padding / 2;
        int padding2 = padding - padding1;
        sb.repeat(boundChar, padding1);
        sb.append(text);
        sb.repeat(boundChar, padding2);
        sb.append("\n");

        return sb.toString();
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        int lineC = 0;
        int extraLineC = 0;
        int cards = (int)Math.ceil(cardLines.length/5.0);
        for(int i = 0; i < cards; i++) {
            if (i % 5 == 0) {
                if (!sb.isEmpty())
                    sb.append("\n");
            }
            generateBoundaryLine();
            generateBoundaryLine();
            if (j > 0) {
                lineC = cardLines.length - lineC;
                extraLineC = j;
            } else {
                lineC = 5;
                extraLineC = 0;
            }

            for (int k = 0; k < lineC; k++) {
                sb.append(cardLines[j]);
            }

            for (int k = 0; k < extraLineC; k++) {
                generateBoundaryLine();
            }
            generateBoundaryLine();
            generateBoundaryLine();
        }

        return sb.toString();
    }
}
