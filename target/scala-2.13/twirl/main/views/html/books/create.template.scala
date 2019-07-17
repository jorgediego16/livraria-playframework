
package views.html.books

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

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bookForm : Form[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<html>

    <head>
        <title>Create Book</title>
    </head>

    <body>

        <h1>Create Book</h1>
        """),_display_(/*13.10*/helper/*13.16*/.form(action = helper.CSRF(routes.BooksController.save()))/*13.74*/ {_display_(Seq[Any](format.raw/*13.76*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(bookForm("id"))),format.raw/*14.46*/("""
            """),_display_(/*15.14*/helper/*15.20*/.inputText(bookForm("title"))),format.raw/*15.49*/("""
            """),_display_(/*16.14*/helper/*16.20*/.inputText(bookForm("price"))),format.raw/*16.49*/("""
            """),_display_(/*17.14*/helper/*17.20*/.inputText(bookForm("author"))),format.raw/*17.50*/("""

            """),format.raw/*19.13*/("""<input type="submit" value="Create Book">
        """)))}),format.raw/*20.10*/("""


    """),format.raw/*23.5*/("""</body>

</html>"""))
      }
    }
  }

  def render(bookForm:Form[Book]): play.twirl.api.HtmlFormat.Appendable = apply(bookForm)

  def f:((Form[Book]) => play.twirl.api.HtmlFormat.Appendable) = (bookForm) => apply(bookForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-07-17T17:16:10.816
                  SOURCE: /home/desenvolvedor0/Documentos/livraria-playframework/app/views/books/create.scala.html
                  HASH: db0e1ec608b46790e885467f2a8327b12ce20caf
                  MATRIX: 959->1|1055->26|1099->42|1126->43|1270->160|1285->166|1352->224|1392->226|1433->240|1448->246|1495->272|1536->286|1551->292|1601->321|1642->335|1657->341|1707->370|1748->384|1763->390|1814->420|1856->434|1938->485|1972->492
                  LINES: 28->1|31->2|34->3|35->4|44->13|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|50->19|51->20|54->23
                  -- GENERATED --
              */
          