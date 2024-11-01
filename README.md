# Java 17 Features Overview

Java 17, as a Long-Term Support (LTS) release, introduces a range of features that enhance language expressiveness, performance, and security. This document provides a quick syntax reference for key features.

---

## 1. Sealed Classes (JEP 409)

Sealed classes allow control over which classes can extend or implement them.

```java
public sealed class Shape permits Circle, Square {}
public final class Circle extends Shape {}
public final class Square extends Shape {}
```

---

## 2. Enhanced `switch` Expressions

Switch expressions in Java 17 allow returning values directly, supporting cleaner and more expressive code.

```java
int numLetters = switch (day) {
    case MONDAY, FRIDAY, SUNDAY -> 6;
    case TUESDAY -> 7;
    default -> day.toString().length();
};
```

---

## 3. Enhanced Pseudo-Random Number Generators (JEP 356)

Java 17 provides new interfaces for random number generation, allowing flexible random number streams.

```java
RandomGenerator generator = RandomGeneratorFactory.of("Xoshiro256PlusPlus").create();
int randomInt = generator.nextInt(100);
generator.ints(5, 1, 10).forEach(System.out::println);
```

---

## 4. Removal of Deprecated APIs

Certain outdated APIs have been removed in Java 17 for cleaner, more maintainable code, including:
- `java.security.acl` package
- `java.rmi.activation`
- The Applet API

---

## 5. Text Blocks (JEP 378)

Text blocks allow for multi-line string literals with cleaner syntax and formatting.

```java
String json = """
    {
        "name": "Alice",
        "age": 30,
        "city": "New York"
    }
    """;
```

---

## 6. New macOS Rendering Pipeline (JEP 382)

Java 17 introduces a new rendering pipeline for macOS based on Apple’s Metal API, which replaces the deprecated OpenGL pipeline and improves graphical performance.

---

## 7. Strong Encapsulation of JDK Internals (JEP 403)

Java 17 enforces strong encapsulation of JDK internals by default, restricting access to internal APIs and modules. Access to internal APIs now requires explicit module exports or JVM flags, which improves security.

```sh
# Explicitly export JDK internals
--add-exports java.base/sun.nio.ch=ALL-UNNAMED
```

---

## 8. Context-Specific Deserialization Filters (JEP 415)

New deserialization filters provide control over what types of objects are allowed to be deserialized, increasing security.

```java
ObjectInputFilter filter = info -> info.serialClass() == AllowedClass.class 
    ? ObjectInputFilter.Status.ALLOWED 
    : ObjectInputFilter.Status.REJECTED;
ObjectInputStream ois = new ObjectInputStream(inputStream);
ois.setObjectInputFilter(filter);
```

---

## 9. Improved Garbage Collection

Java 17 includes performance and latency improvements to garbage collectors, including G1 and ZGC.

```sh
# Use ZGC with Java 17
java -XX:+UseZGC -Xmx4g MyApp
```

--- 

## 10. Performance Improvements

Java 17 includes various performance improvements, including enhanced start-up time, reduced memory overhead, and better CPU utilization across libraries and frameworks.

--- 

## Additional Notes

Java 17’s LTS status makes it a stable choice for long-term projects, backed by continued support and updates for several years.
