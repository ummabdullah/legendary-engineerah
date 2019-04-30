import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class HttpClientQuranGetTest2 {
	
//	@Test
//	public void GetTopicsGetsEmptyList()  {
	public static void main(String[] args) {
		try {
			
			
			String url = "http://api.alquran.cloud/v1/page/1/quran-uthmani";
			

			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(url);


			HttpResponse response = client.execute(request);

			System.out.println("Response Code : " 
		                + response.getStatusLine().getStatusCode());

//			assertEquals(200, response.getStatusLine().getStatusCode()));
			
			BufferedReader rd = new BufferedReader(
				new InputStreamReader(response.getEntity().getContent()));

			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
				System.out.println(line);
			}
				
			System.out.println(result.toString());
			request.releaseConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
