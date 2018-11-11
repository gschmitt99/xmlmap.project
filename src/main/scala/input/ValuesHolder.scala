package input

import java.nio.file.{Files, Paths}

import scala.xml._

class ValuesHolder(filePath:String) {
   private val valueMap = {
      val content = Files.readAllBytes(
         Paths.get(getClass.getResource(filePath).getPath)).map(_.toChar).mkString)
      val valXml = XML.loadString(content)
   }
}
