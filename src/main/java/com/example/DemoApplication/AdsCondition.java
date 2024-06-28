package com.example.DemoApplication;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class AdsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // Check if the property "key" is set to "value"
        String property = context.getEnvironment().getProperty("pitapuram gari MLA");
        return "deputy CM".equals(property);
    }
}
