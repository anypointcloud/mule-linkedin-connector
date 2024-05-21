package cloud.anypoint.linkedin.internal;

import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;

@Xml(prefix = "linkedin")
@Extension(name = "LinkedIn")
@Configurations(LinkedInConfiguration.class)
public class LinkedInExtension {

}
