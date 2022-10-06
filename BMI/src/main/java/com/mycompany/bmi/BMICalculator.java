package com.mycompany.bmi;

/**
 *
 * @author sudhi
 */
public class BMICalculator {
    
    public float BMICalculate(int iFeet, int iInches, int iPound) {
        
        int weight = iPound*703;
        int height = (iFeet*12)+iInches;
        float bmi = (float)weight/(height*height);
        return bmi;
    }
    
}
