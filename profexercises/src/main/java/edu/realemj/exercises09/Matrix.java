package edu.realemj.exercises09;

public class Matrix {
    private double [][] m;

    public Matrix(int rowCnt, int colCnt) {
        m = new double[rowCnt][colCnt];
    }

    public Matrix(double [][] numbers) {
        m = new double[numbers.length][numbers[0].length];
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                m[i][j] = numbers[i][j];
            }
        }
    }

    public Matrix(Matrix other) {
        m = new double[other.getRowCnt()][other.getColCnt()];
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                m[i][j] = other.m[i][j];
            }
        }
    }

    public int getRowCnt() {
        return m.length;
    }

    public int getColCnt() {
        return m[0].length;
    }

    public boolean isInBounds(int r, int c) {
        return (r >= 0 && r < getRowCnt()
                && c >= 0 && c < getColCnt());
    }

    public double get(int r, int c) {
        /*
        if(isInBounds(r,c)) {
            return m[r][c];
        }
        else {
            return 0;
        }*/
        return isInBounds(r,c) ? m[r][c] : 0;
    }

    public boolean set(int r, int c, double val) {
        boolean success = isInBounds(r,c);
        if(success) {
            m[r][c] = val;
        }
        return success;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(double [] row : m) {
            for(double v : row) {
                sb.append(v);
                sb.append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public Matrix multiply(Matrix other) {
        Matrix result = new Matrix(this.getRowCnt(),
                                    other.getColCnt());

        for(int i = 0; i < result.getRowCnt(); i++) {
            for(int j = 0; j < result.getColCnt(); j++) {
                // result[i,j] = ...
                for(int k = 0; k < this.getColCnt(); k++) {
                    result.m[i][j] += this.m[i][k]*other.m[k][j];
                }
            }
        }

        return result;
    }

    public static Matrix makeTranslation2D(double offx,
                                           double offy) {
        return new Matrix(new double[][] {
                {1,0,offx},
                {0,1,offy},
                {0,0,1}
        });
    }

    public static Matrix makeScaling3D(double sx,
                                       double sy,
                                       double sz) {
        return new Matrix(new double[][] {
                {sx,0,0,0},
                {0,sy,0,0},
                {0,0,sz,0},
                {0,0,0,1}
        });
    }

    public static Matrix makeRotateZ3D(double angle) {
        double r = Math.toRadians(angle);
        double sv = Math.sin(r);
        double cv = Math.cos(r);
        return new Matrix(new double[][] {
                {cv,-sv,0,0},
                {sv,cv,0,0},
                {0,0,1,0},
                {0,0,0,1}
        });
    }

    public static Matrix makePoint2D(double x,
                                     double y) {
        return new Matrix(new double[][] {
                {x},
                {y},
                {1}
        });
    }

    public static Matrix makePoint3D(double x,
                                     double y,
                                     double z) {
        return new Matrix(new double[][] {
                {x},
                {y},
                {z},
                {1}
        });
    }

    public String toPointString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for(int row = 0; row < (getRowCnt()-1); row++) {
            if(row != 0) {
                sb.append(",");
            }
            sb.append(m[row][0]);
        }
        sb.append(")");
        return sb.toString();
    }

    public String to3DVertexOBJString() {
        return "v "
                + m[0][0] + " "
                + m[1][0] + " "
                + m[2][0];
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEqual = false;
        if(obj instanceof Matrix mobj) {
            //Matrix mobj = (Matrix)obj;
            if( getRowCnt() == mobj.getRowCnt() &&
                getColCnt() == mobj.getColCnt()) {

                isEqual = true;
                for(int i = 0; i < getRowCnt(); i++) {
                    for(int j = 0; j < getColCnt(); j++) {
                        if(!MathUtil.isDoubleEqual(
                                m[i][j],
                                mobj.m[i][j])) {
                            isEqual = false;
                            break;
                        }
                    }
                    if(!isEqual) {
                        break;
                    }
                }

            }

        }
        return isEqual;
    }

}

// Added a comment on the end.
// Another comment.
// Yet another comment.