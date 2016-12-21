
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object wflash_Scope0 {
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

class wflash extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/flash/*2.7*/.map/*2.11*/ {/*3.5*/case (key, value) =>/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
        """),format.raw/*4.9*/("""<p class="">
            <span class="label label-"""),_display_(/*5.39*/key),format.raw/*5.42*/("""">"""),_display_(/*5.45*/value),format.raw/*5.50*/("""</span>
        </p>
    """)))}}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object wflash extends wflash_Scope0.wflash
              /*
                  -- GENERATED --
                  DATE: Wed Dec 21 10:41:44 MST 2016
                  SOURCE: C:/WebDev/workspace2/CO-Assist/app/views/wflash.scala.html
                  HASH: cca69dca5cf73935905a290b723a7a9a1274bc7a
                  MATRIX: 829->3|841->8|853->12|862->20|890->40|929->42|965->52|1043->104|1066->107|1095->110|1120->115
                  LINES: 32->2|32->2|32->2|32->3|32->3|32->3|33->4|34->5|34->5|34->5|34->5
                  -- GENERATED --
              */
          