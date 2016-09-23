enablePlugins(ScalaNativePlugin)

scalaVersion := "2.11.8"

nativeClangOptions := Seq(
  "-O2",
  "-g"
)

libraryDependencies += "default" %% "scala-native-telldus-core" % "0.1-SNAPSHOT"
