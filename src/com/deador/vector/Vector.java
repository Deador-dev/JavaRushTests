package com.deador.vector;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector() {
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double scalarProduct(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector multiplicationVector(Vector vector) {
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }

    public double cosOfVector(Vector vector) {
        return scalarProduct(vector) / (length() * vector.length());
    }

    public Vector add(Vector vector) {
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }

    public Vector subtract(Vector vector) {
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }

    public static Vector[] randomVector(int numberOfVectors){
        Vector[] vectors = new Vector[numberOfVectors];
        for(int i = 0; i < vectors.length; i++){
            vectors[i] = new Vector((int) (Math.random() * 50), (int) (Math.random() * 50), (int) (Math.random() * 50));
        }
        return vectors;
    }

}
