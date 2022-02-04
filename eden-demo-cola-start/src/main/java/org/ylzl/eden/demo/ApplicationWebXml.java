package org.ylzl.eden.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.ylzl.eden.spring.framework.core.util.SpringProfileUtils;

/**
 * J2EE 加载器
 *
 * @author gyl
 * @since 2.4.x
 */
public class ApplicationWebXml extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		SpringProfileUtils.addDefaultProfile(builder.application());
		return builder.sources(Application.class);
	}
}