this project demonstrates how you would build your own
jar with third party dependencies, that 
later can be used as external lib in other projects

code from here:
https://mkyong.com/gradle/gradle-create-a-jar-file-with-dependencies/

## how to build

```bash
./gradlew clean
./gradlew fatJar
```

then you will get your `.jar` in `./build/libs/gradle-jar-test-log-1.0.jar`

## how to run (after build)

```bash
java -jar ./build/libs/gradle-jar-test-log-1.0.jar
```

### use as external lib in other project

you can use this `gradle-jar-test-log-1.0.jar` as a dependency in
other projects