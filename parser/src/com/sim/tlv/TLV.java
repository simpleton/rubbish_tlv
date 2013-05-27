/**
 * 
 */
package com.sim.tlv;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author simsun
 *
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TLV {
	String name() default"";
	int type() default 0;
	int type_len() default 2;
}
