package com.sim.tlv;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class TestAnnotationParser {
	public void parser(Class<?> clazz) throws Exception  {
//		Field[] fields = clazz.getFields();
		Field[] fields = clazz.getDeclaredFields();
		int pass = 0;
		int fail = 0;
		for (Field field : fields) {
			Annotation[] ats = field.getDeclaredAnnotations();
			System.out.println("class:" + field.getGenericType().toString());
			for (Annotation at : ats) {
				TLVField mat = (TLVField) at;				
				System.out.println("type:" + mat.type());
			}
		}
		
	}
}
