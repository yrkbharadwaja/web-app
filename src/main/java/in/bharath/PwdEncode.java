package in.bharath;

import pwd_utils.Pwd_Encoder;

public class PwdEncode {

	public static void main(String[] args) {
		// TODO: implementing shared libraries concept 

		Pwd_Encoder pe = new Pwd_Encoder();
		
		String encode = pe.encoder("in.bharathYT");
		
		System.out.println(encode);
		
	}
}