package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Milan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] a=new int[1];
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(3);
		al.add(1);
		al.add(2);
		int school[]= new int[al.size()];
		int temp=0;*/
		int temp=0;
		int school[]= new int[schoolSeatsArray.size()];
		for(int i:schoolSeatsArray)
			school[temp++]=i;
		//al.toArray();
		temp=0;
		int[] score= new int[studentScoreArray.size()];
		for(int i:studentScoreArray)
			score[temp++]=i;
		temp=0;
		int[][] pref= new int[studentSchoolPreferencesArray.size()][studentSchoolPreferencesArray.size()];
		for(int i:studentSchoolPreferencesArray) {
			for(int j:i) {
			score[temp2++]=i;}
			temp++;
		}
		for(int i=0;i<score.length;++i) {
			int curr=fmax(score);
			boolean collegegive=false;
			for(int j=0;j<pref[curr].length;++j) {
				if(collegegive==true) break;
				if(school[j]>0) {
					school[j]--;
					collegegive=true;
					score[curr]=0;
				}
			}
		}
		int seatrem=0;
		int sturem=0;
		for(int i=0;i<school.length;++i) {
			if(school[i]>0)
				seatrem+=school[i];
		}
		for(int i=0;i<score.length;++i) {
			if(score[i]>0)
				sturem++;
		}
		System.out.println(seatrem+" "+sturem);
	}
	public static int fmax(int[] arr) {
		int max=arr[0];
		int r=0;
		for(int i=1;i<arr.length;++i) {
			if(arr[i]>max)
				r=i;
		}
		return r;
	}

}
