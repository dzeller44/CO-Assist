
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
						"""),_display_(/*32.8*/if(profile.country != "United States")/*32.46*/ {_display_(Seq[Any](format.raw/*32.48*/("""
							"""),format.raw/*33.8*/("""<option value="United States">United States</option>
							<option selected="selected" value="Canada">Canada</option>
						""")))}),format.raw/*35.8*/("""
						"""),format.raw/*36.7*/("""else """),format.raw/*36.12*/("""{"""),format.raw/*36.13*/("""
							"""),format.raw/*37.8*/("""<option selected="selected" value="United States">United States</option>
							<option value="Canada">Canada</option>
						"""),format.raw/*39.7*/("""}"""),format.raw/*39.8*/("""
					"""),format.raw/*40.6*/("""</select>
					<i></i><span class="icon-place"></span>
				</div>
				<div class="element-select">
					<label class="title"></label>
					<div class="item-cont">
						<div class="large">
							<span>
								<select name="county" required="required">
									<option disabled="disabled">--- Select a county ---</option>
									<option """),_display_(/*50.19*/if(profile.county == "Statewide")/*50.52*/ {_display_(Seq[Any](format.raw/*50.54*/("""selected="selected"""")))}),format.raw/*50.74*/(""">Statewide</option>
									<option """),_display_(/*51.19*/if(profile.county == "Adams")/*51.48*/ {_display_(Seq[Any](format.raw/*51.50*/("""selected="selected"""")))}),format.raw/*51.70*/(""">Adams</option>
									<option """),_display_(/*52.19*/if(profile.county == "Alamosa")/*52.50*/ {_display_(Seq[Any](format.raw/*52.52*/("""selected="selected"""")))}),format.raw/*52.72*/(""">Alamosa</option>
									<option """),_display_(/*53.19*/if(profile.county == "Arapahoe")/*53.51*/ {_display_(Seq[Any](format.raw/*53.53*/("""selected="selected"""")))}),format.raw/*53.73*/(""">Arapahoe</option>
									<option """),_display_(/*54.19*/if(profile.county == "Archuleta")/*54.52*/ {_display_(Seq[Any](format.raw/*54.54*/("""selected="selected"""")))}),format.raw/*54.74*/(""">Archuleta</option>
									<option """),_display_(/*55.19*/if(profile.county == "Baca")/*55.47*/ {_display_(Seq[Any](format.raw/*55.49*/("""selected="selected"""")))}),format.raw/*55.69*/(""">Baca</option>
									<option """),_display_(/*56.19*/if(profile.county == "Bent")/*56.47*/ {_display_(Seq[Any](format.raw/*56.49*/("""selected="selected"""")))}),format.raw/*56.69*/(""">Bent</option>
									<option """),_display_(/*57.19*/if(profile.county == "Boulder")/*57.50*/ {_display_(Seq[Any](format.raw/*57.52*/("""selected="selected"""")))}),format.raw/*57.72*/(""">Boulder</option>
									<option """),_display_(/*58.19*/if(profile.county == "Broomfield")/*58.53*/ {_display_(Seq[Any](format.raw/*58.55*/("""selected="selected"""")))}),format.raw/*58.75*/(""">Broomfield</option>
									<option """),_display_(/*59.19*/if(profile.county == "Chaffee")/*59.50*/ {_display_(Seq[Any](format.raw/*59.52*/("""selected="selected"""")))}),format.raw/*59.72*/(""">Chaffee</option>
									<option """),_display_(/*60.19*/if(profile.county == "Cheyenne")/*60.51*/ {_display_(Seq[Any](format.raw/*60.53*/("""selected="selected"""")))}),format.raw/*60.73*/(""">Cheyenne</option>
									<option """),_display_(/*61.19*/if(profile.county == "Clear Creek")/*61.54*/ {_display_(Seq[Any](format.raw/*61.56*/("""selected="selected"""")))}),format.raw/*61.76*/(""">Clear Creek</option>
									<option """),_display_(/*62.19*/if(profile.county == "Conejos")/*62.50*/ {_display_(Seq[Any](format.raw/*62.52*/("""selected="selected"""")))}),format.raw/*62.72*/(""">Conejos</option>
									<option """),_display_(/*63.19*/if(profile.county == "Costilla")/*63.51*/ {_display_(Seq[Any](format.raw/*63.53*/("""selected="selected"""")))}),format.raw/*63.73*/(""">Costilla</option>
									<option """),_display_(/*64.19*/if(profile.county == "Crowley")/*64.50*/ {_display_(Seq[Any](format.raw/*64.52*/("""selected="selected"""")))}),format.raw/*64.72*/(""">Crowley</option>
									<option """),_display_(/*65.19*/if(profile.county == "Custer")/*65.49*/ {_display_(Seq[Any](format.raw/*65.51*/("""selected="selected"""")))}),format.raw/*65.71*/(""">Custer</option>
									<option """),_display_(/*66.19*/if(profile.county == "Delta")/*66.48*/ {_display_(Seq[Any](format.raw/*66.50*/("""selected="selected"""")))}),format.raw/*66.70*/(""">Delta</option>
									<option """),_display_(/*67.19*/if(profile.county == "Denver")/*67.49*/ {_display_(Seq[Any](format.raw/*67.51*/("""selected="selected"""")))}),format.raw/*67.71*/(""">Denver</option>
									<option """),_display_(/*68.19*/if(profile.county == "Dolores")/*68.50*/ {_display_(Seq[Any](format.raw/*68.52*/("""selected="selected"""")))}),format.raw/*68.72*/(""">Dolores</option>
									<option """),_display_(/*69.19*/if(profile.county == "Douglas")/*69.50*/ {_display_(Seq[Any](format.raw/*69.52*/("""selected="selected"""")))}),format.raw/*69.72*/(""">Douglas</option>
									<option """),_display_(/*70.19*/if(profile.county == "Eagle")/*70.48*/ {_display_(Seq[Any](format.raw/*70.50*/("""selected="selected"""")))}),format.raw/*70.70*/(""">Eagle</option>
									<option """),_display_(/*71.19*/if(profile.county == "Elbert")/*71.49*/ {_display_(Seq[Any](format.raw/*71.51*/("""selected="selected"""")))}),format.raw/*71.71*/(""">Elbert</option>
									<option """),_display_(/*72.19*/if(profile.county == "El Paso")/*72.50*/ {_display_(Seq[Any](format.raw/*72.52*/("""selected="selected"""")))}),format.raw/*72.72*/(""">El Paso</option>
									<option """),_display_(/*73.19*/if(profile.county == "Fremont")/*73.50*/ {_display_(Seq[Any](format.raw/*73.52*/("""selected="selected"""")))}),format.raw/*73.72*/(""">Fremont</option>
									<option """),_display_(/*74.19*/if(profile.county == "Garfield")/*74.51*/ {_display_(Seq[Any](format.raw/*74.53*/("""selected="selected"""")))}),format.raw/*74.73*/(""">Garfield</option>
									<option """),_display_(/*75.19*/if(profile.county == "Gilpin")/*75.49*/ {_display_(Seq[Any](format.raw/*75.51*/("""selected="selected"""")))}),format.raw/*75.71*/(""">Gilpin</option>
									<option """),_display_(/*76.19*/if(profile.county == "Grand")/*76.48*/ {_display_(Seq[Any](format.raw/*76.50*/("""selected="selected"""")))}),format.raw/*76.70*/(""">Grand</option>
									<option """),_display_(/*77.19*/if(profile.county == "Gunnison")/*77.51*/ {_display_(Seq[Any](format.raw/*77.53*/("""selected="selected"""")))}),format.raw/*77.73*/(""">Gunnison</option>
									<option """),_display_(/*78.19*/if(profile.county == "Hinsdale")/*78.51*/ {_display_(Seq[Any](format.raw/*78.53*/("""selected="selected"""")))}),format.raw/*78.73*/(""">Hinsdale</option>
									<option """),_display_(/*79.19*/if(profile.county == "Huerfano")/*79.51*/ {_display_(Seq[Any](format.raw/*79.53*/("""selected="selected"""")))}),format.raw/*79.73*/(""">Huerfano</option>
									<option """),_display_(/*80.19*/if(profile.county == "Jackson")/*80.50*/ {_display_(Seq[Any](format.raw/*80.52*/("""selected="selected"""")))}),format.raw/*80.72*/(""">Jackson</option>
									<option """),_display_(/*81.19*/if(profile.county == "Jefferson")/*81.52*/ {_display_(Seq[Any](format.raw/*81.54*/("""selected="selected"""")))}),format.raw/*81.74*/(""">Jefferson</option>
									<option """),_display_(/*82.19*/if(profile.county == "Kiowa")/*82.48*/ {_display_(Seq[Any](format.raw/*82.50*/("""selected="selected"""")))}),format.raw/*82.70*/(""">Kiowa</option>
									<option """),_display_(/*83.19*/if(profile.county == "Kit Carson")/*83.53*/ {_display_(Seq[Any](format.raw/*83.55*/("""selected="selected"""")))}),format.raw/*83.75*/(""">Kit Carson</option>
									<option """),_display_(/*84.19*/if(profile.county == "Lake")/*84.47*/ {_display_(Seq[Any](format.raw/*84.49*/("""selected="selected"""")))}),format.raw/*84.69*/(""">Lake</option>
									<option """),_display_(/*85.19*/if(profile.county == "La Plata")/*85.51*/ {_display_(Seq[Any](format.raw/*85.53*/("""selected="selected"""")))}),format.raw/*85.73*/(""">La Plata</option>
									<option """),_display_(/*86.19*/if(profile.county == "Larimer")/*86.50*/ {_display_(Seq[Any](format.raw/*86.52*/("""selected="selected"""")))}),format.raw/*86.72*/(""">Larimer</option>
									<option """),_display_(/*87.19*/if(profile.county == "Las Animas")/*87.53*/ {_display_(Seq[Any](format.raw/*87.55*/("""selected="selected"""")))}),format.raw/*87.75*/(""">Las Animas</option>
									<option """),_display_(/*88.19*/if(profile.county == "Lincoln")/*88.50*/ {_display_(Seq[Any](format.raw/*88.52*/("""selected="selected"""")))}),format.raw/*88.72*/(""">Lincoln</option>
									<option """),_display_(/*89.19*/if(profile.county == "Logan")/*89.48*/ {_display_(Seq[Any](format.raw/*89.50*/("""selected="selected"""")))}),format.raw/*89.70*/(""">Logan</option>
									<option """),_display_(/*90.19*/if(profile.county == "Mesa")/*90.47*/ {_display_(Seq[Any](format.raw/*90.49*/("""selected="selected"""")))}),format.raw/*90.69*/(""">Mesa</option>
									<option """),_display_(/*91.19*/if(profile.county == "Mineral")/*91.50*/ {_display_(Seq[Any](format.raw/*91.52*/("""selected="selected"""")))}),format.raw/*91.72*/(""">Mineral</option>
									<option """),_display_(/*92.19*/if(profile.county == "Moffat")/*92.49*/ {_display_(Seq[Any](format.raw/*92.51*/("""selected="selected"""")))}),format.raw/*92.71*/(""">Moffat</option>
									<option """),_display_(/*93.19*/if(profile.county == "Montezuma")/*93.52*/ {_display_(Seq[Any](format.raw/*93.54*/("""selected="selected"""")))}),format.raw/*93.74*/(""">Montezuma</option>
									<option """),_display_(/*94.19*/if(profile.county == "Montrose")/*94.51*/ {_display_(Seq[Any](format.raw/*94.53*/("""selected="selected"""")))}),format.raw/*94.73*/(""">Montrose</option>
									<option """),_display_(/*95.19*/if(profile.county == "Morgan")/*95.49*/ {_display_(Seq[Any](format.raw/*95.51*/("""selected="selected"""")))}),format.raw/*95.71*/(""">Morgan</option>
									<option """),_display_(/*96.19*/if(profile.county == "Otero")/*96.48*/ {_display_(Seq[Any](format.raw/*96.50*/("""selected="selected"""")))}),format.raw/*96.70*/(""">Otero</option>
									<option """),_display_(/*97.19*/if(profile.county == "Ouray")/*97.48*/ {_display_(Seq[Any](format.raw/*97.50*/("""selected="selected"""")))}),format.raw/*97.70*/(""">Ouray</option>
									<option """),_display_(/*98.19*/if(profile.county == "Park")/*98.47*/ {_display_(Seq[Any](format.raw/*98.49*/("""selected="selected"""")))}),format.raw/*98.69*/(""">Park</option>
									<option """),_display_(/*99.19*/if(profile.county == "Phillips")/*99.51*/ {_display_(Seq[Any](format.raw/*99.53*/("""selected="selected"""")))}),format.raw/*99.73*/(""">Phillips</option>
									<option """),_display_(/*100.19*/if(profile.county == "Pitkin")/*100.49*/ {_display_(Seq[Any](format.raw/*100.51*/("""selected="selected"""")))}),format.raw/*100.71*/(""">Pitkin</option>
									<option """),_display_(/*101.19*/if(profile.county == "Prowers")/*101.50*/ {_display_(Seq[Any](format.raw/*101.52*/("""selected="selected"""")))}),format.raw/*101.72*/(""">Prowers</option>
									<option """),_display_(/*102.19*/if(profile.county == "Pueblo")/*102.49*/ {_display_(Seq[Any](format.raw/*102.51*/("""selected="selected"""")))}),format.raw/*102.71*/(""">Pueblo</option>
									<option """),_display_(/*103.19*/if(profile.county == "Rio Blanco")/*103.53*/ {_display_(Seq[Any](format.raw/*103.55*/("""selected="selected"""")))}),format.raw/*103.75*/(""">Rio Blanco</option>
									<option """),_display_(/*104.19*/if(profile.county == "Rio Grande")/*104.53*/ {_display_(Seq[Any](format.raw/*104.55*/("""selected="selected"""")))}),format.raw/*104.75*/(""">Rio Grande</option>
									<option """),_display_(/*105.19*/if(profile.county == "Routt")/*105.48*/ {_display_(Seq[Any](format.raw/*105.50*/("""selected="selected"""")))}),format.raw/*105.70*/(""">Routt</option>
									<option """),_display_(/*106.19*/if(profile.county == "Saguache")/*106.51*/ {_display_(Seq[Any](format.raw/*106.53*/("""selected="selected"""")))}),format.raw/*106.73*/(""">Saguache</option>
									<option """),_display_(/*107.19*/if(profile.county == "San Juan")/*107.51*/ {_display_(Seq[Any](format.raw/*107.53*/("""selected="selected"""")))}),format.raw/*107.73*/(""">San Juan</option>
									<option """),_display_(/*108.19*/if(profile.county == "San Miguel")/*108.53*/ {_display_(Seq[Any](format.raw/*108.55*/("""selected="selected"""")))}),format.raw/*108.75*/(""">San Miguel</option>
									<option """),_display_(/*109.19*/if(profile.county == "Sedgwick")/*109.51*/ {_display_(Seq[Any](format.raw/*109.53*/("""selected="selected"""")))}),format.raw/*109.73*/(""">Sedgwick</option>
									<option """),_display_(/*110.19*/if(profile.county == "Summit")/*110.49*/ {_display_(Seq[Any](format.raw/*110.51*/("""selected="selected"""")))}),format.raw/*110.71*/(""">Summit</option>
									<option """),_display_(/*111.19*/if(profile.county == "Teller")/*111.49*/ {_display_(Seq[Any](format.raw/*111.51*/("""selected="selected"""")))}),format.raw/*111.71*/(""">Teller</option>
									<option """),_display_(/*112.19*/if(profile.county == "Washington")/*112.53*/ {_display_(Seq[Any](format.raw/*112.55*/("""selected="selected"""")))}),format.raw/*112.75*/(""">Washington</option>
									<option """),_display_(/*113.19*/if(profile.county == "Weld")/*113.47*/ {_display_(Seq[Any](format.raw/*113.49*/("""selected="selected"""")))}),format.raw/*113.69*/(""">Weld</option>
									<option """),_display_(/*114.19*/if(profile.county == "Yuma")/*114.47*/ {_display_(Seq[Any](format.raw/*114.49*/("""selected="selected"""")))}),format.raw/*114.69*/(""">Yuma</option>
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
						placeholder="Billing Name..." value=""""),_display_(/*129.45*/profile/*129.52*/.billname),format.raw/*129.61*/("""" /><span class="icon-place"></span>
				</div>
			</div>
			<div class="element-address">
				<label class="title"><span class="required">*</span>Billing Address:</label><span class="addr1"><input placeholder="Street Address" type="text" name="billaddress" required="required" value=""""),_display_(/*133.196*/profile/*133.203*/.billaddress),format.raw/*133.215*/("""" /><span class="icon-place"></span></span><span class="addr2"><input placeholder="Address Line 2" type="text" name="billaddress1" value=""""),_display_(/*133.354*/profile/*133.361*/.billaddress1),format.raw/*133.374*/("""" /><span class="icon-place"></span></span><span class="city"><input placeholder="City" type="text" name="billcity" value=""""),_display_(/*133.498*/profile/*133.505*/.billcity),format.raw/*133.514*/("""" /><span class="icon-place"></span></span><span class="state"><input placeholder="State / Province / Region" type="text" name="billstate" required="required" value=""""),_display_(/*133.681*/profile/*133.688*/.billstate),format.raw/*133.698*/("""" /><span class="icon-place"></span></span><span class="zip"><input placeholder="Postal / Zip Code" type="text" maxlength="15" name="billzip" required="required" value=""""),_display_(/*133.868*/profile/*133.875*/.billzip),format.raw/*133.883*/("""" /><span class="icon-place"></span></span><div class="country">
					<select name="billcountry" required="required">
						"""),_display_(/*135.8*/if(profile.billcountry != "United States")/*135.50*/ {_display_(Seq[Any](format.raw/*135.52*/("""
							"""),format.raw/*136.8*/("""<option value="United States">United States</option>
							<option selected="selected" value="Canada">Canada</option>
						""")))}),format.raw/*138.8*/("""
						"""),format.raw/*139.7*/("""else """),format.raw/*139.12*/("""{"""),format.raw/*139.13*/("""
							"""),format.raw/*140.8*/("""<option selected="selected" value="United States">United States</option>
							<option value="Canada">Canada</option>
						"""),format.raw/*142.7*/("""}"""),format.raw/*142.8*/("""
					"""),format.raw/*143.6*/("""</select>
					<i></i><span class="icon-place"></span>
				</div>
			</div>
			
		<hr style="border-color:#34495E;border-width: 3px;">
			
			<div class="element-name">
				<label class="title" style="font-weight:bold"><span class="required">*</span>Business Hours Contact
				Name:</label><span class="nameFirst"><input
					placeholder="First Name..." type="text" size="8" name="primaryNameFirst"
					required="required" value=""""),_display_(/*154.34*/profile/*154.41*/.primaryNameFirst),format.raw/*154.58*/("""" /><span class="icon-place"></span></span><span
					class="nameLast"><input placeholder="Last Name..."
					type="text" size="14" name="primaryNameLast" required="required" value=""""),_display_(/*156.79*/profile/*156.86*/.primaryNameLast),format.raw/*156.102*/("""" /><span
					class="icon-place"></span></span>
			</div>
			<div class="element-phone">
				<label class="title"><span class="required">*</span>Business Hours Contact
				Phone Number:</label>
				<div class="item-cont">
					<input class="large" type="tel"
						oninvalid="this.setCustomValidity('Phone number must be entered in format ###-###-####')"
						oninput = "this.setCustomValidity('')" pattern="\d"""),format.raw/*165.57*/("""{"""),format.raw/*165.58*/("""3"""),format.raw/*165.59*/("""}"""),format.raw/*165.60*/("""[\-]\d"""),format.raw/*165.66*/("""{"""),format.raw/*165.67*/("""3"""),format.raw/*165.68*/("""}"""),format.raw/*165.69*/("""[\-]\d"""),format.raw/*165.75*/("""{"""),format.raw/*165.76*/("""4"""),format.raw/*165.77*/("""}"""),format.raw/*165.78*/("""" maxlength="24" name="primaryPhone"  						
						required="required" placeholder="Phone Number..." value=""""),_display_(/*166.65*/profile/*166.72*/.primaryPhone),format.raw/*166.85*/("""" /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-email">
				<label class="title"><span class="required">*</span>Business Hours Contact
				Email:</label>
				<div class="item-cont">
					<input class="large" type="email" name="primaryEmail" 
						required="required" placeholder="Email..." value=""""),_display_(/*175.58*/profile/*175.65*/.primaryEmail),format.raw/*175.78*/("""" /><span
						class="icon-place"></span>
				</div>
			</div>
			
		<hr style="border-color:#34495E;border-width: 3px;">
			
			<div class="element-name">
				<label class="title" style="font-weight:bold"><span class="required">*</span>After Hours Contact
				Name:</label><span class="nameFirst"><input
					placeholder="First Name..." type="text" size="8" name="secondaryNameFirst"
					required="required" value=""""),_display_(/*186.34*/profile/*186.41*/.secondaryNameFirst),format.raw/*186.60*/("""" /><span class="icon-place"></span></span><span
					class="nameLast"><input placeholder="Last Name..."
					type="text" size="14" name="secondaryNameLast" required="required" value=""""),_display_(/*188.81*/profile/*188.88*/.secondaryNameLast),format.raw/*188.106*/("""" /><span
					class="icon-place"></span></span>
			</div>
			<div class="element-phone">
				<label class="title"><span class="required">*</span>After Hours Contact
				Phone Number:</label>
				<div class="item-cont">
					<input class="large" type="tel"
						oninvalid="this.setCustomValidity('Phone number must be entered in format ###-###-####')"
						oninput = "this.setCustomValidity('')" pattern="\d"""),format.raw/*197.57*/("""{"""),format.raw/*197.58*/("""3"""),format.raw/*197.59*/("""}"""),format.raw/*197.60*/("""[\-]\d"""),format.raw/*197.66*/("""{"""),format.raw/*197.67*/("""3"""),format.raw/*197.68*/("""}"""),format.raw/*197.69*/("""[\-]\d"""),format.raw/*197.75*/("""{"""),format.raw/*197.76*/("""4"""),format.raw/*197.77*/("""}"""),format.raw/*197.78*/("""" maxlength="24" name="secondaryPhone" 
						required="required" placeholder="Phone Number..." value=""""),_display_(/*198.65*/profile/*198.72*/.secondaryPhone),format.raw/*198.87*/("""" /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-email">
				<label class="title"><span class="required">*</span>After Hours Contact
				Email:</label>
				<div class="item-cont">
					<input class="large" type="email" name="secondaryEmail" 
						required="required" placeholder="Email..." value=""""),_display_(/*207.58*/profile/*207.65*/.secondaryEmail),format.raw/*207.80*/("""" /><span
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
						oninput = "this.setCustomValidity('')" pattern="\d"""),format.raw/*228.57*/("""{"""),format.raw/*228.58*/("""3"""),format.raw/*228.59*/("""}"""),format.raw/*228.60*/("""[\-]\d"""),format.raw/*228.66*/("""{"""),format.raw/*228.67*/("""3"""),format.raw/*228.68*/("""}"""),format.raw/*228.69*/("""[\-]\d"""),format.raw/*228.75*/("""{"""),format.raw/*228.76*/("""4"""),format.raw/*228.77*/("""}"""),format.raw/*228.78*/("""" maxlength="24" name="secondaryPhone2"
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
					"""),_display_(/*249.7*/for(service <- servicesList) yield /*249.35*/ {_display_(Seq[Any](format.raw/*249.37*/("""
					"""),format.raw/*250.6*/("""<label>
					<input type="checkbox" """),_display_(/*251.30*/if(servicesSelected contains service.name)/*251.72*/ {_display_(Seq[Any](format.raw/*251.74*/("""checked""")))}),format.raw/*251.82*/(""" """),format.raw/*251.83*/("""class="selectServices" name="selectServices" id="selectServices" value=""""),_display_(/*251.156*/service/*251.163*/.name),format.raw/*251.168*/("""">
					<span>"""),_display_(/*252.13*/service/*252.20*/.name),format.raw/*252.25*/("""</span>
					</label>                    
					""")))}),format.raw/*254.7*/("""
				"""),format.raw/*255.5*/("""</div>
				<input type="hidden" name="services" id="services" value=""""),_display_(/*256.64*/profile/*256.71*/.services),format.raw/*256.80*/("""">
				<div id="otherService" class="element-input">
					<label class="title"><span class="required">*</span>Other:</label>
					<div class="item-cont">
						<input class="large" type="text" name="servicesOther" 
							placeholder="Other..." value=""""),_display_(/*261.39*/profile/*261.46*/.servicesOther),format.raw/*261.60*/("""" /><span class="icon-place"></span>
					</div>
				</div>
				<span class="clearfix"></span>
			</div>
			<div class="element-input">
				"""),_display_(/*267.6*/if(profileForm.hasGlobalErrors)/*267.37*/ {_display_(Seq[Any](format.raw/*267.39*/("""
					"""),format.raw/*268.6*/("""<span class="errorMessageDisplay" style="color: #d9534f;">"""),_display_(/*268.65*/profileForm/*268.76*/.globalError.message),format.raw/*268.96*/("""</span>
				""")))}),format.raw/*269.6*/("""
			"""),format.raw/*270.4*/("""</div>
			<div class="submit">
				<input type="submit" value="Submit" />
				<a href="/user" class="buttonCancel">"""),_display_(/*273.43*/Messages("goback")),format.raw/*273.61*/("""</a>
			</div>
			<div class="modifiedSection">
				<table class="modifiedTable">
					<tr>
						<td>Modified By:</td>
						<td>"""),_display_(/*279.12*/profile/*279.19*/.updatedBy),format.raw/*279.29*/("""</td>
					</tr>
					<tr>
						<td>Last Modified:</td>
						<td>"""),_display_(/*283.12*/profile/*283.19*/.dateUpdated),format.raw/*283.31*/("""</td>
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
                  DATE: Wed Dec 21 10:41:45 MST 2016
                  SOURCE: C:/WebDev/workspace2/CO-Assist/app/views/profile/editprofile.scala.html
                  HASH: 5a802f6e497f725a5375edab3bf82cdd160c8bb6
                  MATRIX: 847->1|1090->148|1120->153|1138->163|1177->165|1206->168|1295->230|1323->231|1356->238|1439->294|1467->295|1498->300|1599->374|1627->375|1659->381|1708->404|1735->405|1775->418|1803->419|1835->424|1863->425|2528->1063|2544->1070|2570->1075|2885->1362|2902->1369|2932->1377|3095->1512|3112->1519|3143->1528|3291->1648|3308->1655|3335->1660|3526->1823|3543->1830|3571->1836|3765->2002|3782->2009|3808->2013|4035->2214|4082->2252|4122->2254|4158->2263|4316->2391|4351->2399|4384->2404|4413->2405|4449->2414|4603->2541|4631->2542|4665->2549|5044->2901|5086->2934|5126->2936|5177->2956|5243->2995|5281->3024|5321->3026|5372->3046|5434->3081|5474->3112|5514->3114|5565->3134|5629->3171|5670->3203|5710->3205|5761->3225|5826->3263|5868->3296|5908->3298|5959->3318|6025->3357|6062->3385|6102->3387|6153->3407|6214->3441|6251->3469|6291->3471|6342->3491|6403->3525|6443->3556|6483->3558|6534->3578|6598->3615|6641->3649|6681->3651|6732->3671|6799->3711|6839->3742|6879->3744|6930->3764|6994->3801|7035->3833|7075->3835|7126->3855|7191->3893|7235->3928|7275->3930|7326->3950|7394->3991|7434->4022|7474->4024|7525->4044|7589->4081|7630->4113|7670->4115|7721->4135|7786->4173|7826->4204|7866->4206|7917->4226|7981->4263|8020->4293|8060->4295|8111->4315|8174->4351|8212->4380|8252->4382|8303->4402|8365->4437|8404->4467|8444->4469|8495->4489|8558->4525|8598->4556|8638->4558|8689->4578|8753->4615|8793->4646|8833->4648|8884->4668|8948->4705|8986->4734|9026->4736|9077->4756|9139->4791|9178->4821|9218->4823|9269->4843|9332->4879|9372->4910|9412->4912|9463->4932|9527->4969|9567->5000|9607->5002|9658->5022|9722->5059|9763->5091|9803->5093|9854->5113|9919->5151|9958->5181|9998->5183|10049->5203|10112->5239|10150->5268|10190->5270|10241->5290|10303->5325|10344->5357|10384->5359|10435->5379|10500->5417|10541->5449|10581->5451|10632->5471|10697->5509|10738->5541|10778->5543|10829->5563|10894->5601|10934->5632|10974->5634|11025->5654|11089->5691|11131->5724|11171->5726|11222->5746|11288->5785|11326->5814|11366->5816|11417->5836|11479->5871|11522->5905|11562->5907|11613->5927|11680->5967|11717->5995|11757->5997|11808->6017|11869->6051|11910->6083|11950->6085|12001->6105|12066->6143|12106->6174|12146->6176|12197->6196|12261->6233|12304->6267|12344->6269|12395->6289|12462->6329|12502->6360|12542->6362|12593->6382|12657->6419|12695->6448|12735->6450|12786->6470|12848->6505|12885->6533|12925->6535|12976->6555|13037->6589|13077->6620|13117->6622|13168->6642|13232->6679|13271->6709|13311->6711|13362->6731|13425->6767|13467->6800|13507->6802|13558->6822|13624->6861|13665->6893|13705->6895|13756->6915|13821->6953|13860->6983|13900->6985|13951->7005|14014->7041|14052->7070|14092->7072|14143->7092|14205->7127|14243->7156|14283->7158|14334->7178|14396->7213|14433->7241|14473->7243|14524->7263|14585->7297|14626->7329|14666->7331|14717->7351|14783->7389|14823->7419|14864->7421|14916->7441|14980->7477|15021->7508|15062->7510|15114->7530|15179->7567|15219->7597|15260->7599|15312->7619|15376->7655|15420->7689|15461->7691|15513->7711|15581->7751|15625->7785|15666->7787|15718->7807|15786->7847|15825->7876|15866->7878|15918->7898|15981->7933|16023->7965|16064->7967|16116->7987|16182->8025|16224->8057|16265->8059|16317->8079|16383->8117|16427->8151|16468->8153|16520->8173|16588->8213|16630->8245|16671->8247|16723->8267|16789->8305|16829->8335|16870->8337|16922->8357|16986->8393|17026->8423|17067->8425|17119->8445|17183->8481|17227->8515|17268->8517|17320->8537|17388->8577|17426->8605|17467->8607|17519->8627|17581->8661|17619->8689|17660->8691|17712->8711|18240->9211|18257->9218|18288->9227|18607->9517|18625->9524|18660->9536|18828->9675|18846->9682|18882->9695|19035->9819|19053->9826|19085->9835|19281->10002|19299->10009|19332->10019|19531->10189|19549->10196|19580->10204|19734->10331|19786->10373|19827->10375|19864->10384|20023->10512|20059->10520|20093->10525|20123->10526|20160->10535|20315->10662|20344->10663|20379->10670|20850->11113|20867->11120|20906->11137|21119->11322|21136->11329|21175->11345|21625->11766|21655->11767|21685->11768|21715->11769|21750->11775|21780->11776|21810->11777|21840->11778|21875->11784|21905->11785|21935->11786|21965->11787|22103->11897|22120->11904|22155->11917|22530->12264|22547->12271|22582->12284|23040->12714|23057->12721|23098->12740|23313->12927|23330->12934|23371->12952|23818->13370|23848->13371|23878->13372|23908->13373|23943->13379|23973->13380|24003->13381|24033->13382|24068->13388|24098->13389|24128->13390|24158->13391|24291->13496|24308->13503|24345->13518|24719->13864|24736->13871|24773->13886|25772->14856|25802->14857|25832->14858|25862->14859|25897->14865|25927->14866|25957->14867|25987->14868|26022->14874|26052->14875|26082->14876|26112->14877|26816->15554|26861->15582|26902->15584|26937->15591|27003->15629|27055->15671|27096->15673|27136->15681|27166->15682|27268->15755|27286->15762|27314->15767|27358->15783|27375->15790|27402->15795|27483->15845|27517->15851|27616->15922|27633->15929|27664->15938|27950->16196|27967->16203|28003->16217|28177->16364|28218->16395|28259->16397|28294->16404|28381->16463|28402->16474|28444->16494|28489->16508|28522->16513|28669->16632|28709->16650|28874->16787|28891->16794|28923->16804|29023->16876|29040->16883|29074->16895
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|40->9|41->10|41->10|42->11|42->11|56->25|56->25|56->25|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|63->32|63->32|63->32|64->33|66->35|67->36|67->36|67->36|68->37|70->39|70->39|71->40|81->50|81->50|81->50|81->50|82->51|82->51|82->51|82->51|83->52|83->52|83->52|83->52|84->53|84->53|84->53|84->53|85->54|85->54|85->54|85->54|86->55|86->55|86->55|86->55|87->56|87->56|87->56|87->56|88->57|88->57|88->57|88->57|89->58|89->58|89->58|89->58|90->59|90->59|90->59|90->59|91->60|91->60|91->60|91->60|92->61|92->61|92->61|92->61|93->62|93->62|93->62|93->62|94->63|94->63|94->63|94->63|95->64|95->64|95->64|95->64|96->65|96->65|96->65|96->65|97->66|97->66|97->66|97->66|98->67|98->67|98->67|98->67|99->68|99->68|99->68|99->68|100->69|100->69|100->69|100->69|101->70|101->70|101->70|101->70|102->71|102->71|102->71|102->71|103->72|103->72|103->72|103->72|104->73|104->73|104->73|104->73|105->74|105->74|105->74|105->74|106->75|106->75|106->75|106->75|107->76|107->76|107->76|107->76|108->77|108->77|108->77|108->77|109->78|109->78|109->78|109->78|110->79|110->79|110->79|110->79|111->80|111->80|111->80|111->80|112->81|112->81|112->81|112->81|113->82|113->82|113->82|113->82|114->83|114->83|114->83|114->83|115->84|115->84|115->84|115->84|116->85|116->85|116->85|116->85|117->86|117->86|117->86|117->86|118->87|118->87|118->87|118->87|119->88|119->88|119->88|119->88|120->89|120->89|120->89|120->89|121->90|121->90|121->90|121->90|122->91|122->91|122->91|122->91|123->92|123->92|123->92|123->92|124->93|124->93|124->93|124->93|125->94|125->94|125->94|125->94|126->95|126->95|126->95|126->95|127->96|127->96|127->96|127->96|128->97|128->97|128->97|128->97|129->98|129->98|129->98|129->98|130->99|130->99|130->99|130->99|131->100|131->100|131->100|131->100|132->101|132->101|132->101|132->101|133->102|133->102|133->102|133->102|134->103|134->103|134->103|134->103|135->104|135->104|135->104|135->104|136->105|136->105|136->105|136->105|137->106|137->106|137->106|137->106|138->107|138->107|138->107|138->107|139->108|139->108|139->108|139->108|140->109|140->109|140->109|140->109|141->110|141->110|141->110|141->110|142->111|142->111|142->111|142->111|143->112|143->112|143->112|143->112|144->113|144->113|144->113|144->113|145->114|145->114|145->114|145->114|160->129|160->129|160->129|164->133|164->133|164->133|164->133|164->133|164->133|164->133|164->133|164->133|164->133|164->133|164->133|164->133|164->133|164->133|166->135|166->135|166->135|167->136|169->138|170->139|170->139|170->139|171->140|173->142|173->142|174->143|185->154|185->154|185->154|187->156|187->156|187->156|196->165|196->165|196->165|196->165|196->165|196->165|196->165|196->165|196->165|196->165|196->165|196->165|197->166|197->166|197->166|206->175|206->175|206->175|217->186|217->186|217->186|219->188|219->188|219->188|228->197|228->197|228->197|228->197|228->197|228->197|228->197|228->197|228->197|228->197|228->197|228->197|229->198|229->198|229->198|238->207|238->207|238->207|259->228|259->228|259->228|259->228|259->228|259->228|259->228|259->228|259->228|259->228|259->228|259->228|280->249|280->249|280->249|281->250|282->251|282->251|282->251|282->251|282->251|282->251|282->251|282->251|283->252|283->252|283->252|285->254|286->255|287->256|287->256|287->256|292->261|292->261|292->261|298->267|298->267|298->267|299->268|299->268|299->268|299->268|300->269|301->270|304->273|304->273|310->279|310->279|310->279|314->283|314->283|314->283
                  -- GENERATED --
              */
          