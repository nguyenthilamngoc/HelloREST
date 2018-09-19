import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;


@Path("hello")
public class HelloService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Operation(summary = "Welcome greet", description = "This can only be done by the logged in user.")
	@ApiResponse(responseCode = "200", description = "user deteled")
	@ApiResponse(responseCode = "400", description = "Invalid username supplied")
	@ApiResponse(responseCode = "404", description = "User not found")
	public String sayHello() {
		return "Hello My Dear World!!!";
	}
}
