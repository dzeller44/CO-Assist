
package views.html.account.settings

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object emailValidate_Scope0 {
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

class emailValidate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.14*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/views/*5.7*/.html.account.settings.index(user)/*5.41*/ {_display_(Seq[Any](format.raw/*5.43*/("""

    """),_display_(/*7.6*/wflash()),format.raw/*7.14*/("""

""")))}))
      }
    }
  }

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object emailValidate extends emailValidate_Scope0.emailValidate
              /*
                  -- GENERATED --
                  DATE: Mon Jan 09 13:59:48 MST 2017
                  SOURCE: C:/WebDev/workspace/COAssist/app/views/account/settings/emailValidate.scala.html
                  HASH: e276b576ead2c1b9aabfb1e0a4375f1cf9fb6d9f
                  MATRIX: 776->1|898->13|928->35|956->38|968->43|1010->77|1049->79|1083->88|1111->96
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|35->5|37->7|37->7
                  -- GENERATED --
              */
          