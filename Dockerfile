# Usa una imagen base de Tomcat + JDK 17
FROM tomcat:10.1.13-jdk17

# Elimina la app default de Tomcat
RUN rm -rf /usr/local/tomcat/webapps/*

# Copia tu WAR al directorio webapps de Tomcat
COPY target/Fintrix-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

# Expone el puerto por donde Tomcat servirá la app
EXPOSE 8080

# Comando para iniciar Tomcat
CMD ["catalina.sh", "run"]
