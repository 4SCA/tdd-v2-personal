package edu.pe.cibertec;

public class Triangle {

    public enum TriangleType{
        EQUILATERAL,
        ISOCELES,
        ESCALENO,
        INVALID
    }
    public TriangleType classify(int a, int b, int c) {
        if(a == b && b == c){
            return TriangleType.EQUILATERAL;
        }
        if (a == b || b == c || a == c) {
            return TriangleType.ISOCELES;
        }
        if (a != b && b != c) {
            return TriangleType.ESCALENO;
        }
        return TriangleType.INVALID;
    }

}
