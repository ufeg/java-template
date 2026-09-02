# java-template
java native template to avoid starting from scratch

## Technical baseline

- Java 21
- JUnit Jupiter 5.13.4
- AssertJ 3.27.6

```
mvn -N archetype:generate \
    -DgroupId=com.template \
    -DartifactId=java-template \
    -DinteractiveMode=false
```

## Run tests

```sh
mvn test
```
