This is a [giter8](https://github.com/n8han/giter8) template for generating a new scala-2.12 project. It comes bundled with:

* `main` and `test` source directories
* *.html *.js *.css *.xml are automatically filtered
* [SBT](http://www.scala-sbt.org) 0.13.13
* [Scala](http://scala-lang.org) 2.12.x (latest version from Maven)
* [ScalaTest](http://www.scalatest.org) 3.0.1
* [ScalaCheck](http://www.scalacheck.org) 1.13.4
* [Scalaz](https://github.com/scalaz/scalaz) 7.2.9
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
    * name (name of the project, default is "Basic Project")
    * organization (organization packages, default is "com.example")
    * package (package path after organization, default is "validation.extra")
    * version (version of the application, default is "0.0.1")
    * blurb (text used in README.md, default is "A basic scala project")
    * mainclass (main class generated, default is "HelloWorld")
    * scala_version (latest version from maven)
