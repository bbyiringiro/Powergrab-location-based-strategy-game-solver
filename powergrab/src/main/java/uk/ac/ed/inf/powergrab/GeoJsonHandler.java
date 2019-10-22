package uk.ac.ed.inf.powergrab;
import java.net.URL;
import java.net.MalformedURLException;
import java.net.URLConnection;

import javax.naming.Context;

import java.net.HttpURLConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class GeoJsonHandler{
	
	public GeoJsonHandler() {
//		mapString = mapURL;
	}
	
	public static String readJsonFromURL(String url) throws MalformedURLException, IOException {
		
		InputStream inputStream;
//		try 
//		{
			URL mapUrl = new URL(url);
			HttpURLConnection request = (HttpURLConnection) mapUrl.openConnection();
			request.setReadTimeout(10000); // milliseconds
			request.setConnectTimeout(15000); // milliseconds
			request.setRequestMethod("GET");
			request.setDoInput(true);
			request.connect();
//			try
			inputStream = request.getInputStream();
			JsonParser jp = new JsonParser();
			JsonElement root = jp.parse(new InputStreamReader(inputStream));
			
			String mapSource = root.toString();
			inputStream.close();
//			catch
			
			
			
			return mapSource;
//		}
//		catch(MalformedURLException e) 
//		{
//			
//		}
//		catch (IOException e) {
//			// TODO: handle exception
//		}
//		finally 
//		{
//			
//		}
		
	}
	
	
  
	
	
	
}





//
//// Convert to a JSON object to print data
//JsonParser jp = new JsonParser(); //from gson
//JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
//JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object. 
//String zipcode = rootobj.get("zip_code").getAsString(); //just grab the zipcode





//https://docs.mapbox.com/help/troubleshooting/working-with-large-geojson-data/

//https://docs.mapbox.com/ios/api/maps/3.5.0-beta.2/working-with-geojson-data.html