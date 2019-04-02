package com.codegym;

public class Point3D extends Point2D {
    private float z = 0.0f;
    private float[] xyz = new float[3];

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
        this.xyz [0] = x;
        this.xyz [1] = y;
        this.xyz [2] = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return xyz;
    }

    public void setXYZ_(float x,float y,float z) {
        xyz [0] = x;
        xyz [1] = y;
        xyz [2] = z;
    }

    @Override
    public String toString() {
        return "(x,y,z) = ("+ getXYZ()[0]+", "+ getXYZ()[1]+", "+ getXYZ()[2]+").";
    }
}
