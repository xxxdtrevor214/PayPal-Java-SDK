FROM  openjdk:8

MAINTAINER Braintree Developer Experience "team-dx@getbraintree.com"

RUN wget -q https://services.gradle.org/distributions/gradle-3.3-bin.zip \
      && unzip gradle-3.3-bin.zip -d /opt \
      && rm gradle-3.3-bin.zip
ENV GRADLE_HOME /opt/gradle-3.3
ENV PATH $PATH:/opt/gradle-3.3/bin

COPY . /java-paypal-sdk
WORKDIR /java-paypal-sdk

ENTRYPOINT ["gradle"]
CMD ["clean", "test"]
