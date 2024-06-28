package com.example.DemoApplication;

import org.springframework.context.annotation.Conditional;

@Conditional(AdsCondition.class)
public @interface AdsConditionalOnProperty {
}
