import Dependencies._

ThisBuild / scalaVersion     := "2.13.7"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.cabexas"
ThisBuild / organizationName := "cabexas"

lazy val root = (project in file("."))
  .settings(
    name := "scala-2.13-playground",
    libraryDependencies ++= Seq(cats, catsEffect, fs2),
    libraryDependencies ++= Seq(munit, munitCatsEffect, scalaTest)
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
