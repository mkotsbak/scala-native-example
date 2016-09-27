import sbtcrossproject.{CrossType, JVM, Native}

enablePlugins(CrossProjectPlugin)

val scalaV = "2.11.8"

lazy val cross = crossProject.platform(JVM).platform(Native).crossType(CrossType.Full).in(file("."))

lazy val projectNative = cross.projects(Native).settings(
  //name := projectName + "_sn",
  scalaVersion := scalaV,
  //organization := "default"
  nativeClangOptions := Seq(
    "-O2",
    "-g"
  ),
  libraryDependencies += "default" %% "telldus-core_sn" % "0.1-SNAPSHOT"
).enablePlugins(ScalaNativePlugin)

lazy val projectJvm = cross.projects(JVM).settings(
  //name := projectName,
  scalaVersion := scalaV,
  libraryDependencies += "default" %% "telldus-core" % "0.1-SNAPSHOT"
  //organization := "default",
)

//lazy val projectJs = project.projects(JS)

