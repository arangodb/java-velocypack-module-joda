
![ArangoDB-Logo](https://docs.arangodb.com/assets/arangodb_logo_2016_inverted.png)

# ArangoDB VelocyPack Java Module Joda-Time

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.arangodb/velocypack-module-joda/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.arangodb/velocypack-module-joda)

Joda-Time module for [Java VelocyPack](https://github.com/arangodb/java-velocypack).

Added support for:
* org.joda.time.DateTime;
* org.joda.time.Instant;
* org.joda.time.LocalDate;
* org.joda.time.LocalDateTime;


## Maven

To add the dependency to your project with maven, add the following code to your pom.xml:

```XML
<dependencies>
  <dependency>
    <groupId>com.arangodb</groupId>
    <artifactId>velocypack-module-joda</artifactId>
    <version>1.0.0</version>
  </dependency>
</dependencies>
```

If you want to test with a snapshot version (e.g. 1.0.0-SNAPSHOT), add the staging repository of oss.sonatype.org to your pom.xml:

```XML
<repositories>
  <repository>
    <id>arangodb-snapshots</id>
    <url>https://oss.sonatype.org/content/groups/staging</url>
  </repository>
</repositories>
```

## Compile

```
mvn clean install -DskipTests=true -Dgpg.skip=true -Dmaven.javadoc.skip=true -B
```

## Usage / registering module

``` Java
VPack vpack = new VPack.Builder().registerModule(new VPackJodaModule()).build();
``` 