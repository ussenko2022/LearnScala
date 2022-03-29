package scalaCourse2020

import java.util.UUID

import play.api.libs.functional.syntax._
import play.api.libs.json.{Reads, _}

//Определение модели данных кейс классом
case class User(id: UUID, name: String, title: Option[String])
final case class Patient(id: UUID, name: String, title: Option[String])


object User {

  //кастомный вариант сборки из объекта в json
  /*
  implicit  val writesCustom:OWrites[User] = OWrites {
    user => Json.obj(
      "id" -> user.id,
            "name" -> user.name,
            "title" -> user.title
    )
  }
  */

  //макрос. Автоматический вариант сборки из объекта в json
  implicit val writes: OWrites[User] = Json.writes[User]


  implicit val userReads: Reads[User] = (
    (__ \ "id").read[UUID] and
      (__ \ "name").read[String] and
      (__ \ "title").readNullable[String])(User.apply _)
}




object Patient {
  //кастомный вариант сборки из объекта в json
  /*
  implicit  val writesCustom:OWrites[Patient] = OWrites {
    patient => Json.obj(
      "id" -> patient.id,
      "name" -> patient.name,
      "title" -> patient.title
    )
  }
  */


  //макрос. Автоматический вариант сборки из объекта в json
  implicit val writes: OWrites[Patient] = Json.writes[Patient]

  implicit  val patientReads: Reads[Patient] = (
      (__ \ "id").read[UUID] and
      (__ \ "name").read[String] and
      (__ \ "title").readNullable[String])(Patient.apply _)
}




object playJson extends App{

  //конструирование json вручную
  val v: JsValue = JsObject(Seq(
    "id" -> JsNumber(1),
    "name" -> JsString("Andrey"),
    "marks" -> JsArray(List(JsNumber(2), JsNumber(3)))
  ))

  //println(Json.stringify(v))
  //println(Json.prettyPrint(v))


  val v2 = """{
             |  "id" : "4cde4500-bb78-4d39-a57b-846f3833cd39",
             |  "name1" : "Andreyee",
             |  "marks" : "note"
             |}
             |"""

  //println(v2)
  //println(v2.stripMargin)
  //из string в json, читабельный вывод в консоль
  //println(Json.prettyPrint(Json.parse(v2.stripMargin)))

  val myU = User(UUID.randomUUID(), "Andrey", Option("my title"))
  //println(myU)
  //println(myU.toString)
  //println(myU.id)
  //println(Json.prettyPrint(Json.toJson(myU)))

  val myP = Patient(UUID.randomUUID(), "Andrey", Option("Title patient"))
  println(Json.prettyPrint(Json.toJson(myP)))


  Json.parse(v2.stripMargin).validate[Patient] match {
    case JsSuccess(value, path) => println(value)
    case JsError(errors) => println(errors)
  }
}
