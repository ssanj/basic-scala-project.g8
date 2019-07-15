name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scala_compiler_version$"

libraryDependencies ++= Seq(
  "org.scalatest"  %% "scalatest"   % "$scalatest_version$"  % "test",
  "org.scalacheck" %% "scalacheck"  % "$scalacheck_version$" % "test"
)

lazy val commonCompilerOptions =
  Seq(
      "-unchecked",
      "-encoding", "UTF-8",
      "-deprecation",
      "-feature",
      "-Ypartial-unification"
    )

scalacOptions ++= 
  commonCompilerOptions ++ 
  Seq(
      "-Xfatal-warnings",
      "-Xlint:_",
      "-Ywarn-dead-code",
      "-Ywarn-inaccessible",
      "-Ywarn-unused-import",
      "-Ywarn-infer-any",
      "-Ywarn-nullary-override",
      "-Ywarn-nullary-unit",
     )

scalacOptions in (Compile, console) := commonCompilerOptions

scalacOptions in (Test, console) := commonCompilerOptions

