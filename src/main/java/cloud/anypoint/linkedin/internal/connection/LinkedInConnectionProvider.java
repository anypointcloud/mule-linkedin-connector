package cloud.anypoint.linkedin.internal.connection;

import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.api.connection.ConnectionValidationResult;
import org.mule.runtime.api.connection.PoolingConnectionProvider;
import org.mule.runtime.api.connection.ConnectionProvider;
import org.mule.runtime.api.connection.CachedConnectionProvider;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LinkedInConnectionProvider implements PoolingConnectionProvider<LinkedInConnection> {

  private final Logger LOGGER = LoggerFactory.getLogger(LinkedInConnectionProvider.class);

  @Override
  public LinkedInConnection connect() throws ConnectionException {
      return null;
  }

  @Override
  public void disconnect(LinkedInConnection connection) {
    try {
      connection.invalidate();
    } catch (Exception e) {
      LOGGER.error("Error while disconnecting [" + connection.getId() + "]: " + e.getMessage(), e);
    }
  }

  @Override
  public ConnectionValidationResult validate(LinkedInConnection connection) {
    return ConnectionValidationResult.success();
  }
}
