package com.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;s
import org.testng.annotations.*;
public class NewTest {
	
	
	@BeforTest
			JSONParser jsonParser= new JSONParser();
			FileReader fileReader = new FileReader("src/Jsonfiles/TeamRCB.json");
		
			//Read Json file
			Object obj = jsonParser.parse(fileReader);
			JSONObject jsonObject = (JSONObject)obj;
			


				
	@Test
			public void GET4ForeignPlayers() throws JSONException {
		
					int counter=0;
      			        
			        for (int i = 0; i < jsonArray.length(); i++) {
			            String country = jsonArray.getJSONObject(i).getString("country");
			            if(!country.equalsIgnoreCase("India"))
			            {
			            	counter++;
			            }
			        }
			        System.out.println("No of Foreign Player"+counter);
			        Assert.assertEquals(countFP,4);
			    }

			@Test
			public void GETWicketKeeper() throws JSONException {

			    JSONObject jsonObject = new JSONObject(jsonDataString);
			    List<String> list = new ArrayList<String>();
			    JSONArray jsonArray = jsonObject.getJSONArray("player");
			    for (int i = 0; i < jsonArray.length(); i++) {
			        String role = jsonArray.getJSONObject(i).getString("role");
			        if(role.equalsIgnoreCase("Wicket-keeper"))
			        {
			            Assert.assertEquals("Wicket-keeper",role);
			            System.out.println("No of Foreign Player"+counter);
			            break;
			        }
			    }
			}
			}