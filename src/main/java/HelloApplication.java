import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import io.swagger.v3.jaxrs2.integration.resources.AcceptHeaderOpenApiResource;
import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;


@ApplicationPath("")
public class HelloApplication extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = Stream
				.of(HelloService.class,  OpenApiResource.class, AcceptHeaderOpenApiResource.class)
				.collect(Collectors.toSet());
		return resources;
	}
}