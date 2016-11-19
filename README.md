Spring Boot Swagger Demo
=========================

Building the Application
---------------------
    $ git clone https://github.com/buraksarp/dynamodb-app.git
    $ cd dynamodb-app
    $ mvn clean install

This demo assumes you know how to run Docker.

Building the Container
----------------------
Nothing special if you already have Docker installed:

    $ docker build -t spring-boot/dynamodb .

Running the Container
---------------------
To run this container:

    $ docker run -ti spring-boot/dynamodb


