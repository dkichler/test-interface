name := "test-interface"

organization := "org.scala-sbt"

version := "2.0"

description := "Uniform test interface to Scala/Java test frameworks (specs, ScalaCheck, ScalaTest, JUnit and other)"

scalaVersion := "2.11.11"

// disable using the Scala version in output paths and artifacts
crossPaths := false

autoScalaLibrary := false

resolvers ++= Seq("releases" at "http://oss.sonatype.org/content/repositories/releases",
                  "snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
                  "localmaven" at "file://"+Path.userHome+"/.m2/repository")

//publishTo <<= version { v: String =>
//  val nexus = "https://oss.sonatype.org/"
//  if (v.trim.endsWith("SNAPSHOT")) Some("publish-snapshots" at nexus + "content/repositories/snapshots")
//  else                             Some("publish-releases" at nexus + "service/local/staging/deploy/maven2")
//}

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.8"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra := (
  <url>http://www.scala-sbt.org</url>
  <licenses>
    <license>
      <name>BSD</name>
      <url>https://github.com/sbt/test-interface/blob/master/LICENSE</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>https://github.com/sbt/test-interface</url>
  </scm>
  <developers>
    <developer>
      <id>harrah</id>
      <name>Mark Harrah</name>
    </developer>
    <developer>
      <id>josh</id>
      <name>Josh Cough</name>
    </developer>
    <developer>
      <id>bill</id>
      <name>Bill Venners</name>
    </developer>
    <developer>
      <id>cheeseng</id>
      <name>Chua Chee Seng</name>
    </developer>
  </developers>
)
