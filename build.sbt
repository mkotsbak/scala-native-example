enablePlugins(ScalaNativePlugin)

scalaVersion := "2.11.8"

nativeClangOptions := Seq(
  "-O2",
  "-g"
)

libraryDependencies += "default" %% "telldus-core_sn" % "0.1-SNAPSHOT"
