## Overview

This project is an example of how you can use the [Telldus core facade](https://github.com/mkotsbak/scala-native-telldus-core)  with [Scala Native]

### Installation and running

* Until merged/published, you need to clone https://github.com/gurinderu/sbt-cross-project and do "sbt publishLocal" first
* Until merged/published, you need to clone https://github.com/mkotsbak/scala-native-telldus-core/tree/crossProjectWithSJS branch and do "sbt publishLocal" first

## JVM version

* Run with "sbt jvm/run"

## Scala Native version

* Follow installation instructions for Scala Native dependencies (CLang, LLVM etc.): https://github.com/scala-native/scala-native-example
* Run with "sbt native/run"

## Scala JS version

* "npm install sleep"
* Run with "sbt js/run"

[Scala Native]: http://scala-native.org
