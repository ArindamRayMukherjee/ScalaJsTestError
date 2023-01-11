enablePlugins(ScalaJSPlugin)

name := "app"

scalaVersion := "2.13.8"

libraryDependencies += "me.shadaj" %%% "slinky-native" % "0.7.0"
libraryDependencies += "me.shadaj" %%% "slinky-hot" % "0.7.0"
libraryDependencies += "org.scalatest" %%% "scalatest" % "3.2.13" % "test"
//libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.13" % "test" //just to be able to run tests from Intellij
libraryDependencies += ("org.scala-js" %%% "scalajs-java-securerandom" % "1.0.0")

scalacOptions += "-Ymacro-annotations"

scalaJSLinkerConfig ~= (_.withModuleKind(ModuleKind.CommonJSModule))