## Problem

Entity relation is not saving correctly: foreign key (phone.person_id) is not saved

### How to reproduce

#### JUnit Test

    ./gradlew test

#### Running application

    ./gradlew -xtest build && docker-compose up --build
    curl localhost:8080/save