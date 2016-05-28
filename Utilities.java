package prg1203.assignment;

import java.math.BigInteger;
import java.security.SecureRandom;

public class Utilities {
	
	// Random String Generator
	public final class SessionIdentiferGenerator {
		private SecureRandom random = new SecureRandom();
		
		public String nextSessionId() {
			return new BigInteger(130, random).toString(32);
		}
	}

}
