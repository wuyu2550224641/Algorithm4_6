package com.example.algorithm4_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Myfaction {
    public static int getResult(int num) {
        double Sn = 0;
        for (int n = 0; n <= num; n++) {
            Sn = Sn + Math.pow(2, n);

        }
        return (int) Sn;
    }

    public static int gerGrade(int first, int second, int third, int fourth, int fifth) {
        List<Float> list = new ArrayList<Float>();
        student(list);
        int Y = 0;
        int B = 0;
        int J = 0;
        int Z = 0;
        int L = 0;
        for (Float f : list) {
            if (f >= 0 && f <= 59) {
                B++;
            }
            if (f >= 60 && f <= 69) {
                J++;
            }
            if (f >= 70 && f <= 79) {
                Z++;
            }
            if (f >= 80 && f <= 89) {
                L++;
            }
            if (f >= 90 && f <= 100) {
                Y++;
            }

        }
        return Y;
    }

    private static void student(List<Float> list) {
        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
        float value = 0;
        try {
            value = Float.valueOf(strin.readLine() == "" ? "0" : strin.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (value >= 0) {
            list.add(value);
            student(list);
        }else{
            return;
        }
    }
    public static String getStudent(){
        String student = null;
        return student;
    }

    public static int getFactor(int i) {
        if (i == 1) {
            return 1;
        }
        return getFactor(i - 1) * i;
    }


    public static class Sister {
        private boolean Number;

        private boolean isSister(int num) {
            boolean prime = isPrime(num);
            boolean last = Number;
            Number = prime;
            return last && prime;
        }

        private boolean isPrime(int num) {
            int primeNum = 0;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    primeNum++;
                }
            }
            return primeNum == 0;
        }

        public static List<String> getSister() {
            Sister sisters = new Sister();
            List<String> integers = new ArrayList<>();
            for (int i = 100; i <= 1000; i++) {
                if (i % 2 != 0) {
                    boolean sister = sisters.isSister(i);
                    if (sister) {
                        integers.add((i - 2) + "和" + i);
                    }
                }
            }
            return integers;
        }
    }
        public static class Manager {
            List<Double> integerList;
            public Double getMax() {
                Double max = null;
                for (int i = 0; i < integerList.size(); i++) {
                    if (max == null) {
                        max = integerList.get(1);
                    }
                    Double integer = integerList.get(i);
                    if (max < integer) {
                        max = integer;
                    }
                }
                return max;
            }

            public Double getMin() {
                Double min = null;
                for (int i = 0; i < integerList.size(); i++) {
                    if (min == null) {
                        min = integerList.get(1);
                    }
                    Double integer = integerList.get(i);
                    if (min > integer) {
                        min = integer;
                    }
                }
                return min;
            }
            public double getAverage() {
                Double sumNum = 0D;
                for (int i = 0; i < integerList.size(); i++) {
                    Double integer = integerList.get(i);
                    sumNum += integer;
                }
                return sumNum / integerList.size();
            }

            public Manager(List<Double> integerList) {
                this.integerList = integerList;
            }
        }
    public static double getTax(double money) {
        double tax;
        double money2 = money;
        if (money == 0) {
            return 0;
        }
        if (money <= 1500) {
            tax = 0.05;

        } else if (money <= 4500) {
            tax = 0.1;
            money2 -= 1500;
        } else if (money <= 9000) {
            tax = 0.2;
            money2 -= 4500;
        } else if (money <= 35000) {
            tax = 0.25;
            money2 -= 9000;
        } else if (money <= 55000) {
            tax = 0.3;
            money2 -= 35000;
        } else if (money <= 800000) {
            tax = 0.35;
            money2 -= 1500;
        } else {
            tax = 0.45;
            money2 -= 800000;
        }
        return getTax(money - money2) + (money2 * tax);

    }


}