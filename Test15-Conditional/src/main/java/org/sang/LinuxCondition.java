package org.sang;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by sang on 16-12-14.
 */
public class LinuxCondition implements Condition {
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
    	String property = conditionContext.getEnvironment().getProperty("os.name");
    	System.out.println(property);
        return conditionContext.getEnvironment().getProperty("os.name").contains("Linux") || conditionContext.getEnvironment().getProperty("os.name").contains("OS");
    }
}
