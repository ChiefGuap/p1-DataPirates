package com.example.sping_portfolio.controllers;

import java.util.*;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    public double computeBonusThreshold() {
      int total = itemsSold[0];
      int min = itemsSold[0];
      int max = itemsSold[0];
      for(int i = 1; i < itemsSold.length; i++) {
      total += itemsSold[i];
      if(itemsSold[i] < min) {
      min = itemsSold[i];
      }
      if(itemsSold[i] > max) {
      max = itemsSold[i];
      }
      }
      return (total - min - max) / (double)(itemsSold.length-2);
      }

      
      public void computeWages(double fixedWage, double perItemWage) {
        double threshold = computeBonusThreshold();
        for(int i = 0; i < itemsSold.length; i++) {
        double baseWage = fixedWage + perItemWage * itemsSold[i];
        if(itemsSold[i] > threshold) {
        wages[i] = baseWage * 1.1;
        }
        else {
        wages[i] = baseWage;
        }
        }
        }
  }