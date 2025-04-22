plugins {
    kotlin("jvm") version "1.9.0"  // ← Kotlin 플러그인 추가
    application
}

repositories {
    mavenCentral()
}

dependencies {
    // PostgreSQL JDBC 드라이버
    implementation("io.github.cdimascio:dotenv-kotlin:6.4.1")
    implementation("org.postgresql:postgresql:42.7.1")

    // Kotlin 표준 라이브러리
    implementation(kotlin("stdlib"))

    // (선택) 테스트용
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.junit.jupiter:junit-jupiter")
}

application {
    // Main 클래스가 있는 위치 (예: src/main/kotlin/Main.kt)
    mainClass.set("MainKt")
}

tasks.test {
    useJUnitPlatform()
}