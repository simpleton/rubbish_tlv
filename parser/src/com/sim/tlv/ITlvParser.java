/**
 * 
 */
package com.sim.tlv;

import java.nio.ByteBuffer;
import java.util.BitSet;

/**
 * @author simsun
 *
 */
public interface ITlvParser {
	Object parser(ByteBuffer bb) throws TlvException;
	
}
