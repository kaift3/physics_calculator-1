package com.protexcreative.physicscalapp.Calculation;

public class Calculate {

    public float calSpeed(float dist, float time){
        float result = (float)dist/time;

        return result;
    }

    // THERMODYNAMICS
    // Compressibility Factor
    public float calCF(float z, float r, float t){
        float result = (float) z*r*t;

        return result;
    }

    // Air Fuel Ratio
    public float calAFR(float ma, float mf){
        float result = (float) ma/mf;

        return result;
    }

    // OPTICS
//    Refractive Index
    public float calRI(float c, float v){
        float result = (float) c/v;

        return result;
    }

//    Len's Makers Formula
    public float calLMF(float mu, float r1, float r2){
        float result = (float) 1/((mu-1)*((1/r1)-(1/r2)));

        return result;
    }

    //    WORK & ENERGY
//        Work
    public double calWork(float f, float d, float deg){
        double result = f*d*Math.cos(deg);

        return result;
    }

    //    MOTION
//    1st law
    public float calLaw1(float u, float a, float t){
        float result = (float) u + (a*t);

        return result;
    }

//    2nd Law
    public double calLaw2(float s1, float u, float t, float a){
        double result = (float) s1 + u*t + 0.5*(a*t*t);

        return result;
    }

//    3rd Law
    public float calLaw3(float u, float a, float s1, float s2){
        float result = (float) Math.sqrt(Math.pow(u, 2) + 2*a*(s2-s1));

        return result;
    }

    //    FLUIDS

    //    FORCE

}
