package com.sim.tlv;

public class demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestAnnotationParser parser = new TestAnnotationParser();
		try {
			parser.parser(FetchOrg.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
