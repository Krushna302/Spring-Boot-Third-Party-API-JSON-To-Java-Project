package Com.Example.Demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import Com.Example.Demo.Model.WeatherData;

@RestController
public class WeatherController {
	
	
	
	@Autowired
	private RestTemplate arestTemplate;
	
	
	@Value("${apiKey}")
	private String apiKey;
	
	
	@GetMapping(value="/weather/getLocation/{lname}")
	public ResponseEntity< WeatherData> getDataThiradPartyUsingLocationApi(@PathVariable String lname){
		
		System.out.println("Check lname  :-"+lname +" "+apiKey);

		
		// getForbject direct provide object
		WeatherData wdata = arestTemplate.getForObject("https://api.tomorrow.io/v4/weather/history/recent?location="+lname+"&apikey="+apiKey, WeatherData.class);
		
		return new ResponseEntity<WeatherData>(wdata, HttpStatus.OK);
		
	}
	
	

}
