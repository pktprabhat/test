package test;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	private static Scanner s;

	public static void main (String[] args) {
		s = new Scanner(System.in);
		
		    long n=s.nextLong();
		    long m=s.nextLong();
		    long k=s.nextLong();
		    long tot=0,rem=k;
		    while(rem>0){
		        if(n>rem){
		            tot+=k;
		            break;
		        }
		        else
		        {
		            tot+=n;
		            tot-=m;
		            rem-=(m-n);
		        }
		    }
		    System.out.println(tot);
		}
	}