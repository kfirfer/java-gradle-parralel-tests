./mvnw -T 10 surefire:test



./gradlew clean test -PmaxParallelForks=10 -Djunit.jupiter.execution.parallel.enabled=true