package com.epam.javacc.microservices.controller;

import com.netflix.config.DynamicPropertyFactory;
import com.netflix.config.DynamicStringProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

    @GetMapping("/property-from-dynamic-management")
    public String getPropertyValue() {
        return propertyOneWithDynamic.getName() + ": " + propertyOneWithDynamic.get();
    }

    private DynamicStringProperty propertyOneWithDynamic
            = DynamicPropertyFactory.getInstance()
            .getStringProperty("archaius.properties.one", "not found!");
}
