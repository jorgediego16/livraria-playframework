
package views.html.Home

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object welcome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, lastName: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html>

    <head>
        <title>My welcome page</title>
    </head>

    <body>
        <p>Welcome """),_display_(/*10.21*/name),format.raw/*10.25*/(""" """),_display_(/*10.27*/lastName),format.raw/*10.35*/(""" """),format.raw/*10.36*/("""To our website</p>
    </body>

</html>"""))
      }
    }
  }

  def render(name:String,lastName:String): play.twirl.api.HtmlFormat.Appendable = apply(name,lastName)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (name,lastName) => apply(name,lastName)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-07-17T14:47:25.013
                  SOURCE: /home/desenvolvedor0/Documentos/playframework/play-samples-play-java-hello-world-tutorial/app/views/Home/welcome.scala.html
                  HASH: f1fc3435e6e917d602797e642b0dca327fd2e679
                  MATRIX: 962->1|1088->34|1115->35|1244->137|1269->141|1298->143|1327->151|1356->152
                  LINES: 28->1|33->2|34->3|41->10|41->10|41->10|41->10|41->10
                  -- GENERATED --
              */
          