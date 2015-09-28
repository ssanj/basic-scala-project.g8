This is a [giter8](https://github.com/n8han/giter8) template for generating a new scala project. It comes bundled with:

* `main` and `test` source directories
* *.html *.js *.css *.xml are automatically filtered
* [SBT](http://www.scala-sbt.org) 0.13.7
* [Scala](http://scala-lang.org) 2.11.7
* [ScalaTest](http://www.scalatest.org) 2.2.4
* [ScalaCheck](http://www.scalacheck.org) 1.12.5
* [Scalaz](https://github.com/scalaz/scalaz) 7.1.4
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