Usage
-----

Clone this project and run following command to generate the test coverage report.

	gradle clean build cobertura

There are two identical Calculator.java implementations under following packages except only one change. That is one RandomNumberGenerator.java is having final method and other is having non final method.

	net.saliman.gradle.cobertura.plugin.issue.RandomNumberGenerator.java

	public final double randomNumber() {
        	return Math.random();
    	}


	
	net.saliman.gradle.cobertura.plugin.noissue.RandomNumberGenerator.java

	public double randomNumber() {
        	return Math.random();
    	}

We have to use powermock in order to mock the final method. When we do this everything works fine. Tests are successfully passing. **But Cobertura test coverage report does not show the coverage for the test with powermock**. 


	Coverage report is available under
	
	build-> reports -> cobertura	
	
	
	-- Text from Rohan
	
	-- Text from Rohan 2
