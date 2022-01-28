val scalaVersion = "3.1.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "$name$",
    organization := "$package$",
    scalaVersion := scalaVersion,

    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core" % "2.3.0",
      "org.typelevel" %% "cats-effect" % "3.3.4",

      "org.scalatest" %% "scalatest" % "3.2.10" % "test"
    )
  )
