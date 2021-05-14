name := "ScalaTest"

version := "0.1"

scalaVersion := "2.13.4"

libraryDependencies += "org.scala-lang.modules" %% "scala-parallel-collections" % "0.2.0"
libraryDependencies += "dev.zio" %% "zio" % "1.0.4-2"
libraryDependencies += "dev.zio" %% "zio-streams" % "1.0.2"
libraryDependencies += "dev.zio" %% "zio-kafka"   % "0.14.0"

libraryDependencies += "org.typelevel" %% "cats-effect" % "3.1.0"

// https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt-api
libraryDependencies += "io.jsonwebtoken" % "jjwt-api" % "0.10.5"

// https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt-impl
libraryDependencies += "io.jsonwebtoken" % "jjwt-impl" % "0.10.5" % "runtime"

libraryDependencies += "io.jsonwebtoken" % "jjwt-jackson" % "0.10.5" % "runtime"

// // https://mvnrepository.com/artifact/org.slf4j/slf4j-log4j12
// libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.5.11"

// https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind
libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.12.3"

// https://mvnrepository.com/artifact/dev.zio/zio-test
libraryDependencies += "dev.zio" %% "zio-test" % "1.0.7" % Test

// https://mvnrepository.com/artifact/dev.zio/zio-logging
libraryDependencies += "dev.zio" %% "zio-logging" % "0.5.8"

libraryDependencies += "com.github.ghostdogpr" %% "caliban" % "0.9.5"



