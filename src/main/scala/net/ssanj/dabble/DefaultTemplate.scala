package net.ssanj.dabble

trait DefaultTemplate {

  private val characters = Seq("Buffy", "Spike", "Willow", "Giles", "Faith", "Fred", "Angel",
                               "Wesley", "Xander", "Lorne", "Illyria", "Darla", "Gunn", "Connor",
                               "Groosalugg")

  private def getOne = characters(scala.util.Random.nextInt(characters.length))

  private lazy val templateHeader = s"//generated by Dabble ${DabbleInfo.version}"

  val templateName = s"""name := "$getOne""""

  val templateOrganisation = """organization := "verse.whedon""""

  val templateVersion = """version := "0.0.1""""

  val templateScalaVersion = """scalaVersion := "2.11.7""""

  val templateLineSeparator = s"${newline}${newline}"

  lazy val inMemSbtTemplate = s"${templateHeader}${templateLineSeparator}"       +
                              s"${templateName}${templateLineSeparator}"         +
                              s"${templateOrganisation}${templateLineSeparator}" +
                              s"${templateVersion}${templateLineSeparator}"      +
                              s"${templateScalaVersion}"
}

object DefaultTemplate extends DefaultTemplate