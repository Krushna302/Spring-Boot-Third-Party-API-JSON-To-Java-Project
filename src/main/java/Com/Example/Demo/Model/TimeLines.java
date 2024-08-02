package Com.Example.Demo.Model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TimeLines {
	
	public List <Hourly> hourly = new ArrayList<Hourly>();
    public List<Daily> daily = new ArrayList<Daily>();

	
	
	
	
	
	

}
