
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Set[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(books : Set[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html>

    <head>
        <title>All Books</title>
    </head>

    <body>

        <h1>All Books</h1>

        """),_display_(/*13.10*/for(book <- books) yield /*13.28*/ {_display_(Seq[Any](format.raw/*13.30*/("""
            """),format.raw/*14.13*/("""<a href="#">"""),_display_(/*14.26*/book/*14.30*/.title),format.raw/*14.36*/("""</a>
            <p>Price : """),_display_(/*15.25*/book/*15.29*/.price),format.raw/*15.35*/("""</p>
            <p>Author : """),_display_(/*16.26*/book/*16.30*/.author),format.raw/*16.37*/("""</p>
        """)))}),format.raw/*17.10*/("""

    """),format.raw/*19.5*/("""</body>

</html>"""))
      }
    }
  }

  def render(books:Set[Book]): play.twirl.api.HtmlFormat.Appendable = apply(books)

  def f:((Set[Book]) => play.twirl.api.HtmlFormat.Appendable) = (books) => apply(books)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-07-17T16:23:41.300
                  SOURCE: /home/desenvolvedor0/Documentos/livraria-playframework/app/views/books/index.scala.html
                  HASH: 4d08f0570b476381792fd33f102bff794939021c
                  MATRIX: 957->1|1070->21|1097->22|1238->136|1272->154|1312->156|1353->169|1393->182|1406->186|1433->192|1489->221|1502->225|1529->231|1586->261|1599->265|1627->272|1672->286|1705->292
                  LINES: 28->1|33->2|34->3|44->13|44->13|44->13|45->14|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|50->19
                  -- GENERATED --
              */
          