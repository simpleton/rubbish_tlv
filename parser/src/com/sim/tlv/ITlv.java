/**
 * 
 */
package com.sim.tlv;

import java.nio.ByteBuffer;

/**
 * @author simsun
 *
 */
public interface ITlv {
	/**
     * Header length in bytes.
     */
    public static final int HEADER_LENGTH = 4;

    /**
     * Calculate and return TLV bytes.
     *
     * @return  tlv bytes
     * @throws TlvException TLV contains wrong values
     */
    public ByteBuffer buffer() throws TlvException;

    /**
     * The Tag field is used to uniquely identify the particular optional
     * parameter in question.<br>
     * <p/>
     * The optional parameter Tag field is always 2 octets in length.
     *
     * @return tag id
     */
    public int getTag();

    /**
     * Return TLV value bytes.
     *
     * @return  value bytes
     */
    public byte[] getValue();

    /**
     * Set TLV value in bytes.
     *
     * @param valueBytes value bytes
     */
    public void setValue(byte[] valueBytes);

}
