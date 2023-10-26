## To Run Project 

1. Download PgSQL
    
     You can find a downloadable distribution of pgSQL for
     your OS on http://www.postgresql.org/download/

    Follow the installation and execution instructions for
    your OS on the download website.
    

2. Prepare the database server
   
   To prepare the database server you can use the command line tool
       psql or the GUI tool PgAdmin (http://pgadmin.org/).
```    
       - Create a new database orderdb
       - Create new user with name and password as postgres
       - ALTER DATABASE orderdb OWNER TO postgres;
```

3. Install Project
```
    mvn clean install
```
4. Run Service mix service 
```
{servicemixDir}/bin/servicemix
```

5. Add Feature Repo in service mix console
```
feature:repo-add file:/C:/Users/{userName}/.m2/repository/org/apache/servicemix/examples/features-file/1.0.0/features-file-1.0.0-features.xml
```

6. install the feature 

```
feature:install camel-cxf-mq-feature
```


Useful commands

- To check the feature is existed 

```
feature:list | grep camel-cxf-mq-feature
```

- To uninstall feature

```
feature:uninstall camel-cxf-mq-feature
```

- To display feature dependencies and bundles

```
feature:info camel-cxf-mq-feature
```


## Debugging application 

Debug activated by using the `debug` parameter on the command line.

```
servicemix.bat debug
```
