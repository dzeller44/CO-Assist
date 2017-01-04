
package views.html.profile

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
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

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Application.ProfileRegister],java.util.List[Service],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(profileForm: Form[Application.ProfileRegister], servicesList: java.util.List[Service]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.89*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""
	"""),format.raw/*4.2*/("""<script type="text/javascript">
		$(document).ready(function()"""),format.raw/*5.31*/("""{"""),format.raw/*5.32*/("""		 
			"""),format.raw/*6.4*/("""$('input[name=selectServices]').on('change', function() """),format.raw/*6.60*/("""{"""),format.raw/*6.61*/("""
				"""),format.raw/*7.5*/("""$('#services').val($('input[name=selectServices]:checked').map(function() """),format.raw/*7.79*/("""{"""),format.raw/*7.80*/("""
					"""),format.raw/*8.6*/("""return this.value;
				"""),format.raw/*9.5*/("""}"""),format.raw/*9.6*/(""").get());
			"""),format.raw/*10.4*/("""}"""),format.raw/*10.5*/(""");
		"""),format.raw/*11.3*/("""}"""),format.raw/*11.4*/(""");
	</script>
	<section id="profileMain">
		<form class="formoid-solid-dark"
			style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS','Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
			method="post" action="">
			<div class="title">
				<h2>Business Profile</h2>
			</div>
			<div class="element-input">
				<label class="title" style="font-weight:bold"><span class="required">*</span>Business
				Name:</label>
				<div class="item-cont">
					<input class="large" type="text" name="name" required="required"
						placeholder="Business Name..." /><span class="icon-place"></span>
				</div>
			</div>
			<div class="element-address">
				<label class="title"><span class="required">*</span>Business Address:</label><span class="addr1"><input placeholder="Street Address" type="text" name="address" required="required"/><span class="icon-place"></span></span><span class="addr2"><input placeholder="Address Line 2" type="text" name="address1" /><span class="icon-place"></span></span><span class="city"><input placeholder="City" type="text" name="city" /><span class="icon-place"></span></span><span class="state"><input placeholder="State / Province / Region" type="text" name="state" required="required"/><span class="icon-place"></span></span><span class="zip"><input placeholder="Postal / Zip Code" type="text" maxlength="15" name="zip" required="required"/><span class="icon-place"></span></span><div class="country">
					<select name="country" required="required">
						<option value="" disabled="disabled">--- Select a country ---</option>
						<option selected="selected" value="United States">United States</option>
						<option value="Canada">Canada</option>
					</select>
					<i></i><span class="icon-place"></span>
				</div>
				<div class="element-select">
					<label class="title"></label>
					<div class="item-cont">
						<div class="large">
							<span>
								<select name="county" required="required">
									<option selected="selected" value="" disabled="disabled">--- Select a county ---</option>
									<option value="Statewide">Statewide</option>
									<option value="Adams">Adams</option>
									<option value="Alamosa">Alamosa</option>
									<option value="Arapahoe">Arapahoe</option>
									<option value="Archuleta">Archuleta</option>
									<option value="Baca">Baca</option>
									<option value="Bent">Bent</option>
									<option value="Boulder">Boulder</option>
									<option value="Broomfield">Broomfield</option>
									<option value="Chaffee">Chaffee</option>
									<option value="Cheyenne">Cheyenne</option>
									<option value="Clear Creek">Clear Creek</option>
									<option value="Conejos">Conejos</option>
									<option value="Costilla">Costilla</option>
									<option value="Crowley">Crowley</option>
									<option value="Custer">Custer</option>
									<option value="Delta">Delta</option>
									<option value="Denver">Denver</option>
									<option value="Dolores">Dolores</option>
									<option value="Douglas">Douglas</option>
									<option value="Eagle">Eagle</option>
									<option value="Elbert">Elbert</option>
									<option value="El Paso">El Paso</option>
									<option value="Fremont">Fremont</option>
									<option value="Garfield">Garfield</option>
									<option value="Gilpin">Gilpin</option>
									<option value="Grand">Grand</option>
									<option value="Gunnison">Gunnison</option>
									<option value="Hinsdale">Hinsdale</option>
									<option value="Huerfano">Huerfano</option>
									<option value="Jackson">Jackson</option>
									<option value="Jefferson">Jefferson</option>
									<option value="Kiowa">Kiowa</option>
									<option value="Kit Carson">Kit Carson</option>
									<option value="Lake">Lake</option>
									<option value="La Plata">La Plata</option>
									<option value="Larimer">Larimer</option>
									<option value="Las Animas">Las Animas</option>
									<option value="Lincoln">Lincoln</option>
									<option value="Logan">Logan</option>
									<option value="Mesa">Mesa</option>
									<option value="Mineral">Mineral</option>
									<option value="Moffat">Moffat</option>
									<option value="Montezuma">Montezuma</option>
									<option value="Montrose">Montrose</option>
									<option value="Morgan">Morgan</option>
									<option value="Otero">Otero</option>
									<option value="Ouray">Ouray</option>
									<option value="Park">Park</option>
									<option value="Phillips">Phillips</option>
									<option value="Pitkin">Pitkin</option>
									<option value="Prowers">Prowers</option>
									<option value="Pueblo">Pueblo</option>
									<option value="Rio Blanco">Rio Blanco</option>
									<option value="Rio Grande">Rio Grande</option>
									<option value="Routt">Routt</option>
									<option value="Saguache">Saguache</option>
									<option value="San Juan">San Juan</option>
									<option value="San Miguel">San Miguel</option>
									<option value="Sedgwick">Sedgwick</option>
									<option value="Summit">Summit</option>
									<option value="Teller">Teller</option>
									<option value="Washington">Washington</option>
									<option value="Weld">Weld</option>
									<option value="Yuma">Yuma</option>
								</select>
								<i></i><span class="icon-place"></span>
							</span>
						</div>
					</div>
				</div>		
			</div>
			
		<hr style="border-color:#34495E;border-width: 3px;">
			
			
			<div class="element-input">
				<label class="title" style="font-weight:bold"><span class="required">*</span>Billing Name:</label>
				<div class="item-cont">
					<input class="large" type="text" name="billname" required="required"
						placeholder="Billing Name..." /><span class="icon-place"></span>
				</div>
			</div>
			<div class="element-address">
				<label class="title"><span class="required">*</span>Billing Address:</label><span class="addr1"><input placeholder="Street Address" type="text" name="billaddress" required="required"/><span class="icon-place"></span></span><span class="addr2"><input placeholder="Address Line 2" type="text" name="billaddress1" /><span class="icon-place"></span></span><span class="city"><input placeholder="City" type="text" name="billcity" /><span class="icon-place"></span></span><span class="state"><input placeholder="State / Province / Region" type="text" name="billstate" required="required"/><span class="icon-place"></span></span><span class="zip"><input placeholder="Postal / Zip Code" type="text" maxlength="15" name="billzip" required="required"/><span class="icon-place"></span></span><div class="country">
					<select name="billcountry" required="required">
						<option value="" disabled="disabled">--- Select a country ---</option>
						<option selected="selected" value="United States">United States</option>
						<option value="Canada">Canada</option>
					</select>
					<i></i><span class="icon-place"></span>		
				</div>		
			</div>
			
		<hr style="border-color:#34495E;border-width: 3px;">
			
			<div class="element-name">
				<label class="title" style="font-weight:bold"><span class="required">*</span>Business Hours Contact
				Name:</label><span class="nameFirst"><input
					placeholder="First Name..." type="text" size="8" name="primaryNameFirst"
					required="required" /><span class="icon-place"></span></span><span
					class="nameLast"><input placeholder="Last Name..."
					type="text" size="14" name="primaryNameLast" required="required" /><span
					class="icon-place"></span></span>
			</div>
			<div class="element-phone">
				<label class="title"><span class="required">*</span>Business Hours Contact
				Phone Number:</label>
				<div class="item-cont">
					<input class="large" type="tel" oninvalid="this.setCustomValidity('Phone number must be entered in format ###-###-####')"
						oninput = "this.setCustomValidity('')" pattern="\d"""),format.raw/*154.57*/("""{"""),format.raw/*154.58*/("""3"""),format.raw/*154.59*/("""}"""),format.raw/*154.60*/("""[\-]\d"""),format.raw/*154.66*/("""{"""),format.raw/*154.67*/("""3"""),format.raw/*154.68*/("""}"""),format.raw/*154.69*/("""[\-]\d"""),format.raw/*154.75*/("""{"""),format.raw/*154.76*/("""4"""),format.raw/*154.77*/("""}"""),format.raw/*154.78*/("""" maxlength="24" name="primaryPhone"
						required="required" placeholder="Phone Number..." value="" /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-email">
				<label class="title"><span class="required">*</span>Business Hours Contact
				Email:</label>
				<div class="item-cont">
					<input class="large" type="email" name="primaryEmail" value=""
						required="required" placeholder="Email..." /><span
						class="icon-place"></span>
				</div>
			</div>
			
		<hr style="border-color:#34495E;border-width: 3px;">
			
			<div class="element-name">
				<label class="title" style="font-weight:bold"><span class="required">*</span>Primary After Hours Contact
				Name:</label><span class="nameFirst"><input
					placeholder="First Name..." type="text" size="8" name="secondaryNameFirst"
					required="required" /><span class="icon-place"></span></span><span
					class="nameLast"><input placeholder="Last Name..."
					type="text" size="14" name="secondaryNameLast" required="required" /><span
					class="icon-place"></span></span>
			</div>
			<div class="element-phone">
				<label class="title"><span class="required">*</span>After Hours Contact
				Phone Number:</label>
				<div class="item-cont">
					<input class="large" type="tel" oninvalid="this.setCustomValidity('Phone number must be entered in format ###-###-####')"
						oninput = "this.setCustomValidity('')" pattern="\d"""),format.raw/*185.57*/("""{"""),format.raw/*185.58*/("""3"""),format.raw/*185.59*/("""}"""),format.raw/*185.60*/("""[\-]\d"""),format.raw/*185.66*/("""{"""),format.raw/*185.67*/("""3"""),format.raw/*185.68*/("""}"""),format.raw/*185.69*/("""[\-]\d"""),format.raw/*185.75*/("""{"""),format.raw/*185.76*/("""4"""),format.raw/*185.77*/("""}"""),format.raw/*185.78*/("""" maxlength="24" name="secondaryPhone"
						required="required" placeholder="Phone Number..." value="" /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-email">
				<label class="title"><span class="required">*</span>After Hours Contact
				Email:</label>
				<div class="item-cont">
					<input class="large" type="email" name="secondaryEmail" value=""
						required="required" placeholder="Email..." /><span
						class="icon-place"></span>
				</div>
			</div>
			
					<hr style="border-color:#34495E;border-width: 3px;">
			
			<div class="element-name">
				<label class="title" style="font-weight:bold">Secondary After Hours Contact
				Name <span  style="font-weight:normal">(optional)</span>:</label><span class="nameFirst"><input
					placeholder="First Name..." type="text" size="8" name="secondaryNameFirst2"
					/><span class="icon-place"></span></span><span
					class="nameLast"><input placeholder="Last Name..."
					type="text" size="14" name="secondaryNameLast2" /><span
					class="icon-place"></span></span>
			</div>
			<div class="element-phone">
				<label class="title">After Hours Contact
				Phone Number:</label>
				<div class="item-cont">
					<input class="large" type="tel" oninvalid="this.setCustomValidity('Phone number must be entered in format ###-###-####')"
						oninput = "this.setCustomValidity('')" pattern="\d"""),format.raw/*216.57*/("""{"""),format.raw/*216.58*/("""3"""),format.raw/*216.59*/("""}"""),format.raw/*216.60*/("""[\-]\d"""),format.raw/*216.66*/("""{"""),format.raw/*216.67*/("""3"""),format.raw/*216.68*/("""}"""),format.raw/*216.69*/("""[\-]\d"""),format.raw/*216.75*/("""{"""),format.raw/*216.76*/("""4"""),format.raw/*216.77*/("""}"""),format.raw/*216.78*/("""" maxlength="24" name="secondaryPhone2"
						placeholder="Phone Number..." value="" /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-email">
				<label class="title">After Hours Contact
				Email:</label>
				<div class="item-cont">
					<input class="large" type="email" name="secondaryEmail2" value=""
						placeholder="Email..." /><span
						class="icon-place"></span>
				</div>
			</div>
			
			
		<hr style="border-color:#34495E;border-width: 3px;">			
			
			<div class="element-checkbox">
				<label class="title"><span class="required">*</span>Services Provided:</label>
				<div class="column column1">
					"""),_display_(/*237.7*/for(service <- servicesList) yield /*237.35*/ {_display_(Seq[Any](format.raw/*237.37*/("""
					    """),format.raw/*238.10*/("""<label><input type="checkbox" class="selectServices" name="selectServices" id="selectServices" value=""""),_display_(/*238.113*/service/*238.120*/.name),format.raw/*238.125*/(""""><span>"""),_display_(/*238.134*/service/*238.141*/.name),format.raw/*238.146*/("""</span></label>
					""")))}),format.raw/*239.7*/("""
				"""),format.raw/*240.5*/("""</div>
				
				<input type="hidden" name="services" id="services">
	
				<div id="otherService" class="element-input">
					<label class="title"><span class="required">*</span>Other:</label>
					<div class="item-cont">
						<input class="large" type="text" name="servicesOther" 
							placeholder="Other..." /><span class="icon-place"></span>
					</div>
				</div>
				<span class="clearfix"></span>
			</div>
			<div class="element-input">
				"""),_display_(/*254.6*/if(profileForm.hasGlobalErrors)/*254.37*/ {_display_(Seq[Any](format.raw/*254.39*/("""
					"""),format.raw/*255.6*/("""<span class="errorMessageDisplay" style="color: #d9534f;">"""),_display_(/*255.65*/profileForm/*255.76*/.globalError.message),format.raw/*255.96*/("""</span>
				""")))}),format.raw/*256.6*/("""
			"""),format.raw/*257.4*/("""</div>
			<div class="submit">
				<input type="submit" value="Submit" /> <a href="/user"
					class="buttonCancel">"""),_display_(/*260.28*/Messages("goback")),format.raw/*260.46*/("""</a>
			</div>
			<!-- This is needed for bottom shadow to appear... -->
			<div></div>
		</form>
	</section>
""")))}))
      }
    }
  }

  def render(profileForm:Form[Application.ProfileRegister],servicesList:java.util.List[Service]): play.twirl.api.HtmlFormat.Appendable = apply(profileForm,servicesList)

  def f:((Form[Application.ProfileRegister],java.util.List[Service]) => play.twirl.api.HtmlFormat.Appendable) = (profileForm,servicesList) => apply(profileForm,servicesList)

  def ref: this.type = this

}


}

