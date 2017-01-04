
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object logged_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class logged extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""

"""),_display_(/*3.2*/if(user != null)/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
    """),format.raw/*4.5*/("""<ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> """),_display_(/*6.100*/user/*6.104*/.fullname),format.raw/*6.113*/(""" """),format.raw/*6.114*/("""<b class="caret"></b></a>
            <ul class="dropdown-menu">
                <li><a href=""""),_display_(/*8.31*/controllers/*8.42*/.account.settings.routes.Index.index()),format.raw/*8.80*/(""""><i class="fa fa-wrench"></i> """),_display_(/*8.112*/Messages("settings")),format.raw/*8.132*/("""</a></li>
                <li class="divider"></li>
                <li><a href=""""),_display_(/*10.31*/routes/*10.37*/.Application.logout()),format.raw/*10.58*/(""""><i class="fa fa-power-off"></i> """),_display_(/*10.93*/Messages("logout")),format.raw/*10.111*/("""</a></li>
            </ul>
        </li>
    </ul>
""")))}),format.raw/*14.2*/("""
"""))
      }
    }
  }

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object logged extends logged_Scope0.logged
              /*
                  -- GENERATED --
                  DATE: Wed Jan 04 08:49:47 MST 2017
                  SOURCE: C:/WebDev/workspace/COAssist/app/views/logged.scala.html
                  HASH: 5702257670939f834d456c32f7ede974c64fca11
                  MATRIX: 745->1|852->13|882->18|906->34|945->36|977->42|1176->214|1189->218|1219->227|1248->228|1371->325|1390->336|1448->374|1507->406|1548->426|1659->510|1674->516|1716->537|1778->572|1818->590|1905->647
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6|37->6|39->8|39->8|39->8|39->8|39->8|41->10|41->10|41->10|41->10|41->10|45->14
                  -- GENERATED --
              */
          