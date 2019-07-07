import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

public class HttpClientPostTest {

	public static <NameValuePair> void main(String[] args) {
		try {
			
			
			String url = "http://localhost:8080/topics";

			HttpClient client = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost(url);

			List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
			urlParameters.add((NameValuePair) new BasicNameValuePair("id", "java2"));
			urlParameters.add( (NameValuePair) new BasicNameValuePair("name", "java core name2"));
			urlParameters.add( (NameValuePair) new BasicNameValuePair("description", "Java2 core despcription"));
			
		post.setEntity(new UrlEncodedFormEntity((List<? extends org.apache.http.NameValuePair>) urlParameters));
	

			HttpResponse response = client.execute(post);

			System.out.println("Response Code : " 
		                + response.getStatusLine().getStatusCode());

			BufferedReader rd = new BufferedReader(
				new InputStreamReader(response.getEntity().getContent()));

			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
			
			System.out.println(result.toString());
			post.releaseConnection();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
