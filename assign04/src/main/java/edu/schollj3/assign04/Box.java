package edu.schollj3.assign04;

public class Box {
    private int sr;
    private int sc;
    private int er;
    private int ec;
    private boolean filled;
    private char drawChar;

    public Box(int sr, int sc, int er, int ec, boolean filled, char drawChar) {
        this.sr = sr;
        this.sc = sc;
        this.er = er;
        this.ec = ec;
        this.filled = filled;
        this.drawChar = drawChar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (filled) {
            sb.append("Filled Box from (");
            sb.append(sr);
            sb.append(",");
            sb.append(sc);
            sb.append(") to (");
            sb.append(er);
            sb.append(",");
            sb.append(ec);
            sb.append(") with char '");
            sb.append(drawChar);
            sb.append("'");
        }else {
            sb.append("Box from (");
            sb.append(sr);
            sb.append(",");
            sb.append(sc);
            sb.append(") to (");
            sb.append(er);
            sb.append(",");
            sb.append(ec);
            sb.append(") with char '");
            sb.append(drawChar);
            sb.append("'");
        }

        return sb.toString();
    }

    public void draw(GameBoard s) {
        if (filled) {
            for (int i = sr; i <= er; i++) {
                for (int j = sc; j <= ec; j++) {
                    s.setPos(i,j,drawChar);
                }
            }
        }else{
            for (int i = sr; i <= er; i++) {
                for (int j = sc; j <= ec; j++) {
                    if(i == sr || i == er || j == sc || j == ec){
                        s.setPos(i,j,drawChar);
                    }
                }
            }
        }
    }
}
