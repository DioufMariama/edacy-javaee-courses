# edacy-javaee-courses
This repo contains sources for JEE training given at Edacy Makersday
# cours-javaEE
Ce référentiel contient des sources pour la formation JEE donnée à Edacy Makersday


# module.xml Mysql driver

```
<?xml version="1.0" encoding="UTF-8"?>
<module xmlns="urn:jboss:module:1.1" name="com.mysql">
    <resources>
        <resource-root path="mysql-connector-java-5.1.45-bin.jar"/>              
    </resources>
    <dependencies>
        <module name="javax.api"/>
        <module name="javax.transaction.api"/>
    </dependencies>
</module>
```

```
<driver name="mysql" module="com.mysql">
                        <driver-class>com.mysql.jdbc.Driver</driver-class>
                    </driver>
```

