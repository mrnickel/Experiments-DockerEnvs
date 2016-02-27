FROM java:8

ENV TEST_ENV_ITEM="this is my stuff"
COPY target/experimentsdockerenv-1.0-SNAPSHOT-jar-with-dependencies.jar /usr/local/sbin/experimentsdocker.jar
WORKDIR /usr/local/sbin/
CMD java -jar experimentsdocker.jar