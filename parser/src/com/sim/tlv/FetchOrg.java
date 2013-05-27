/**
 * 
 */
package com.sim.tlv;

import java.util.ArrayList;

/**
 * @author simsun
 *
 */
@TLV(name="fetch", type=1, type_len=2)
public class FetchOrg {
	
	@TLVField(type=1, l_len=2)
	public int error_code;
	
	@TLVField(type=2, l_len=2)
	public String data;
	
	@TLVField(type = 3, l_len=2)
	public ArrayList<Integer> uinList;
}
