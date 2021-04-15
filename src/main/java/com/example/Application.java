package com.example;

import java.util.Map;

public class Application {
    public static ApplicationContext run(String packageToScan, Map<Class, Class> ifc2ImplClass) {
        JavaConfig config = new JavaConfig(packageToScan, ifc2ImplClass);
        ApplicationContext context = new ApplicationContext(config);
        ObjectFactory objectFactory = new ObjectFactory(context);

        // TODO: init all singletons that are not lazy

        context.setFactory(objectFactory);
        return context;
    }
}
