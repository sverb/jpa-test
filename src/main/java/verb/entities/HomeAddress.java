package verb.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "home")
public class HomeAddress extends Address{

	
	
	
	
}
