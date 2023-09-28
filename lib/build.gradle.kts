plugins { `java-library` }

java { toolchain { languageVersion.set(JavaLanguageVersion.of(17)) } }

repositories { mavenCentral() }

dependencies { testImplementation("org.junit.jupiter:junit-jupiter:5.9.1") }

tasks.withType<JavaCompile>().configureEach { options.encoding = "UTF-8" }

tasks.named<Test>("test") { useJUnitPlatform() }
