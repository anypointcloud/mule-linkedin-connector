package cloud.anypoint.linkedin.internal.connection;

import com.echobox.api.linkedin.client.DefaultLinkedInClient;
import com.echobox.api.linkedin.client.LinkedInClient;
import com.echobox.api.linkedin.version.Version;

public final class LinkedInConnection {

    private LinkedInClient client;

    public LinkedInConnection(String id) {
        this.client = new DefaultLinkedInClient(Version.DEFAULT_VERSION);
    }


    public void invalidate() {
      // do something to invalidate this connection!
    }
}
