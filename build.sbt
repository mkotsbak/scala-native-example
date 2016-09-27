
import sbtcrossproject.{CrossType, JS, JVM, Native}
import sbtcrossproject.CrossProjectPlugin.autoImport.crossProject // Import explicitly as it also exists in SJS plugin

enablePlugins(CrossProjectPlugin)

val scalaV = "2.11.8"

lazy val root = project.in(file(".")).
  aggregate(projectJvm, projectNative, projectJs).
  settings(
  )

lazy val cross = crossProject.platform(JVM).platform(Native).platform(JS)
  .crossType(CrossType.Full).in(file("."))

lazy val projectJvm = cross.jvm.settings(
  //name := projectName,
  scalaVersion := scalaV,
  libraryDependencies += "io.github.mkotsbak" %% "telldus-core" % "0.1-SNAPSHOT"
)

lazy val projectNative = cross.native.settings(
  //name := projectName + "_sn",
  scalaVersion := scalaV,
  nativeClangOptions := Seq(
    "-O2",
    "-g"
  ),
  libraryDependencies += "io.github.mkotsbak" %% "telldus-core_sn" % "0.1-SNAPSHOT"
).enablePlugins(ScalaNativePlugin)

lazy val projectJs = cross.js.settings(
  scalaVersion := scalaV,
  libraryDependencies += "io.github.mkotsbak" %%% "telldus-core" % "0.1-SNAPSHOT",
  scalaJSUseRhino := false
).enablePlugins(ScalaJSPlugin)
