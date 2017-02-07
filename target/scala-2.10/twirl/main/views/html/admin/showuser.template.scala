
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object showuser_Scope0 {
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

class showuser extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[Application.FindUser],String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(findUserForm: Form[Application.FindUser], userEmail: String, userName: String, userRole: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.99*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""

"""),format.raw/*5.1*/("""<section id="signup">
	<!-- Start Formoid form-->
	<form id="showuser" class="formoid-solid-dark"
		style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
		method="post" action=""""),_display_(/*9.26*/routes/*9.32*/.Application.updateUser()),format.raw/*9.57*/("""">
		<div class="title">
			<h2>User Maintenance</h2>
		</div>
		<div class="element-input">
			<label class="title"><span class="required">*</span>User
				Name:</label>
			<div class="item-cont">
				<input class="large" type="text" name="fullname" required="required" 
					placeholder="Choose a user name..." value=""""),_display_(/*18.50*/userName),format.raw/*18.58*/("""" /><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-input">
			<label class="title">Email:</label>
			<div class="item-cont">
				<input class="large" type="email" name="email" readonly style="color: #dddddd;" 
					placeholder="Enter your email..." value=""""),_display_(/*25.48*/userEmail),format.raw/*25.57*/("""" /><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-select">
			<label class="title"><span class="required">*</span>Account
			Role: <b>"""),_display_(/*30.14*/userRole/*30.22*/.capitalize),format.raw/*30.33*/("""</b></label>
			<div class="item-cont">
				<div class="large">
					<span>
						<select name="role" required="required">
							<option """),_display_(/*35.17*/if(userRole == "user")/*35.39*/ {_display_(Seq[Any](format.raw/*35.41*/("""selected="selected"""")))}),format.raw/*35.61*/(""" """),format.raw/*35.62*/("""value="user">Business User</option>
							<option """),_display_(/*36.17*/if(userRole == "manager")/*36.42*/ {_display_(Seq[Any](format.raw/*36.44*/("""selected="selected"""")))}),format.raw/*36.64*/(""" """),format.raw/*36.65*/("""value="manager">Emergency Manager</option>

						</select>
						<i></i><span class="icon-place"></span>
					</span>
				</div>
			</div>
		</div>
		<div class="element-radio">
 			<label class="title"><strong>Approve/Deny Emergency Manager</strong></label>
  			<div class="column column1">
 				<label>
 					<input type="radio" name="approved" value="Y" /><span>Approve</span>
 				</label>
 				<label>
 					<input
 					type="radio" name="approved" value="N" /><span>Deny</span>
 				</label>
 			</div>
  			<span class="clearfix"></span>
  		</div>	
		<div class="element-input">
		    """),_display_(/*58.8*/if(findUserForm.hasGlobalErrors)/*58.40*/ {_display_(Seq[Any](format.raw/*58.42*/("""
        		"""),format.raw/*59.11*/("""<span class="errorMessageDisplay" style="color: #d9534f;">
            		"""),_display_(/*60.16*/findUserForm/*60.28*/.globalError.message),format.raw/*60.48*/("""
        		"""),format.raw/*61.11*/("""</span>
   			""")))}),format.raw/*62.8*/("""
		"""),format.raw/*63.3*/("""</div>
		<div class="submit">
			<input type="submit" value="""),_display_(/*65.32*/Messages("submit")),format.raw/*65.50*/(""" """),format.raw/*65.51*/("""/>
			<a href="/admin" class="buttonCancel">"""),_display_(/*66.43*/Messages("goback")),format.raw/*66.61*/("""</a>
		</div>
		<div class="submit">
			<a href="javascript:deleteUser('"""),_display_(/*69.37*/userEmail),format.raw/*69.46*/("""')" class="buttonDelete" style="color: #FFFFFF;">Delete</a>
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>

</section>

""")))}),format.raw/*77.2*/("""
"""))
      }
    }
  }

  def render(findUserForm:Form[Application.FindUser],userEmail:String,userName:String,userRole:String): play.twirl.api.HtmlFormat.Appendable = apply(findUserForm,userEmail,userName,userRole)

  def f:((Form[Application.FindUser],String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (findUserForm,userEmail,userName,userRole) => apply(findUserForm,userEmail,userName,userRole)

  def ref: this.type = this

}


}

/**/
object showuser extends showuser_Scope0.showuser
              /*
                  -- GENERATED --
                  DATE: Thu Jan 12 11:28:13 MST 2017
                  SOURCE: C:/WebDev/workspace/COAssist/app/views/admin/showuser.scala.html
                  HASH: 0ead0dfa2be9722e2e693225e3db6d5fa2050531
                  MATRIX: 798->1|990->98|1020->103|1038->113|1077->115|1107->119|1434->420|1448->426|1493->451|1850->781|1879->789|2197->1080|2227->1089|2422->1257|2439->1265|2471->1276|2642->1420|2673->1442|2713->1444|2764->1464|2793->1465|2873->1518|2907->1543|2947->1545|2998->1565|3027->1566|3672->2185|3713->2217|3753->2219|3793->2231|3895->2306|3916->2318|3957->2338|3997->2350|4043->2366|4074->2370|4164->2433|4203->2451|4232->2452|4305->2498|4344->2516|4447->2592|4477->2601|4678->2772
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|40->9|40->9|40->9|49->18|49->18|56->25|56->25|61->30|61->30|61->30|66->35|66->35|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|89->58|89->58|89->58|90->59|91->60|91->60|91->60|92->61|93->62|94->63|96->65|96->65|96->65|97->66|97->66|100->69|100->69|108->77
                  -- GENERATED --
              */
          