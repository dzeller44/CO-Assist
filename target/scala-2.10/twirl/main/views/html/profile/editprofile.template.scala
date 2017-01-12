
package views.html.profile

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editprofile_Scope0 {
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

class editprofile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[Application.ProfileRegister],java.util.List[Service],Profile,java.util.List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(profileForm: Form[Application.ProfileRegister], servicesList: java.util.List[Service], profile: Profile, servicesSelected: java.util.List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.149*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""
	"""),format.raw/*4.2*/("""<script type="text/javascript">
	$(document).ready(function()"""),format.raw/*5.30*/("""{"""),format.raw/*5.31*/("""		 
		"""),format.raw/*6.3*/("""$('input[name=selectServices]').on('change', function() """),format.raw/*6.59*/("""{"""),format.raw/*6.60*/("""
			"""),format.raw/*7.4*/("""$('#services').val($('input[name=selectServices]:checked').map(function() """),format.raw/*7.78*/("""{"""),format.raw/*7.79*/("""
				"""),format.raw/*8.5*/("""return this.value;
			"""),format.raw/*9.4*/("""}"""),format.raw/*9.5*/(""").get());
		"""),format.raw/*10.3*/("""}"""),format.raw/*10.4*/(""");
	"""),format.raw/*11.2*/("""}"""),format.raw/*11.3*/(""");
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
						placeholder="Business Name..." value=""""),_display_(/*25.46*/profile/*25.53*/.name),format.raw/*25.58*/("""" /><span class="icon-place"></span>
				</div>
			</div>
			<div class="element-address">
				<label class="title"><span class="required">*</span>Business Address:</label><span class="addr1"><input placeholder="Street Address" type="text" name="address" required="required" value=""""),_display_(/*29.193*/profile/*29.200*/.address),format.raw/*29.208*/("""" /><span class="icon-place"></span></span><span class="addr2"><input placeholder="Address Line 2" type="text" name="address1" value=""""),_display_(/*29.343*/profile/*29.350*/.address1),format.raw/*29.359*/("""" /><span class="icon-place"></span></span><span class="city"><input placeholder="City" type="text" name="city" value=""""),_display_(/*29.479*/profile/*29.486*/.city),format.raw/*29.491*/("""" /><span class="icon-place"></span></span><span class="state"><input placeholder="State / Province / Region" type="text" name="state" required="required" value=""""),_display_(/*29.654*/profile/*29.661*/.state),format.raw/*29.667*/("""" /><span class="icon-place"></span></span><span class="zip"><input placeholder="Postal / Zip Code" type="text" maxlength="15" name="zip" required="required" value=""""),_display_(/*29.833*/profile/*29.840*/.zip),format.raw/*29.844*/("""" /><span class="icon-place"></span></span><div class="country">
					<select name="country" required="required">
						<option value="" disabled="disabled">--- Select a country ---</option>
							<option """),_display_(/*32.17*/if(profile.country == "United States")/*32.55*/ {_display_(Seq[Any](format.raw/*32.57*/("""selected="selected"""")))}),format.raw/*32.77*/(""" """),format.raw/*32.78*/("""value="United States">United States</option>
							<option """),_display_(/*33.17*/if(profile.country == "Canada")/*33.48*/ {_display_(Seq[Any](format.raw/*33.50*/("""selected="selected"""")))}),format.raw/*33.70*/("""selected="selected" value="Canada">Canada</option>
					</select>
					<i></i><span class="icon-place"></span>
				</div>
				<div class="element-select">
					<label class="title"></label>
					<div class="item-cont">
						<div class="large">
							<span>
								<select name="county" required="required">
									<option disabled="disabled">--- Select a county ---</option>
									<option """),_display_(/*44.19*/if(profile.county == "Statewide")/*44.52*/ {_display_(Seq[Any](format.raw/*44.54*/("""selected="selected"""")))}),format.raw/*44.74*/(""">Statewide</option>
									<option """),_display_(/*45.19*/if(profile.county == "Adams")/*45.48*/ {_display_(Seq[Any](format.raw/*45.50*/("""selected="selected"""")))}),format.raw/*45.70*/(""">Adams</option>
									<option """),_display_(/*46.19*/if(profile.county == "Alamosa")/*46.50*/ {_display_(Seq[Any](format.raw/*46.52*/("""selected="selected"""")))}),format.raw/*46.72*/(""">Alamosa</option>
									<option """),_display_(/*47.19*/if(profile.county == "Arapahoe")/*47.51*/ {_display_(Seq[Any](format.raw/*47.53*/("""selected="selected"""")))}),format.raw/*47.73*/(""">Arapahoe</option>
									<option """),_display_(/*48.19*/if(profile.county == "Archuleta")/*48.52*/ {_display_(Seq[Any](format.raw/*48.54*/("""selected="selected"""")))}),format.raw/*48.74*/(""">Archuleta</option>
									<option """),_display_(/*49.19*/if(profile.county == "Baca")/*49.47*/ {_display_(Seq[Any](format.raw/*49.49*/("""selected="selected"""")))}),format.raw/*49.69*/(""">Baca</option>
									<option """),_display_(/*50.19*/if(profile.county == "Bent")/*50.47*/ {_display_(Seq[Any](format.raw/*50.49*/("""selected="selected"""")))}),format.raw/*50.69*/(""">Bent</option>
									<option """),_display_(/*51.19*/if(profile.county == "Boulder")/*51.50*/ {_display_(Seq[Any](format.raw/*51.52*/("""selected="selected"""")))}),format.raw/*51.72*/(""">Boulder</option>
									<option """),_display_(/*52.19*/if(profile.county == "Broomfield")/*52.53*/ {_display_(Seq[Any](format.raw/*52.55*/("""selected="selected"""")))}),format.raw/*52.75*/(""">Broomfield</option>
									<option """),_display_(/*53.19*/if(profile.county == "Chaffee")/*53.50*/ {_display_(Seq[Any](format.raw/*53.52*/("""selected="selected"""")))}),format.raw/*53.72*/(""">Chaffee</option>
									<option """),_display_(/*54.19*/if(profile.county == "Cheyenne")/*54.51*/ {_display_(Seq[Any](format.raw/*54.53*/("""selected="selected"""")))}),format.raw/*54.73*/(""">Cheyenne</option>
									<option """),_display_(/*55.19*/if(profile.county == "Clear Creek")/*55.54*/ {_display_(Seq[Any](format.raw/*55.56*/("""selected="selected"""")))}),format.raw/*55.76*/(""">Clear Creek</option>
									<option """),_display_(/*56.19*/if(profile.county == "Conejos")/*56.50*/ {_display_(Seq[Any](format.raw/*56.52*/("""selected="selected"""")))}),format.raw/*56.72*/(""">Conejos</option>
									<option """),_display_(/*57.19*/if(profile.county == "Costilla")/*57.51*/ {_display_(Seq[Any](format.raw/*57.53*/("""selected="selected"""")))}),format.raw/*57.73*/(""">Costilla</option>
									<option """),_display_(/*58.19*/if(profile.county == "Crowley")/*58.50*/ {_display_(Seq[Any](format.raw/*58.52*/("""selected="selected"""")))}),format.raw/*58.72*/(""">Crowley</option>
									<option """),_display_(/*59.19*/if(profile.county == "Custer")/*59.49*/ {_display_(Seq[Any](format.raw/*59.51*/("""selected="selected"""")))}),format.raw/*59.71*/(""">Custer</option>
									<option """),_display_(/*60.19*/if(profile.county == "Delta")/*60.48*/ {_display_(Seq[Any](format.raw/*60.50*/("""selected="selected"""")))}),format.raw/*60.70*/(""">Delta</option>
									<option """),_display_(/*61.19*/if(profile.county == "Denver")/*61.49*/ {_display_(Seq[Any](format.raw/*61.51*/("""selected="selected"""")))}),format.raw/*61.71*/(""">Denver</option>
									<option """),_display_(/*62.19*/if(profile.county == "Dolores")/*62.50*/ {_display_(Seq[Any](format.raw/*62.52*/("""selected="selected"""")))}),format.raw/*62.72*/(""">Dolores</option>
									<option """),_display_(/*63.19*/if(profile.county == "Douglas")/*63.50*/ {_display_(Seq[Any](format.raw/*63.52*/("""selected="selected"""")))}),format.raw/*63.72*/(""">Douglas</option>
									<option """),_display_(/*64.19*/if(profile.county == "Eagle")/*64.48*/ {_display_(Seq[Any](format.raw/*64.50*/("""selected="selected"""")))}),format.raw/*64.70*/(""">Eagle</option>
									<option """),_display_(/*65.19*/if(profile.county == "Elbert")/*65.49*/ {_display_(Seq[Any](format.raw/*65.51*/("""selected="selected"""")))}),format.raw/*65.71*/(""">Elbert</option>
									<option """),_display_(/*66.19*/if(profile.county == "El Paso")/*66.50*/ {_display_(Seq[Any](format.raw/*66.52*/("""selected="selected"""")))}),format.raw/*66.72*/(""">El Paso</option>
									<option """),_display_(/*67.19*/if(profile.county == "Fremont")/*67.50*/ {_display_(Seq[Any](format.raw/*67.52*/("""selected="selected"""")))}),format.raw/*67.72*/(""">Fremont</option>
									<option """),_display_(/*68.19*/if(profile.county == "Garfield")/*68.51*/ {_display_(Seq[Any](format.raw/*68.53*/("""selected="selected"""")))}),format.raw/*68.73*/(""">Garfield</option>
									<option """),_display_(/*69.19*/if(profile.county == "Gilpin")/*69.49*/ {_display_(Seq[Any](format.raw/*69.51*/("""selected="selected"""")))}),format.raw/*69.71*/(""">Gilpin</option>
									<option """),_display_(/*70.19*/if(profile.county == "Grand")/*70.48*/ {_display_(Seq[Any](format.raw/*70.50*/("""selected="selected"""")))}),format.raw/*70.70*/(""">Grand</option>
									<option """),_display_(/*71.19*/if(profile.county == "Gunnison")/*71.51*/ {_display_(Seq[Any](format.raw/*71.53*/("""selected="selected"""")))}),format.raw/*71.73*/(""">Gunnison</option>
									<option """),_display_(/*72.19*/if(profile.county == "Hinsdale")/*72.51*/ {_display_(Seq[Any](format.raw/*72.53*/("""selected="selected"""")))}),format.raw/*72.73*/(""">Hinsdale</option>
									<option """),_display_(/*73.19*/if(profile.county == "Huerfano")/*73.51*/ {_display_(Seq[Any](format.raw/*73.53*/("""selected="selected"""")))}),format.raw/*73.73*/(""">Huerfano</option>
									<option """),_display_(/*74.19*/if(profile.county == "Jackson")/*74.50*/ {_display_(Seq[Any](format.raw/*74.52*/("""selected="selected"""")))}),format.raw/*74.72*/(""">Jackson</option>
									<option """),_display_(/*75.19*/if(profile.county == "Jefferson")/*75.52*/ {_display_(Seq[Any](format.raw/*75.54*/("""selected="selected"""")))}),format.raw/*75.74*/(""">Jefferson</option>
									<option """),_display_(/*76.19*/if(profile.county == "Kiowa")/*76.48*/ {_display_(Seq[Any](format.raw/*76.50*/("""selected="selected"""")))}),format.raw/*76.70*/(""">Kiowa</option>
									<option """),_display_(/*77.19*/if(profile.county == "Kit Carson")/*77.53*/ {_display_(Seq[Any](format.raw/*77.55*/("""selected="selected"""")))}),format.raw/*77.75*/(""">Kit Carson</option>
									<option """),_display_(/*78.19*/if(profile.county == "Lake")/*78.47*/ {_display_(Seq[Any](format.raw/*78.49*/("""selected="selected"""")))}),format.raw/*78.69*/(""">Lake</option>
									<option """),_display_(/*79.19*/if(profile.county == "La Plata")/*79.51*/ {_display_(Seq[Any](format.raw/*79.53*/("""selected="selected"""")))}),format.raw/*79.73*/(""">La Plata</option>
									<option """),_display_(/*80.19*/if(profile.county == "Larimer")/*80.50*/ {_display_(Seq[Any](format.raw/*80.52*/("""selected="selected"""")))}),format.raw/*80.72*/(""">Larimer</option>
									<option """),_display_(/*81.19*/if(profile.county == "Las Animas")/*81.53*/ {_display_(Seq[Any](format.raw/*81.55*/("""selected="selected"""")))}),format.raw/*81.75*/(""">Las Animas</option>
									<option """),_display_(/*82.19*/if(profile.county == "Lincoln")/*82.50*/ {_display_(Seq[Any](format.raw/*82.52*/("""selected="selected"""")))}),format.raw/*82.72*/(""">Lincoln</option>
									<option """),_display_(/*83.19*/if(profile.county == "Logan")/*83.48*/ {_display_(Seq[Any](format.raw/*83.50*/("""selected="selected"""")))}),format.raw/*83.70*/(""">Logan</option>
									<option """),_display_(/*84.19*/if(profile.county == "Mesa")/*84.47*/ {_display_(Seq[Any](format.raw/*84.49*/("""selected="selected"""")))}),format.raw/*84.69*/(""">Mesa</option>
									<option """),_display_(/*85.19*/if(profile.county == "Mineral")/*85.50*/ {_display_(Seq[Any](format.raw/*85.52*/("""selected="selected"""")))}),format.raw/*85.72*/(""">Mineral</option>
									<option """),_display_(/*86.19*/if(profile.county == "Moffat")/*86.49*/ {_display_(Seq[Any](format.raw/*86.51*/("""selected="selected"""")))}),format.raw/*86.71*/(""">Moffat</option>
									<option """),_display_(/*87.19*/if(profile.county == "Montezuma")/*87.52*/ {_display_(Seq[Any](format.raw/*87.54*/("""selected="selected"""")))}),format.raw/*87.74*/(""">Montezuma</option>
									<option """),_display_(/*88.19*/if(profile.county == "Montrose")/*88.51*/ {_display_(Seq[Any](format.raw/*88.53*/("""selected="selected"""")))}),format.raw/*88.73*/(""">Montrose</option>
									<option """),_display_(/*89.19*/if(profile.county == "Morgan")/*89.49*/ {_display_(Seq[Any](format.raw/*89.51*/("""selected="selected"""")))}),format.raw/*89.71*/(""">Morgan</option>
									<option """),_display_(/*90.19*/if(profile.county == "Otero")/*90.48*/ {_display_(Seq[Any](format.raw/*90.50*/("""selected="selected"""")))}),format.raw/*90.70*/(""">Otero</option>
									<option """),_display_(/*91.19*/if(profile.county == "Ouray")/*91.48*/ {_display_(Seq[Any](format.raw/*91.50*/("""selected="selected"""")))}),format.raw/*91.70*/(""">Ouray</option>
									<option """),_display_(/*92.19*/if(profile.county == "Park")/*92.47*/ {_display_(Seq[Any](format.raw/*92.49*/("""selected="selected"""")))}),format.raw/*92.69*/(""">Park</option>
									<option """),_display_(/*93.19*/if(profile.county == "Phillips")/*93.51*/ {_display_(Seq[Any](format.raw/*93.53*/("""selected="selected"""")))}),format.raw/*93.73*/(""">Phillips</option>
									<option """),_display_(/*94.19*/if(profile.county == "Pitkin")/*94.49*/ {_display_(Seq[Any](format.raw/*94.51*/("""selected="selected"""")))}),format.raw/*94.71*/(""">Pitkin</option>
									<option """),_display_(/*95.19*/if(profile.county == "Prowers")/*95.50*/ {_display_(Seq[Any](format.raw/*95.52*/("""selected="selected"""")))}),format.raw/*95.72*/(""">Prowers</option>
									<option """),_display_(/*96.19*/if(profile.county == "Pueblo")/*96.49*/ {_display_(Seq[Any](format.raw/*96.51*/("""selected="selected"""")))}),format.raw/*96.71*/(""">Pueblo</option>
									<option """),_display_(/*97.19*/if(profile.county == "Rio Blanco")/*97.53*/ {_display_(Seq[Any](format.raw/*97.55*/("""selected="selected"""")))}),format.raw/*97.75*/(""">Rio Blanco</option>
									<option """),_display_(/*98.19*/if(profile.county == "Rio Grande")/*98.53*/ {_display_(Seq[Any](format.raw/*98.55*/("""selected="selected"""")))}),format.raw/*98.75*/(""">Rio Grande</option>
									<option """),_display_(/*99.19*/if(profile.county == "Routt")/*99.48*/ {_display_(Seq[Any](format.raw/*99.50*/("""selected="selected"""")))}),format.raw/*99.70*/(""">Routt</option>
									<option """),_display_(/*100.19*/if(profile.county == "Saguache")/*100.51*/ {_display_(Seq[Any](format.raw/*100.53*/("""selected="selected"""")))}),format.raw/*100.73*/(""">Saguache</option>
									<option """),_display_(/*101.19*/if(profile.county == "San Juan")/*101.51*/ {_display_(Seq[Any](format.raw/*101.53*/("""selected="selected"""")))}),format.raw/*101.73*/(""">San Juan</option>
									<option """),_display_(/*102.19*/if(profile.county == "San Miguel")/*102.53*/ {_display_(Seq[Any](format.raw/*102.55*/("""selected="selected"""")))}),format.raw/*102.75*/(""">San Miguel</option>
									<option """),_display_(/*103.19*/if(profile.county == "Sedgwick")/*103.51*/ {_display_(Seq[Any](format.raw/*103.53*/("""selected="selected"""")))}),format.raw/*103.73*/(""">Sedgwick</option>
									<option """),_display_(/*104.19*/if(profile.county == "Summit")/*104.49*/ {_display_(Seq[Any](format.raw/*104.51*/("""selected="selected"""")))}),format.raw/*104.71*/(""">Summit</option>
									<option """),_display_(/*105.19*/if(profile.county == "Teller")/*105.49*/ {_display_(Seq[Any](format.raw/*105.51*/("""selected="selected"""")))}),format.raw/*105.71*/(""">Teller</option>
									<option """),_display_(/*106.19*/if(profile.county == "Washington")/*106.53*/ {_display_(Seq[Any](format.raw/*106.55*/("""selected="selected"""")))}),format.raw/*106.75*/(""">Washington</option>
									<option """),_display_(/*107.19*/if(profile.county == "Weld")/*107.47*/ {_display_(Seq[Any](format.raw/*107.49*/("""selected="selected"""")))}),format.raw/*107.69*/(""">Weld</option>
									<option """),_display_(/*108.19*/if(profile.county == "Yuma")/*108.47*/ {_display_(Seq[Any](format.raw/*108.49*/("""selected="selected"""")))}),format.raw/*108.69*/(""">Yuma</option>
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
						placeholder="Billing Name..." value=""""),_display_(/*123.45*/profile/*123.52*/.billname),format.raw/*123.61*/("""" /><span class="icon-place"></span>
				</div>
			</div>
			<div class="element-address">
				<label class="title"><span class="required">*</span>Billing Address:</label><span class="addr1"><input placeholder="Street Address" type="text" name="billaddress" required="required" value=""""),_display_(/*127.196*/profile/*127.203*/.billaddress),format.raw/*127.215*/("""" /><span class="icon-place"></span></span><span class="addr2"><input placeholder="Address Line 2" type="text" name="billaddress1" value=""""),_display_(/*127.354*/profile/*127.361*/.billaddress1),format.raw/*127.374*/("""" /><span class="icon-place"></span></span><span class="city"><input placeholder="City" type="text" name="billcity" value=""""),_display_(/*127.498*/profile/*127.505*/.billcity),format.raw/*127.514*/("""" /><span class="icon-place"></span></span><span class="state"><input placeholder="State / Province / Region" type="text" name="billstate" required="required" value=""""),_display_(/*127.681*/profile/*127.688*/.billstate),format.raw/*127.698*/("""" /><span class="icon-place"></span></span><span class="zip"><input placeholder="Postal / Zip Code" type="text" maxlength="15" name="billzip" required="required" value=""""),_display_(/*127.868*/profile/*127.875*/.billzip),format.raw/*127.883*/("""" /><span class="icon-place"></span></span><div class="country">
					<select name="billcountry" required="required">
						"""),_display_(/*129.8*/if(profile.billcountry != "United States")/*129.50*/ {_display_(Seq[Any](format.raw/*129.52*/("""
							"""),format.raw/*130.8*/("""<option value="United States">United States</option>
							<option selected="selected" value="Canada">Canada</option>
						""")))}),format.raw/*132.8*/("""
						"""),format.raw/*133.7*/("""else """),format.raw/*133.12*/("""{"""),format.raw/*133.13*/("""
							"""),format.raw/*134.8*/("""<option selected="selected" value="United States">United States</option>
							<option value="Canada">Canada</option>
						"""),format.raw/*136.7*/("""}"""),format.raw/*136.8*/("""
					"""),format.raw/*137.6*/("""</select>
					<i></i><span class="icon-place"></span>
				</div>
			</div>
			
		<hr style="border-color:#34495E;border-width: 3px;">
			
			<div class="element-name">
				<label class="title" style="font-weight:bold"><span class="required">*</span>Business Hours Contact
				Name:</label><span class="nameFirst"><input
					placeholder="First Name..." type="text" size="8" name="primaryNameFirst"
					required="required" value=""""),_display_(/*148.34*/profile/*148.41*/.primaryNameFirst),format.raw/*148.58*/("""" /><span class="icon-place"></span></span><span
					class="nameLast"><input placeholder="Last Name..."
					type="text" size="14" name="primaryNameLast" required="required" value=""""),_display_(/*150.79*/profile/*150.86*/.primaryNameLast),format.raw/*150.102*/("""" /><span
					class="icon-place"></span></span>
			</div>
			<div class="element-phone">
				<label class="title"><span class="required">*</span>Business Hours Contact
				Phone Number:</label>
				<div class="item-cont">
					<input class="large" type="tel"
						oninvalid="this.setCustomValidity('Phone number must be entered in format ###-###-####')"
						oninput = "this.setCustomValidity('')" pattern="\d"""),format.raw/*159.57*/("""{"""),format.raw/*159.58*/("""3"""),format.raw/*159.59*/("""}"""),format.raw/*159.60*/("""[\-]\d"""),format.raw/*159.66*/("""{"""),format.raw/*159.67*/("""3"""),format.raw/*159.68*/("""}"""),format.raw/*159.69*/("""[\-]\d"""),format.raw/*159.75*/("""{"""),format.raw/*159.76*/("""4"""),format.raw/*159.77*/("""}"""),format.raw/*159.78*/("""" maxlength="24" name="primaryPhone"  						
						required="required" placeholder="Phone Number..." value=""""),_display_(/*160.65*/profile/*160.72*/.primaryPhone),format.raw/*160.85*/("""" /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-email">
				<label class="title"><span class="required">*</span>Business Hours Contact
				Email:</label>
				<div class="item-cont">
					<input class="large" type="email" name="primaryEmail" 
						required="required" placeholder="Email..." value=""""),_display_(/*169.58*/profile/*169.65*/.primaryEmail),format.raw/*169.78*/("""" /><span
						class="icon-place"></span>
				</div>
			</div>
			
		<hr style="border-color:#34495E;border-width: 3px;">
			
			<div class="element-name">
				<label class="title" style="font-weight:bold"><span class="required">*</span>After Hours Contact
				Name:</label><span class="nameFirst"><input
					placeholder="First Name..." type="text" size="8" name="secondaryNameFirst"
					required="required" value=""""),_display_(/*180.34*/profile/*180.41*/.secondaryNameFirst),format.raw/*180.60*/("""" /><span class="icon-place"></span></span><span
					class="nameLast"><input placeholder="Last Name..."
					type="text" size="14" name="secondaryNameLast" required="required" value=""""),_display_(/*182.81*/profile/*182.88*/.secondaryNameLast),format.raw/*182.106*/("""" /><span
					class="icon-place"></span></span>
			</div>
			<div class="element-phone">
				<label class="title"><span class="required">*</span>After Hours Contact
				Phone Number:</label>
				<div class="item-cont">
					<input class="large" type="tel"
						oninvalid="this.setCustomValidity('Phone number must be entered in format ###-###-####')"
						oninput = "this.setCustomValidity('')" pattern="\d"""),format.raw/*191.57*/("""{"""),format.raw/*191.58*/("""3"""),format.raw/*191.59*/("""}"""),format.raw/*191.60*/("""[\-]\d"""),format.raw/*191.66*/("""{"""),format.raw/*191.67*/("""3"""),format.raw/*191.68*/("""}"""),format.raw/*191.69*/("""[\-]\d"""),format.raw/*191.75*/("""{"""),format.raw/*191.76*/("""4"""),format.raw/*191.77*/("""}"""),format.raw/*191.78*/("""" maxlength="24" name="secondaryPhone" 
						required="required" placeholder="Phone Number..." value=""""),_display_(/*192.65*/profile/*192.72*/.secondaryPhone),format.raw/*192.87*/("""" /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-email">
				<label class="title"><span class="required">*</span>After Hours Contact
				Email:</label>
				<div class="item-cont">
					<input class="large" type="email" name="secondaryEmail" 
						required="required" placeholder="Email..." value=""""),_display_(/*201.58*/profile/*201.65*/.secondaryEmail),format.raw/*201.80*/("""" /><span
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
						oninput = "this.setCustomValidity('')" pattern="\d"""),format.raw/*222.57*/("""{"""),format.raw/*222.58*/("""3"""),format.raw/*222.59*/("""}"""),format.raw/*222.60*/("""[\-]\d"""),format.raw/*222.66*/("""{"""),format.raw/*222.67*/("""3"""),format.raw/*222.68*/("""}"""),format.raw/*222.69*/("""[\-]\d"""),format.raw/*222.75*/("""{"""),format.raw/*222.76*/("""4"""),format.raw/*222.77*/("""}"""),format.raw/*222.78*/("""" maxlength="24" name="secondaryPhone2"
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
				<label class="title">Services Provided:<span class="required">*</span></label>
				<div class="column column1">
					"""),_display_(/*243.7*/for(service <- servicesList) yield /*243.35*/ {_display_(Seq[Any](format.raw/*243.37*/("""
					"""),format.raw/*244.6*/("""<label>
					<input type="checkbox" """),_display_(/*245.30*/if(servicesSelected contains service.name)/*245.72*/ {_display_(Seq[Any](format.raw/*245.74*/("""checked""")))}),format.raw/*245.82*/(""" """),format.raw/*245.83*/("""class="selectServices" name="selectServices" id="selectServices" value=""""),_display_(/*245.156*/service/*245.163*/.name),format.raw/*245.168*/("""">
					<span>"""),_display_(/*246.13*/service/*246.20*/.name),format.raw/*246.25*/("""</span>
					</label>                    
					""")))}),format.raw/*248.7*/("""
				"""),format.raw/*249.5*/("""</div>
				<input type="hidden" name="services" id="services" value=""""),_display_(/*250.64*/profile/*250.71*/.services),format.raw/*250.80*/("""">
				<div id="otherService" class="element-input">
					<label class="title"><span class="required">*</span>Other:</label>
					<div class="item-cont">
						<input class="large" type="text" name="servicesOther" 
							placeholder="Other..." value=""""),_display_(/*255.39*/profile/*255.46*/.servicesOther),format.raw/*255.60*/("""" /><span class="icon-place"></span>
					</div>
				</div>
				<span class="clearfix"></span>
			</div>
			<div class="element-input">
				"""),_display_(/*261.6*/if(profileForm.hasGlobalErrors)/*261.37*/ {_display_(Seq[Any](format.raw/*261.39*/("""
					"""),format.raw/*262.6*/("""<span class="errorMessageDisplay" style="color: #d9534f;">"""),_display_(/*262.65*/profileForm/*262.76*/.globalError.message),format.raw/*262.96*/("""</span>
				""")))}),format.raw/*263.6*/("""
			"""),format.raw/*264.4*/("""</div>
			<div class="submit">
				<input type="submit" value="Submit" />
				<a href="/user" class="buttonCancel">"""),_display_(/*267.43*/Messages("goback")),format.raw/*267.61*/("""</a>
			</div>
			<div class="modifiedSection">
				<table class="modifiedTable">
					<tr>
						<td>Modified By:</td>
						<td>"""),_display_(/*273.12*/profile/*273.19*/.updatedBy),format.raw/*273.29*/("""</td>
					</tr>
					<tr>
						<td>Last Modified:</td>
						<td>"""),_display_(/*277.12*/profile/*277.19*/.dateUpdated),format.raw/*277.31*/("""</td>
					</tr>
				</table>
			</div>
			<!-- This is needed for bottom shadow to appear... -->
			<div></div>
		</form>
	</section>
""")))}))
      }
    }
  }

  def render(profileForm:Form[Application.ProfileRegister],servicesList:java.util.List[Service],profile:Profile,servicesSelected:java.util.List[String]): play.twirl.api.HtmlFormat.Appendable = apply(profileForm,servicesList,profile,servicesSelected)

  def f:((Form[Application.ProfileRegister],java.util.List[Service],Profile,java.util.List[String]) => play.twirl.api.HtmlFormat.Appendable) = (profileForm,servicesList,profile,servicesSelected) => apply(profileForm,servicesList,profile,servicesSelected)

  def ref: this.type = this

}


}

