package com.timberkito.cqytc.class11;

public class Gymnastics implements ComputeAverage {
    @Override
    public double average(double[] scores) {
        double temp = 0;
        //从小到大排序
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - i - 1; j++) {
                if (scores[j] > scores[j + 1]) {
                    temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                }
            }
        }
        //测试从小到大输出
        System.out.println("体操选手成绩从大到大顺序为：");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println("");
        //计算平均成绩
        double sum = 0;
        for (int i = 1; i < scores.length - 1; i++) {
            sum = scores[i] + sum;
        }
        sum = sum / (scores.length - 2);
        return sum;
    }
}
