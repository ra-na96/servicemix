## To Run Project 

1. Install Project
```
    mvn clean install
```
2. Run Service mix service 
```
{servicemixDir}/bin/servicemix
```

3. Add Feature Repo in service mix console
```
feature:repo-add file:/C:/Users/{userName}/.m2/repository/org/apache/servicemix/examples/features-file/1.0.0/features-file-1.0.0-features.xml
```

4. install the feature 

```
feature:install camel-cxf-mq-feature
```


Useful commands

- To check the feature is exist 

```
feature:list | grep camel-cxf-mq-feature
```

- To uninstall feature

```
feature:install camel-cxf-mq-feature
```


## Debugging application 

Debug activated by using the `debug` parameter on the command line.

```
servicemix.bat debug
```