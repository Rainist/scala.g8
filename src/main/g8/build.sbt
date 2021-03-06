import Dependencies._

lazy val root = (project in file(".")).settings(
  inThisBuild(
    List(
      organization := "$organization$",
      scalaVersion := "$scala_version$"
    )
  ),
  name := "$name;format="start"$",
  version := "0.0.1",
  scalacOptions ++= Seq(
    "-unchecked",
    "-feature",
    "-deprecation",
    "-language:postfixOps",
    "-language:implicitConversions"
  ),
  libraryDependencies ++= Seq(
    testDependencies
  ).flatten,
  scalafmtOnCompile := true,
  autoCompilerPlugins := true,
  assemblyOutputPath in assembly := new File("/app/target/app.jar")
)
