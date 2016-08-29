import play.sbt.PlayImport._

name := "scala-rec-sys"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test
)

libraryDependencies ++= Seq(
  "org.mockito" % "mockito-core" % "1.9.5" % "test",
  "org.reactivemongo" % "reactivemongo_2.11" % "0.11.14")


//libraryDependencies ++= Seq(
//  "org.apache.spark" % "spark-mllib_2.11" % "2.0.0",
//  "org.scala-lang" % "scala-xml" % "2.11.0-M4")


