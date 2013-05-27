/**
 * 
 */
package com.sim.tlv;

/**
 * @author simsun
 *
 */
public class TlvException extends Exception {
	public TlvException() {
        super();
    }

    public TlvException(String message) {
        super(message);
    }

    public TlvException(String message, Throwable cause) {
        super(message, cause);
    }

    public TlvException(Throwable cause) {
        super(cause);
    }

}
