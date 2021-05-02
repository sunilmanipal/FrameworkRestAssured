package Test;

import java.io.IOException;

import org.testng.annotations.Test;

import Project.Restcalls;
import Utlity.URL;
import Utlity.payloadconvertor;
import io.restassured.response.Response;

public class TestAPI {
	
	Response response;
	
	@Test
	public void signup() throws IOException
	{
		String signuppayload = payloadconvertor.generatepayloadString("signup.json");
		
		String endpointURI = URL.getEndpoint("/user/signup");
		
		response = Restcalls.PostRequest(endpointURI, signuppayload);
		
		String strresponse = response.getBody().asString();
		System.out.println(strresponse);
	}

}
