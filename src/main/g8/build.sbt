name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.13.0"

libraryDependencies ++= Seq(
  "org.scalatest"  %% "scalatest"   % "$scalatest_version$"  % "test",
  "org.scalacheck" %% "scalacheck"  % "$scalacheck_version$" % "test"
)

lazy val commonCompilerOptions =
  Seq(
      "-unchecked",
      "-encoding", "UTF-8",
      "-deprecation",
      "-feature"
    )

scalacOptions ++= 
  commonCompilerOptions ++ 
  Seq(
      "-Werror"     
  )

scalacOptions in (Compile, console) := commonCompilerOptions

scalacOptions in (Test, console) := commonCompilerOptions

