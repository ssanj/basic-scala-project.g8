name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scala_compiler_version$"

libraryDependencies ++= Seq(
  "org.scalaz"     %% "scalaz-core" % "$scalaz_version$",
  "org.scalatest"  %% "scalatest"   % "$scalatest_version$"  % "test",
  "org.scalacheck" %% "scalacheck"  % "$scalacheck_version$" % "test"
)

scalacOptions ++= Seq(
                      "-unchecked",
                      "-deprecation",
                      "-feature",
                      "-Xfatal-warnings",
                      "-Xlint:_",
                      "-Ywarn-dead-code",
                      "-Ywarn-inaccessible",
                      "-Ywarn-unused-import",
                      "-Ywarn-infer-any",
                      "-Ywarn-nullary-override",
                      "-Ywarn-nullary-unit"
                     )

scalacOptions in (Compile, console) ~= (_.filterNot(Seq("-Xlint:_", "-Xfatal-warnings", "-Ywarn-unused-import") contains _))

scalacOptions in (Test, console) := (scalacOptions in (Compile, console)).value

initialCommands := "import $organization$.$package$._"

