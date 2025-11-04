FROM mcr.microsoft.com/openjdk/jdk:17-ubuntu
COPY PortfolioUsingSpringBoot/target/PortfolioUsingSpringBoot-0.0.1-SNAPSHOT.jar PortfolioUsingSpringBoot-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/PortfolioUsingSpringBoot-0.0.1-SNAPSHOT.jar"]
