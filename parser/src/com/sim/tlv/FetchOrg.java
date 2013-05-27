/**
 * 
 */
package com.sim.tlv;

/**
 * @author simsun
 *
 */
@TLV(name="fetch", type=1)
public class FetchOrg {
	
	@TLVField(type=1)
	public int error_code;
	
	@TLVField(type=2)
	public String data;
	
}
