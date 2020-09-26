name := "HelloWorld"
version := "1.0"
scalaVersion := "2.12.12"

libraryDependencies ++= Seq(
  "com.github.spinalhdl" % "spinalhdl-core_2.12" % "latest.release",
  "com.github.spinalhdl" % "spinalhdl-lib_2.12" % "latest.release",
  compilerPlugin(
    "com.github.spinalhdl" % "spinalhdl-idsl-plugin_2.12" % "latest.release"
  )
)

fork := true
