package com.sim.tlv;

import java.util.BitSet;

public class demo {
	char[] input = {1, 0, 4, 0, 0, 0, 0,
					2, 0, 3, 's', 'i', 'm',
					3, 0, 8, 0 , 0, 0 ,2 , 0 , 1, 0, 3};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char a;
		TestAnnotationParser parser = new TestAnnotationParser();
		try {
			parser.parser(FetchOrg.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
