package com.learnwebservices.tempconverter;

import java.net.MalformedURLException;
import java.net.URL;

import com.learnwebservices.services.tempconverter.CelsiusToFahrenheitRequest;
import com.learnwebservices.services.tempconverter.CelsiusToFahrenheitResponse;
import com.learnwebservices.services.tempconverter.FahrenheitToCelsiusRequest;
import com.learnwebservices.services.tempconverter.FahrenheitToCelsiusResponse;
import com.learnwebservices.services.tempconverter.TempConverterEndpoint;
import com.learnwebservices.services.tempconverter.TempConverterEndpointService;

public class TempConverterMain {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://www.learnwebservices.com/services/tempconverter?wsdl");
		TempConverterEndpointService service = new TempConverterEndpointService(url);
		TempConverterEndpoint port = service.getTempConverterEndpointPort();
		CelsiusToFahrenheitRequest request =
				new CelsiusToFahrenheitRequest();
		request.setTemperatureInCelsius(18);
		System.out.println("REQUEST in Celsius:--->> " + 
				request.getTemperatureInCelsius());
		CelsiusToFahrenheitResponse response = port.celsiusToFahrenheit(request);
		System.out.println("RESPONSE in Fahrenheit:<<----| " + 
				response.getTemperatureInFahrenheit());
		
		System.out.println("-------------------------------");
		
		FahrenheitToCelsiusRequest fahrenheitToCelsiusRequest =
				new FahrenheitToCelsiusRequest();
		fahrenheitToCelsiusRequest.setTemperatureInFahrenheit(451);
		
		System.out.println("REQUEST in Fahrenheit: " + 
				fahrenheitToCelsiusRequest.getTemperatureInFahrenheit());
		FahrenheitToCelsiusResponse fahrenheitToCelsiusResponse = 
				port.fahrenheitToCelsius(fahrenheitToCelsiusRequest);
		
		System.out.println("RESPONSE in Celsius:<<---| " + 
				fahrenheitToCelsiusResponse.getTemperatureInCelsius());
		
		
	}

}