/**/
object editprofile extends editprofile_Scope0.editprofile
              /*
                  -- GENERATED --
                  DATE: Thu Jan 12 11:28:13 MST 2017
                  SOURCE: C:/WebDev/workspace/COAssist/app/views/profile/editprofile.scala.html
                  HASH: cbb8408a3f02f2eaa56404adff3b8600e39b7959
                  MATRIX: 847->1|1090->148|1120->153|1138->163|1177->165|1206->168|1295->230|1323->231|1356->238|1439->294|1467->295|1498->300|1599->374|1627->375|1659->381|1708->404|1735->405|1775->418|1803->419|1835->424|1863->425|2528->1063|2544->1070|2570->1075|2885->1362|2902->1369|2932->1377|3095->1512|3112->1519|3143->1528|3291->1648|3308->1655|3335->1660|3526->1823|3543->1830|3571->1836|3765->2002|3782->2009|3808->2013|4045->2223|4092->2261|4132->2263|4183->2283|4212->2284|4301->2346|4341->2377|4381->2379|4432->2399|4868->2808|4910->2841|4950->2843|5001->2863|5067->2902|5105->2931|5145->2933|5196->2953|5258->2988|5298->3019|5338->3021|5389->3041|5453->3078|5494->3110|5534->3112|5585->3132|5650->3170|5692->3203|5732->3205|5783->3225|5849->3264|5886->3292|5926->3294|5977->3314|6038->3348|6075->3376|6115->3378|6166->3398|6227->3432|6267->3463|6307->3465|6358->3485|6422->3522|6465->3556|6505->3558|6556->3578|6623->3618|6663->3649|6703->3651|6754->3671|6818->3708|6859->3740|6899->3742|6950->3762|7015->3800|7059->3835|7099->3837|7150->3857|7218->3898|7258->3929|7298->3931|7349->3951|7413->3988|7454->4020|7494->4022|7545->4042|7610->4080|7650->4111|7690->4113|7741->4133|7805->4170|7844->4200|7884->4202|7935->4222|7998->4258|8036->4287|8076->4289|8127->4309|8189->4344|8228->4374|8268->4376|8319->4396|8382->4432|8422->4463|8462->4465|8513->4485|8577->4522|8617->4553|8657->4555|8708->4575|8772->4612|8810->4641|8850->4643|8901->4663|8963->4698|9002->4728|9042->4730|9093->4750|9156->4786|9196->4817|9236->4819|9287->4839|9351->4876|9391->4907|9431->4909|9482->4929|9546->4966|9587->4998|9627->5000|9678->5020|9743->5058|9782->5088|9822->5090|9873->5110|9936->5146|9974->5175|10014->5177|10065->5197|10127->5232|10168->5264|10208->5266|10259->5286|10324->5324|10365->5356|10405->5358|10456->5378|10521->5416|10562->5448|10602->5450|10653->5470|10718->5508|10758->5539|10798->5541|10849->5561|10913->5598|10955->5631|10995->5633|11046->5653|11112->5692|11150->5721|11190->5723|11241->5743|11303->5778|11346->5812|11386->5814|11437->5834|11504->5874|11541->5902|11581->5904|11632->5924|11693->5958|11734->5990|11774->5992|11825->6012|11890->6050|11930->6081|11970->6083|12021->6103|12085->6140|12128->6174|12168->6176|12219->6196|12286->6236|12326->6267|12366->6269|12417->6289|12481->6326|12519->6355|12559->6357|12610->6377|12672->6412|12709->6440|12749->6442|12800->6462|12861->6496|12901->6527|12941->6529|12992->6549|13056->6586|13095->6616|13135->6618|13186->6638|13249->6674|13291->6707|13331->6709|13382->6729|13448->6768|13489->6800|13529->6802|13580->6822|13645->6860|13684->6890|13724->6892|13775->6912|13838->6948|13876->6977|13916->6979|13967->6999|14029->7034|14067->7063|14107->7065|14158->7085|14220->7120|14257->7148|14297->7150|14348->7170|14409->7204|14450->7236|14490->7238|14541->7258|14606->7296|14645->7326|14685->7328|14736->7348|14799->7384|14839->7415|14879->7417|14930->7437|14994->7474|15033->7504|15073->7506|15124->7526|15187->7562|15230->7596|15270->7598|15321->7618|15388->7658|15431->7692|15471->7694|15522->7714|15589->7754|15627->7783|15667->7785|15718->7805|15781->7840|15823->7872|15864->7874|15916->7894|15982->7932|16024->7964|16065->7966|16117->7986|16183->8024|16227->8058|16268->8060|16320->8080|16388->8120|16430->8152|16471->8154|16523->8174|16589->8212|16629->8242|16670->8244|16722->8264|16786->8300|16826->8330|16867->8332|16919->8352|16983->8388|17027->8422|17068->8424|17120->8444|17188->8484|17226->8512|17267->8514|17319->8534|17381->8568|17419->8596|17460->8598|17512->8618|18040->9118|18057->9125|18088->9134|18407->9424|18425->9431|18460->9443|18628->9582|18646->9589|18682->9602|18835->9726|18853->9733|18885->9742|19081->9909|19099->9916|19132->9926|19331->10096|19349->10103|19380->10111|19534->10238|19586->10280|19627->10282|19664->10291|19823->10419|19859->10427|19893->10432|19923->10433|19960->10442|20115->10569|20144->10570|20179->10577|20650->11020|20667->11027|20706->11044|20919->11229|20936->11236|20975->11252|21425->11673|21455->11674|21485->11675|21515->11676|21550->11682|21580->11683|21610->11684|21640->11685|21675->11691|21705->11692|21735->11693|21765->11694|21903->11804|21920->11811|21955->11824|22330->12171|22347->12178|22382->12191|22840->12621|22857->12628|22898->12647|23113->12834|23130->12841|23171->12859|23618->13277|23648->13278|23678->13279|23708->13280|23743->13286|23773->13287|23803->13288|23833->13289|23868->13295|23898->13296|23928->13297|23958->13298|24091->13403|24108->13410|24145->13425|24519->13771|24536->13778|24573->13793|25572->14763|25602->14764|25632->14765|25662->14766|25697->14772|25727->14773|25757->14774|25787->14775|25822->14781|25852->14782|25882->14783|25912->14784|26616->15461|26661->15489|26702->15491|26737->15498|26803->15536|26855->15578|26896->15580|26936->15588|26966->15589|27068->15662|27086->15669|27114->15674|27158->15690|27175->15697|27202->15702|27283->15752|27317->15758|27416->15829|27433->15836|27464->15845|27750->16103|27767->16110|27803->16124|27977->16271|28018->16302|28059->16304|28094->16311|28181->16370|28202->16381|28244->16401|28289->16415|28322->16420|28469->16539|28509->16557|28674->16694|28691->16701|28723->16711|28823->16783|28840->16790|28874->16802
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|40->9|41->10|41->10|42->11|42->11|56->25|56->25|56->25|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|63->32|63->32|63->32|63->32|63->32|64->33|64->33|64->33|64->33|75->44|75->44|75->44|75->44|76->45|76->45|76->45|76->45|77->46|77->46|77->46|77->46|78->47|78->47|78->47|78->47|79->48|79->48|79->48|79->48|80->49|80->49|80->49|80->49|81->50|81->50|81->50|81->50|82->51|82->51|82->51|82->51|83->52|83->52|83->52|83->52|84->53|84->53|84->53|84->53|85->54|85->54|85->54|85->54|86->55|86->55|86->55|86->55|87->56|87->56|87->56|87->56|88->57|88->57|88->57|88->57|89->58|89->58|89->58|89->58|90->59|90->59|90->59|90->59|91->60|91->60|91->60|91->60|92->61|92->61|92->61|92->61|93->62|93->62|93->62|93->62|94->63|94->63|94->63|94->63|95->64|95->64|95->64|95->64|96->65|96->65|96->65|96->65|97->66|97->66|97->66|97->66|98->67|98->67|98->67|98->67|99->68|99->68|99->68|99->68|100->69|100->69|100->69|100->69|101->70|101->70|101->70|101->70|102->71|102->71|102->71|102->71|103->72|103->72|103->72|103->72|104->73|104->73|104->73|104->73|105->74|105->74|105->74|105->74|106->75|106->75|106->75|106->75|107->76|107->76|107->76|107->76|108->77|108->77|108->77|108->77|109->78|109->78|109->78|109->78|110->79|110->79|110->79|110->79|111->80|111->80|111->80|111->80|112->81|112->81|112->81|112->81|113->82|113->82|113->82|113->82|114->83|114->83|114->83|114->83|115->84|115->84|115->84|115->84|116->85|116->85|116->85|116->85|117->86|117->86|117->86|117->86|118->87|118->87|118->87|118->87|119->88|119->88|119->88|119->88|120->89|120->89|120->89|120->89|121->90|121->90|121->90|121->90|122->91|122->91|122->91|122->91|123->92|123->92|123->92|123->92|124->93|124->93|124->93|124->93|125->94|125->94|125->94|125->94|126->95|126->95|126->95|126->95|127->96|127->96|127->96|127->96|128->97|128->97|128->97|128->97|129->98|129->98|129->98|129->98|130->99|130->99|130->99|130->99|131->100|131->100|131->100|131->100|132->101|132->101|132->101|132->101|133->102|133->102|133->102|133->102|134->103|134->103|134->103|134->103|135->104|135->104|135->104|135->104|136->105|136->105|136->105|136->105|137->106|137->106|137->106|137->106|138->107|138->107|138->107|138->107|139->108|139->108|139->108|139->108|154->123|154->123|154->123|158->127|158->127|158->127|158->127|158->127|158->127|158->127|158->127|158->127|158->127|158->127|158->127|158->127|158->127|158->127|160->129|160->129|160->129|161->130|163->132|164->133|164->133|164->133|165->134|167->136|167->136|168->137|179->148|179->148|179->148|181->150|181->150|181->150|190->159|190->159|190->159|190->159|190->159|190->159|190->159|190->159|190->159|190->159|190->159|190->159|191->160|191->160|191->160|200->169|200->169|200->169|211->180|211->180|211->180|213->182|213->182|213->182|222->191|222->191|222->191|222->191|222->191|222->191|222->191|222->191|222->191|222->191|222->191|222->191|223->192|223->192|223->192|232->201|232->201|232->201|253->222|253->222|253->222|253->222|253->222|253->222|253->222|253->222|253->222|253->222|253->222|253->222|274->243|274->243|274->243|275->244|276->245|276->245|276->245|276->245|276->245|276->245|276->245|276->245|277->246|277->246|277->246|279->248|280->249|281->250|281->250|281->250|286->255|286->255|286->255|292->261|292->261|292->261|293->262|293->262|293->262|293->262|294->263|295->264|298->267|298->267|304->273|304->273|304->273|308->277|308->277|308->277
                  -- GENERATED --
              */
          