#网易镜像中心的Java
FROM java:8
VOLUME /tmp
#自己项目Jar包的路径,eurrka.jar可以自定义
ADD  dousnl-docker-eureka.jar  eureka.jar
#RUN bash -c 'touch /eureka.jar'
#ENV JAVA_OPTS=""
#端口
EXPOSE 8050
#运行Jar
ENTRYPOINT ["java", "-jar", "/eureka.jar"]
