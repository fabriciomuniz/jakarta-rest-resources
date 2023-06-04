## Quarkus: jakarta-rest-resources

Projeto de validação rápida da feature jakarta-rest-resources

Pra executar:
```shell script
./mvnw compile quarkus:dev
```
Chamadas via HTTP Client:
```shell script
GET http://localhost:8080/avengers
Accept: application/hal+json
```

## Objetivo

- Teste de mesa rápido
- Autogeração de API Rest + HAL + Paginação
## Stack

| Ambiente     | Versão/valor                                                |
|--------------| ---------------------------------------------------------------- |
| SO           | Windows 10 |
| Quarkus | 3.1.0.Final |
| Build        | Maven 3.8.8, Kotlin 1.8.21 (Java 17)   |
| DB           | H2 |


## _Documentação gerada originalmente pelo initializer:_

# jakarta-rest-resources

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/jakarta-rest-resources-1.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Related Guides

- REST resources for Hibernate ORM with Panache ([guide](https://quarkus.io/guides/rest-data-panache)): Generate Jakarta
  REST resources for your Hibernate Panache entities and repositories
- JDBC Driver - H2 ([guide](https://quarkus.io/guides/datasource)): Connect to the H2 database via JDBC
- Kotlin ([guide](https://quarkus.io/guides/kotlin)): Write your services in Kotlin

## Provided Code

### RESTEasy JAX-RS

Easily start your RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)
