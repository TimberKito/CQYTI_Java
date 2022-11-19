package com.timberkito.cqytc.class11;

public class School implements ComputeAverage {
    @Override
    public double average(double[] scores) {

        //计算平均成绩
        int people = 0;
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
            people++;
        }
        sum = sum / people;
        return sum;
    }
}
