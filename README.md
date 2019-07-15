This is a [giter8](https://github.com/foundweekends/giter8) template for generating a new scala-2.12 project. Requires [giter8 version 0.8](https://github.com/foundweekends/giter8/releases/tag/v0.8.0) or newer to use __stable__ dependencies.

 It comes bundled with:

* `main` and `test` source directories
* *.html *.js *.css *.xml are automatically filtered
* [SBT](http://www.scala-sbt.org) 0.13.15
* [Scala](http://scala-lang.org) 2.12.2
* [ScalaTest](http://www.scalatest.org) 3.0.1
* [ScalaCheck](http://www.scalacheck.org) 1.13.5
* [Scalaz](https://github.com/scalaz/scalaz) 7.2.13
* Compiler Flags:
    * -unchecked
    * -deprecation
    * -feature
    * -Xfatal-warnings
    * -Xlint:_
    * -Ywarn-dead-code
    * -Ywarn-inaccessible
    * -Ywarn-unused-import
    * -Ywarn-infer-any
    * -Ywarn-nullary-override
    * -Ywarn-nullary-unit
* Project variables (override with --var_name=value):
    * name (name of the project, default is "basic-scala-project")
    * organization (organization packages, default is "com.example")
    * package (package path after organization, default is "project")
    * version (version of the application, default is "0.0.1")
    * blurb (text used in README.md, default is "A basic scala project")
    * mainclass (main class generated, default is "HelloWorld")
    * scala_version (latest version from maven)
