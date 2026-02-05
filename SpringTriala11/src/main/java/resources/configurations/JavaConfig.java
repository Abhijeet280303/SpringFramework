package resources.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.SpringTriala11.JavaConfiguration.CrazyPayment;
import com.SpringTriala11.JavaConfiguration.Payment;

@Configuration
//@ComponentScan("com.SpringTriala11.JavaConfiguration")
public class JavaConfig {
	
	@Bean
	public CrazyPayment crazyPayment() {
	 return new CrazyPayment();
	}
	
	@Bean
	public Payment payment() {
		return new Payment(crazyPayment());
	}

}
