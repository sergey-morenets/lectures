plugins {
    id("org.springframework.boot") version "2.7.1"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
}

java.sourceCompatibility = JavaVersion.VERSION_18

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-redis")
    implementation("redis.clients:jedis:3.7.1")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    compileOnly("org.projectlombok:lombok:1.18.24")
    annotationProcessor("org.projectlombok:lombok:1.18.24")
}

tasks.withType<Test> {
    useJUnitPlatform()
}