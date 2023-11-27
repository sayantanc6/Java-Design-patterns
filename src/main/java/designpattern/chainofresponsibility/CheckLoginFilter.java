package designpattern.chainofresponsibility;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class CheckLoginFilter implements FilterChain {
	
	private FilterChain chain;
	private Map<String, String> reqparam;
	private Map<String, String> newreqparam;
	private String username;
	private String password;
	private byte[] array;
	private SecretKey myDesKey;
	private Cipher desCipher;
	
	public CheckLoginFilter() {	}

	@Override
	public void nextInChain(FilterChain chain) {
		this.chain = chain;
	}

	@Override
	public void processRequest(Request request) throws Exception {
		reqparam = request.getMapFromStringUrl();
		if (reqparam.get("username") == null) {
			this.username = getGeneratedRandomUsername();
			newreqparam.put("username", this.username);
		}
		
		if (reqparam.get("password") == null) {
			this.password = getGeneratedRandomEncryptedPassword();
			newreqparam.put("password", this.password);
		}
		
		if(reqparam.get("password") != null){
			reqparam.remove("password");
			this.password = getGeneratedRandomEncryptedPassword();
			newreqparam.put("password", this.password);
		}
		 
		request.addRequestParams(newreqparam);
		System.out.println("system generated credentials added : "+this.username+"/"+this.password);
		chain.processRequest(request);
	}

	private String getGeneratedRandomEncryptedPassword() throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException {
		array = new byte[10];
		new Random().nextBytes(array);
		this.password = new String(array, Charset.forName("UTF-8"));
		return encryptedPassword(this.password);
	} 

	private String encryptedPassword(String password2) throws NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		KeyGenerator.getInstance("DES");
		this.desCipher = Cipher.getInstance("DES");
		byte[] text = password2.getBytes("UTF8");
		desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
        byte[] textEncrypted = desCipher.doFinal(text);
		return Arrays.toString(textEncrypted); 
	}

	private String getGeneratedRandomUsername() {
		array = new byte[10];
		new Random().nextBytes(array);
		this.username = new String(array, Charset.forName("UTF-8"));
		return this.username;
	}
}
