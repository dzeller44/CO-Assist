
package views.html.account.reset

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ask_Scope0 {
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

class ask extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[controllers.account.Reset.AskForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(askForm: Form[controllers.account.Reset.AskForm]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
implicit def /*4.6*/implicitFieldConstructor/*4.30*/ = {{
        FieldConstructor(twitterBootstrapInput.render)
    }};
Seq[Any](format.raw/*1.52*/("""

"""),format.raw/*4.1*/("""    """),format.raw/*6.6*/("""


"""),_display_(/*9.2*/main()/*9.8*/ {_display_(Seq[Any](format.raw/*9.10*/("""

	"""),format.raw/*11.2*/("""<section id="resetPassword">
		<!-- Start Formoid form-->
		<form class="formoid-solid-dark"
			style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
			method="post" action="">
			<div class="title">
				<h2>"""),_display_(/*17.10*/Messages("resetpassword")),format.raw/*17.35*/("""</h2>
			</div>
			<div class="element-input">
				<label class="title"><span class="required">*</span>Email:</label>
				<div class="item-cont">
					<input class="large" type="text" name="email" required="required"
						placeholder="Enter your email..." /><span class="icon-place"></span>
				</div>
			</div>
			<div class="submit">
				<input type="submit" value=""""),_display_(/*27.34*/Messages("reset")),format.raw/*27.51*/("""" />
				<a href="/" class="buttonCancel">"""),_display_(/*28.39*/Messages("goback")),format.raw/*28.57*/("""</a>
			</div>
			<!-- This is needed for bottom shadow to appear... -->
			<div></div>
		</form>

	</section>

""")))}),format.raw/*36.2*/("""
"""))
      }
    }
  }

  def render(askForm:Form[controllers.account.Reset.AskForm]): play.twirl.api.HtmlFormat.Appendable = apply(askForm)

  def f:((Form[controllers.account.Reset.AskForm]) => play.twirl.api.HtmlFormat.Appendable) = (askForm) => apply(askForm)

  def ref: this.type = this

}


}

/**/
object ask extends ask_Scope0.ask
              /*
                  -- GENERATED --
                  DATE: Thu Jan 12 11:28:13 MST 2017
                  SOURCE: C:/WebDev/workspace/COAssist/app/views/account/reset/ask.scala.html
                  HASH: 7eb0c6dd2cea788e480ed55abde03a06b6ee16d9
                  MATRIX: 788->1|940->78|972->102|1070->51|1100->73|1130->170|1162->177|1175->183|1214->185|1246->190|1607->524|1653->549|2060->929|2098->946|2169->990|2208->1008|2359->1129
                  LINES: 27->1|31->4|31->4|34->1|36->4|36->6|39->9|39->9|39->9|41->11|47->17|47->17|57->27|57->27|58->28|58->28|66->36
                  -- GENERATED --
              */
          