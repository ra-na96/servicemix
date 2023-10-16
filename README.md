# servicemix

These are examples from the service mix library but with some changes in camel-cxf-rest.
Each project has the README file for the steps to install the bundle and start the project.
Here are some problems I faced trying to modify and run the project.

1 - Error: activemq username can't be null or invalid password 
    Fix: maybe try to restart servicemix first then add the following in <SEERVICEMIX_HOME>/etc/activemq.xml file 
    
     <simpleAuthenticationPlugin> 
				<users>
				<authenticationUser username="smx" password="smx" groups="users,admins"/>
				</users>
			</simpleAuthenticationPlugin>

2 - To use a DTO as a message for activemq we need to add it in a trusted package or else it will throw an exception and won't be able to marshall\unmarshall it, to add activemq trusted package go to <SEERVICEMIX_HOME>/etc/system.properties file and add 

    org.apache.activemq.SERIALIZABLE_PACKAGES=*

3 - To start the postgres sql module, add postgresql-42.6.0.jar in <SEERVICEMIX_HOME>/lib/ext for the module to find sql driver
