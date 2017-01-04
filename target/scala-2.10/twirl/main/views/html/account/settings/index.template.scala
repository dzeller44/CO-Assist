
package views.html.account.settings

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""

"""),_display_(/*3.2*/main(user)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""

    """),format.raw/*5.5*/("""<div class="row">
        <div class="col col-lg-4">
            <ul class="nav nav-pills nav-stacked">
                <li>
                    <a href=""""),_display_(/*9.31*/controllers/*9.42*/.account.settings.routes.Password.index),format.raw/*9.81*/("""">"""),_display_(/*9.84*/Messages("password")),format.raw/*9.104*/("""</a>
                </li>
                <li>
                    <a href=""""),_display_(/*12.31*/controllers/*12.42*/.account.settings.routes.Email.index),format.raw/*12.78*/("""">"""),_display_(/*12.81*/Messages("email")),format.raw/*12.98*/("""</a>
                </li>
            </ul>
        </div>
        <div class="col col-lg-8">
        """),_display_(/*17.10*/content),format.raw/*17.17*/("""
        """),format.raw/*18.9*/("""</div>
    </div>
""")))}))
      }
    }
  }

  def render(user:User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(user)(content)

  def f:((User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (user) => (content) => apply(user)(content)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Jan 03 14:50:29 MST 2017
                  SOURCE: C:/WebDev/workspace/COAssist/app/views/account/settings/index.scala.html
                  HASH: ae755afbd2320817395916c0544d83f475616ae2
                  MATRIX: 765->1|887->28|917->33|935->43|974->45|1008->53|1193->212|1212->223|1271->262|1300->265|1341->285|1449->366|1469->377|1526->413|1556->416|1594->433|1730->542|1758->549|1795->559
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|40->9|40->9|40->9|40->9|40->9|43->12|43->12|43->12|43->12|43->12|48->17|48->17|49->18
                  -- GENERATED --
              */
          