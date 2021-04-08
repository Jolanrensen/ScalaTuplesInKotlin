import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
//    scala // not used here
    java
    kotlin("jvm") version "1.4.32"
    application

    `maven-publish`
    `java-library`
}

group = "nl.jolanrensen.scalaTuplesInKotlin"
version = "alpha03-scala2.13.5"

java {
    withJavadocJar()
    withSourcesJar()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "nl.jolanrensen.scala-tuples-in-kotlin"
            artifactId = "scala-tuples-in-kotlin"
            version = "1.0-SNAPSHOT"

            from(components["java"])
        }
    }
}

repositories {
//    mavenLocal()
    mavenCentral()
    jcenter()
    maven(url= "https://jitpack.io")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))
    testImplementation("junit", "junit", "4.12")

//    implementation("org.scala-lang:scala-library:2.13.3") // <4>
//    implementation("org.scala-lang:scala-reflect:2.13.3")
    implementation("org.scala-lang:scala-library:2.13.5") // <4>
    implementation("org.scala-lang:scala-reflect:2.13.5")

//    implementation("org.jetbrains.kotlinx.spark:kotlin-spark-api-3.0:1.0.0-preview3-SNAPSHOT")

//    implementation("com.github.Jolanrensen:kotlin-spark-api:master-SNAPSHOT")

//    implementation("org.apache.spark:spark-sql_2.12:3.0.0")
//    implementation("org.apache.spark:spark-core_2.12:3.0.0")
//    implementation("org.apache.spark:spark-streaming_2.12:3.0.0")



}


val compileKotlin: KotlinCompile by tasks

compileKotlin.kotlinOptions {
    freeCompilerArgs = listOf("-Xinline-classes", "-Xopt-in=org.mylibrary.OptInAnnotation")
    jvmTarget = "1.8"
    useIR = true
}