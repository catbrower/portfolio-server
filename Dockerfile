FROM tomcat:latest
COPY ./target/portfolio.war /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh", "run"]