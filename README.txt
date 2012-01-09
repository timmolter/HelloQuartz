About
-----

HelloQuartz demonstrates how to integrate the Quartz scheduler into a Java Web Application. Read more at the website:

  http://xeiam.com/

Features
-----

* jobs.xml file defining a single job and cron trigger
* quartz.properties file
* RAMJobStore
* web.xml file that initializes Quartz

Installation
------------

Should build right out the box. Edit the 'tomcat.dir' parameter in build.properties to reflect the correct location of your web container on your local machine. Run the 'deploy_local' Ant task. View the web application with the following URL (assuming that you're running the web container on port 8080): http://localhost:8080/HelloQuartz/

Tested with Tomcat 7. 