/**/
object profile extends profile_Scope0.profile
              /*
                  -- GENERATED --
                  DATE: Tue Jan 03 14:50:30 MST 2017
                  SOURCE: C:/WebDev/workspace/COAssist/app/views/profile/profile.scala.html
                  HASH: 21391c0f46b8ac4c4a8f2807b9ee4a2133145807
                  MATRIX: 808->1|990->88|1020->93|1038->103|1077->105|1106->108|1196->171|1224->172|1258->180|1341->236|1369->237|1401->243|1502->317|1530->318|1563->325|1613->349|1640->350|1681->364|1709->365|1742->371|1770->372|9915->8488|9945->8489|9975->8490|10005->8491|10040->8497|10070->8498|10100->8499|10130->8500|10165->8506|10195->8507|10225->8508|10255->8509|11746->9971|11776->9972|11806->9973|11836->9974|11871->9980|11901->9981|11931->9982|11961->9983|11996->9989|12026->9990|12056->9991|12086->9992|13535->11412|13565->11413|13595->11414|13625->11415|13660->11421|13690->11422|13720->11423|13750->11424|13785->11430|13815->11431|13845->11432|13875->11433|14581->12112|14626->12140|14667->12142|14707->12153|14839->12256|14857->12263|14885->12268|14923->12277|14941->12284|14969->12289|15023->12312|15057->12318|15549->12783|15590->12814|15631->12816|15666->12823|15753->12882|15774->12893|15816->12913|15861->12927|15894->12932|16042->13052|16082->13070
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|40->9|41->10|41->10|42->11|42->11|185->154|185->154|185->154|185->154|185->154|185->154|185->154|185->154|185->154|185->154|185->154|185->154|216->185|216->185|216->185|216->185|216->185|216->185|216->185|216->185|216->185|216->185|216->185|216->185|247->216|247->216|247->216|247->216|247->216|247->216|247->216|247->216|247->216|247->216|247->216|247->216|268->237|268->237|268->237|269->238|269->238|269->238|269->238|269->238|269->238|269->238|270->239|271->240|285->254|285->254|285->254|286->255|286->255|286->255|286->255|287->256|288->257|291->260|291->260
                  -- GENERATED --
              */
          