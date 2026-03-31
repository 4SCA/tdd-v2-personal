package edu.pe.cibertec;

public class Triangle {

    public enum TriangleType{
        EQUILATERAL,
        ISOCELES,
        ESCALENO,
        INVALID
    }
    public TriangleType classify(int a, int b, int c) {
        if (!isValid(a,b,c)){
            return TriangleType.INVALID;
        }
        if(a == b && b == c){
            return TriangleType.EQUILATERAL;
        }
        if (a == b || b == c || a == c) {
            return TriangleType.ISOCELES;
        }
            return TriangleType.ESCALENO;
    }
    private boolean isValid(int a, int b, int c)
    {
        if(a <= 0 || b <= 0 || c <= 0) return false;
        return (a < b + c) && (b < a+ c) && (c < a + b);
    }
}
