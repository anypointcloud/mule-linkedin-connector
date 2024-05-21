package cloud.anypoint.linkedin.internal;

import cloud.anypoint.linkedin.internal.connection.LinkedInConnectionProvider;
import cloud.anypoint.linkedin.internal.operation.LinkedInOperations;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.param.Parameter;

@Operations(LinkedInOperations.class)
@ConnectionProviders(LinkedInConnectionProvider.class)
public class LinkedInConfiguration {

}
