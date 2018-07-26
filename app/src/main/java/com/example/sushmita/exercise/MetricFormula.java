package com.example.sushmita.exercise;
/**
 * Sushmita Shrestha - 16366
 */
public class MetricFormula {

    //variables
    private double inputKg;
    private double inputM;

    public MetricFormula(double inputKg, double inputM) {
        this.inputKg = inputKg;
        this.inputM = inputM;
    }

    //getter method
    public double getInputKg() {
        return inputKg;
    }

    public double getInputM() {
        return inputM;
    }

    public double computeBMI(double kg, double m) {
        return kg / (Math.pow(m,2));
    }

}
