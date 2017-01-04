
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createadmin_Scope0 {
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

class createadmin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.AdminRegister],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(registerAdminForm: Form[Application.AdminRegister]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.54*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""

"""),format.raw/*5.1*/("""<section id="signupAdmin">
	<form class="formoid-solid-dark"
		style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
		method="post" action="">
		<div class="title">
			<h2>New Admin</h2>
		</div>
		<div class="element-input">
			<label class="title"><span class="required">*</span>User
				Name:</label>
			<div class="item-cont">
				<input class="large" type="text" name="fullname" required="required"
					placeholder="Enter the Admin's Name..." /><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-input">
			<label class="title"><span class="required">*</span>Email:</label>
			<div class="item-cont">
				<input class="large" type="email" name="email" required="required"
					placeholder="Enter the Admin's email..." /><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-input">
		    """),_display_(/*28.8*/if(registerAdminForm.hasGlobalErrors)/*28.45*/ {_display_(Seq[Any](format.raw/*28.47*/("""
        		"""),format.raw/*29.11*/("""<span class="errorMessageDisplay" style="color: #d9534f;">
            		"""),_display_(/*30.16*/registerAdminForm/*30.33*/.globalError.message),format.raw/*30.53*/("""
        		"""),format.raw/*31.11*/("""</span>
   			""")))}),format.raw/*32.8*/("""
		"""),format.raw/*33.3*/("""</div>
		<div class="submit">
			<input type="submit" value="Submit" /> <a href="/admin"
				class="buttonCancel">"""),_display_(/*36.27*/Messages("goback")),format.raw/*36.45*/("""</a>
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>

</section>

""")))}),format.raw/*44.2*/("""
"""))
      }
    }
  }

  def render(registerAdminForm:Form[Application.AdminRegister]): play.twirl.api.HtmlFormat.Appendable = apply(registerAdminForm)

  def f:((Form[Application.AdminRegister]) => play.twirl.api.HtmlFormat.Appendable) = (registerAdminForm) => apply(registerAdminForm)

  def ref: this.type = this

}


}

/**/
object createadmin extends createadmin_Scope0.createadmin
              /*
                  -- GENERATED --
                  DATE: Wed Jan 04 08:49:48 MST 2017
                  SOURCE: C:/WebDev/workspace/COAssist/app/views/admin/createadmin.scala.html
                  HASH: 41ee16dcea39a4ff9c7a871b54a7230ca5b64939
                  MATRIX: 788->1|935->53|965->58|983->68|1022->70|1052->74|2058->1054|2104->1091|2144->1093|2184->1105|2286->1180|2312->1197|2353->1217|2393->1229|2439->1245|2470->1249|2615->1367|2654->1385|2800->1501
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|59->28|59->28|59->28|60->29|61->30|61->30|61->30|62->31|63->32|64->33|67->36|67->36|75->44
                  -- GENERATED --
              */
          