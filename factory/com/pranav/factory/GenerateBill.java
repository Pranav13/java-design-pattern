package com.pranav.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

    public static void main(String[] args)throws IOException {
         System.out.print("Enter the name of plan for which the bill will be generated: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String planName=br.readLine();
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units=Integer.parseInt(br.readLine());
        double rate=0;

        if("DOMESTICPLAN".equalsIgnoreCase(planName)){
            rate=3.50;
        }else if("COMMERCIALPLAN".equalsIgnoreCase(planName)){
            rate=7.50;
        }else if("INSTITUTIONALPLAN".equalsIgnoreCase(planName)){
            rate=5.50;
        }
        calculateBill(units,rate);
        /*GetPlanFactory planFactory = new GetPlanFactory();

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String planName=br.readLine();
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units=Integer.parseInt(br.readLine());

        Plan p = planFactory.getPlan(planName);


        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
        p.getRate();
        p.calculateBill(units);*/
        
    }
    
     public static void calculateBill(int units,double rate){
        System.out.println(units*rate);
    }
}

