FROM openjdk:11
COPY . /app
WORKDIR /app
RUN javac src/test/java/com/selenium_automation/utils/Dummy.java
CMD java -classpath src/test/java com.selenium_automation.utils.Dummy