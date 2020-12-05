name := "flink-adt"

version := "0.3.0-M1"

scalaVersion := "2.12.10"

organization := "io.findify"
licenses := Seq("MIT" -> url("https://opensource.org/licenses/MIT"))
homepage := Some(url("https://github.com/findify/flink-adt"))

publishMavenStyle := true
bintrayOrganization := Some("findify")

bintrayVcsUrl := Some("git@github.com:findify/flink-adt.git")

//publishTo := sonatypePublishToBundle.value

lazy val flinkVersion = "1.11.2"

libraryDependencies ++= Seq(
  "com.propensive"                   %% "magnolia"                   % "0.17.0",
  "org.apache.flink"          %% "flink-scala"                % flinkVersion % "provided",
  "org.apache.flink"          %% "flink-streaming-scala"      % flinkVersion % "provided",
  "org.scalatest" %% "scalatest" % "3.0.8" % "test",
  "org.typelevel" %% "cats-core" % "2.3.0"
)

// Did this to avoid class loading error for macro generated classes
// Test / classLoaderLayeringStrategy := ClassLoaderLayeringStrategy.Flat
Test / fork := true

pomExtra := (
  <scm>
    <url>git@github.com:findify/flink-adt.git</url>
    <connection>scm:git:git@github.com:findify/flink-adt.git</connection>
  </scm>
    <developers>
      <developer>
        <id>romangrebennikov</id>
        <name>Roman Grebennikov</name>
        <url>http://www.dfdx.me</url>
      </developer>
    </developers>)
