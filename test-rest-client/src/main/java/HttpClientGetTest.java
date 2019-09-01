import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

public class HttpClientGetTest {
	
	@Test
	public void GetTopicsGetsEmptyList()  {
//	public static void main(String[] args) {
		try {
			
			
			/*HttpGet request;
			HttpResponse response;
			BufferedReader rd;
			StringBuffer result;
			String line;
			String url = "http://localhost:8080/topics";*/
			 
			String output = getURL("http://localhost:8080/topics");
			System.out.println(output);

			//getURL("http://localhost:8080/topics/java");
			// getURL("http://localhost:8080/topics/java/courses");

			/**	// get a single topic
			
			
			String url2 = "http://localhost:8080/topics/java";

			//HttpClient client = HttpClientBuilder.create().build();
			 request = new HttpGet(url2);


			 response = client.execute(request);

			System.out.println("Response Code : " 
		                + response.getStatusLine().getStatusCode());

			 rd = new BufferedReader(
				new InputStreamReader(response.getEntity().getContent()));

			 result = new StringBuffer();
			 line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
			
			System.out.println(result.toString());
			
			// create a single course
			
			
			 url2 = "http://localhost:8080/topics/java/courses";

			//HttpClient client = HttpClientBuilder.create().build();
	

			 request = new HttpGet(url2);


			// add request header
			//request.addHeader("User-Agent", USER_AGENT);
			 response = client.execute(request);

			System.out.println("Response Code : " 
		                + response.getStatusLine().getStatusCode());

			 rd = new BufferedReader(
				new InputStreamReader(response.getEntity().getContent()));

			 result = new StringBuffer();
			 line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
			
			System.out.println(result.toString());
			request.releaseConnection();
			*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

private static String getURL(String url) throws IOException, ClientProtocolException {
	

	HttpClient client = HttpClientBuilder.create().build();
	HttpGet request = new HttpGet(url);


	HttpResponse response = client.execute(request);

	System.out.println("Response Code : " 
	            + response.getStatusLine().getStatusCode());

			assertEquals(200, response.getStatusLine().getStatusCode());
	
	BufferedReader rd = new BufferedReader(
		new InputStreamReader(response.getEntity().getContent()));

	StringBuffer result = new StringBuffer();
	String line = "";
	while ((line = rd.readLine()) != null) {
		result.append(line);
	}
	
	System.out.println(result.toString());
	
	return result.toString();
	
}

}
