organization := "net.scalapro"

name := "lift-slick"

version := "0.1"

scalaVersion := "2.12.1"

val liftVer = "3.0.1"

libraryDependencies +="net.liftweb"       %% "lift-webkit"        % liftVer       % "compile"
//libraryDependencies += "org.eclipse.jetty" % "jetty-webapp" % "9.4.0.v20161208" % "provided,test"
//libraryDependencies += "org.eclipse.jetty" % "jetty-plus" % "9.4.0.v20161208" % "provided,test"
//libraryDependencies += "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" %
//  "provided,test" artifacts Artifact("javax.servlet", "jar", "jar")


libraryDependencies += "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided"
libraryDependencies += "com.typesafe.slick" % "slick_2.12" % "3.2.0-M2"
libraryDependencies += "org.postgresql" % "postgresql" % "9.4.1212.jre7"
libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.6.4"

enablePlugins(TomcatPlugin)
