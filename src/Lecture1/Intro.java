package Lecture1;

import java.util.ArrayList;
import java.util.Collections;

public class Intro {

	public static void main(String[] args) {

		
		String str = "12" ;
		String arr = "34" ;
		/*
		 * if(str.equals(arr)) { System.out.println("true"); }else {
		 * System.out.println("false"); }
		 */
		
		if(str == arr) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

	public static String get(String cc) {

		if (cc == "1") {
			return "a";
		} else if (cc == "2") {
			return "b";
		} else if (cc == "3") {
			return "c";
		} else if (cc == "4") {
			return "d";
		} else if (cc == "5") {
			return "e";
		} else if (cc == "6") {
			return "f";
		} else if (cc == "7") {
			return "g";
		} else if (cc == "8") {
			return "h";
		} else if (cc == "9") {
			return "i";
		} else if (cc == "10") {
			return "j";
		} else if (cc == "11") {
			return "k";
		} else if (cc == "12") {
			return "l";
		} else if (cc == "13") {
			return "m";
		} else if (cc == "14") {
			return "n";
		} else if (cc == "15") {
			return "o";
		} else if (cc == "16") {
			return "p";
		} else if (cc == "17") {
			return "q";
		} else if (cc == "18") {
			return "r";
		} else if (cc == "19") {
			return "s";
		} else if (cc == "20") {
			return "t";
		} else if (cc == "21") {
			return "u";
		} else if (cc == "22") {
			return "v";
		} else if (cc == "23") {
			return "w";
		} else if (cc == "24") {
			return "x";
		} else if (cc == "25") {
			return "y";
		} else if (cc == "26") {
			return "z";
		}
		return "0";
	}

	public static int cti(char cc) {

		if (cc == 'a') {
			return 1;
		} else if (cc == 'b') {
			return 2;
		} else if (cc == 'c') {
			return 3;
		} else if (cc == 'd') {
			return 4;
		} else if (cc == 'e') {
			return 5;
		} else if (cc == 'f') {
			return 6;
		} else if (cc == 'g') {
			return 7;
		} else if (cc == 'h') {
			return 8;
		} else if (cc == 'i') {
			return 9;
		} else if (cc == 'j') {
			return 10;
		} else if (cc == 'k') {
			return 11;
		} else if (cc == 'l') {
			return 12;
		} else if (cc == 'm') {
			return 13;
		} else if (cc == 'n') {
			return 14;
		} else if (cc == 'o') {
			return 15;
		} else if (cc == 'p') {
			return 16;
		} else if (cc == 'q') {
			return 17;
		} else if (cc == 'r') {
			return 18;
		} else if (cc == 's') {
			return 19;
		} else if (cc == 't') {
			return 20;
		} else if (cc == 'u') {
			return 21;
		} else if (cc == 'v') {
			return 22;
		} else if (cc == 'w') {
			return 23;
		} else if (cc == 'x') {
			return 24;
		} else if (cc == 'y') {
			return 25;
		} else if (cc == 'z') {
			return 26;
		}
		return 0;

	}

}
