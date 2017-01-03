
package views.html.manager

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object showprofile_Scope0 {
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

class showprofile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[Application.ProfileRegister],java.util.List[Service],Profile,java.util.List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(profileForm: Form[Application.ProfileRegister], servicesList: java.util.List[Service], profile: Profile, servicesSelected: java.util.List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.149*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""
	"""),format.raw/*4.2*/("""<script type="text/javascript">
		$(document).ready(function()"""),format.raw/*5.31*/("""{"""),format.raw/*5.32*/("""		 
			"""),format.raw/*6.4*/("""$('input readonly[name=selectServices]').on('change', function() """),format.raw/*6.69*/("""{"""),format.raw/*6.70*/("""
				"""),format.raw/*7.5*/("""$('#services').val($('input readonly[name=selectServices]:checked').map(function() """),format.raw/*7.88*/("""{"""),format.raw/*7.89*/("""
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
			<div class="element-input readonly">
				<label class="title" style="font-weight:bold"><span class="required">*</span>Business
				Name:</label>
				<div class="item-cont">
					<input readonly readonly class="large" type="text" name="name" required="required"
						placeholder="Business Name..." value=""""),_display_(/*25.46*/profile/*25.53*/.name),format.raw/*25.58*/("""" /><span class="icon-place"></span>
				</div>
			</div>
			<div class="element-address">
				<label class="title"><span class="required">*</span>Business Address:</label><span class="addr1"><input readonly placeholder="Street Address" type="text" name="address" required="required" value=""""),_display_(/*29.202*/profile/*29.209*/.address),format.raw/*29.217*/("""" /><span class="icon-place"></span></span><span class="addr2"><input readonly placeholder="Address Line 2" type="text" name="address1" value=""""),_display_(/*29.361*/profile/*29.368*/.address1),format.raw/*29.377*/("""" /><span class="icon-place"></span></span><span class="city"><input readonly placeholder="City" type="text" name="city" value=""""),_display_(/*29.506*/profile/*29.513*/.city),format.raw/*29.518*/("""" /><span class="icon-place"></span></span><span class="state"><input readonly placeholder="State / Province / Region" type="text" name="state" required="required" value=""""),_display_(/*29.690*/profile/*29.697*/.state),format.raw/*29.703*/("""" /><span class="icon-place"></span></span><span class="zip"><input readonly placeholder="Postal / Zip Code" type="text" maxlength="15" name="zip" required="required" value=""""),_display_(/*29.878*/profile/*29.885*/.zip),format.raw/*29.889*/("""" /><span class="icon-place"></span></span><div class="country">
					<span>
						Country: """),_display_(/*31.17*/profile/*31.24*/.country),format.raw/*31.32*/("""
					"""),format.raw/*32.6*/("""</span>
				</div>
				<div class="element-select">
					<label class="title"></label>
					<div class="item-cont">
						<div class="large">
							<span>
								County: """),_display_(/*39.18*/profile/*39.25*/.county),format.raw/*39.32*/("""
							"""),format.raw/*40.8*/("""</span>
						</div>
					</div>
				</div>
			</div>
			
		<hr style="border-color:#34495E;border-width: 3px;">	
			
			<div class="element-input readonly">
				<label class="title" style="font-weight:bold"><span class="required">*</span>Billing Name:</label>
				<div class="item-cont">
					<input readonly class="large" type="text" name="billname" required="required"
						placeholder="Billing Name..." value=""""),_display_(/*52.45*/profile/*52.52*/.billname),format.raw/*52.61*/("""" /><span class="icon-place"></span>
				</div>
			</div>
			<div class="element-address">
				<label class="title"><span class="required">*</span>Billing Address:</label><span class="addr1"><input readonly placeholder="Street Address" type="text" name="billaddress" required="required" value=""""),_display_(/*56.205*/profile/*56.212*/.billaddress),format.raw/*56.224*/("""" /><span class="icon-place"></span></span><span class="addr2"><input readonly placeholder="Address Line 2" type="text" name="billaddress1" value=""""),_display_(/*56.372*/profile/*56.379*/.billaddress1),format.raw/*56.392*/("""" /><span class="icon-place"></span></span><span class="city"><input readonly placeholder="City" type="text" name="billcity" value=""""),_display_(/*56.525*/profile/*56.532*/.billcity),format.raw/*56.541*/("""" /><span class="icon-place"></span></span><span class="state"><input readonly placeholder="State / Province / Region" type="text" name="billstate" required="required" value=""""),_display_(/*56.717*/profile/*56.724*/.billstate),format.raw/*56.734*/("""" /><span class="icon-place"></span></span><span class="zip"><input readonly placeholder="Postal / Zip Code" type="text" maxlength="15" name="billzip" required="required" value=""""),_display_(/*56.913*/profile/*56.920*/.billzip),format.raw/*56.928*/("""" /><span class="icon-place"></span></span><div class="country">
					<select name="billcountry" required="required">
						"""),_display_(/*58.8*/if(profile.billcountry != "United States")/*58.50*/ {_display_(Seq[Any](format.raw/*58.52*/("""
							"""),format.raw/*59.8*/("""<option value="United States">United States</option>
							<option selected="selected" value="Canada">Canada</option>
						""")))}),format.raw/*61.8*/("""
						"""),format.raw/*62.7*/("""else """),format.raw/*62.12*/("""{"""),format.raw/*62.13*/("""
							"""),format.raw/*63.8*/("""<option selected="selected" value="United States">United States</option>
							<option value="Canada">Canada</option>
						"""),format.raw/*65.7*/("""}"""),format.raw/*65.8*/("""
					"""),format.raw/*66.6*/("""</select>
					<i></i><span class="icon-place"></span>
				</div>
			</div>
			
		<hr style="border-color:#34495E;border-width: 3px;">	
			
			<div class="element-name">
				<label class="title" style="font-weight:bold"><span class="required">*</span>Business Hours Contact
				Name:</label><span class="nameFirst"><input readonly
					placeholder="First Name..." type="text" size="8" name="primaryNameFirst"
					required="required" value=""""),_display_(/*77.34*/profile/*77.41*/.primaryNameFirst),format.raw/*77.58*/("""" /><span class="icon-place"></span></span><span
					class="nameLast"><input readonly placeholder="Last Name..."
					type="text" size="14" name="primaryNameLast" required="required" value=""""),_display_(/*79.79*/profile/*79.86*/.primaryNameLast),format.raw/*79.102*/("""" /><span
					class="icon-place"></span></span>
			</div>
			<div class="element-phone">
				<label class="title"><span class="required">*</span>Business Hours Contact
				Phone Number:</label>
				<div class="item-cont">
					<input readonly class="large" type="tel"
						oninvalid="this.setCustomValidity('Phone number must be entered in format ###-###-####')"
						oninput readonly = "this.setCustomValidity('')" pattern="\d"""),format.raw/*88.66*/("""{"""),format.raw/*88.67*/("""3"""),format.raw/*88.68*/("""}"""),format.raw/*88.69*/("""[\-]\d"""),format.raw/*88.75*/("""{"""),format.raw/*88.76*/("""3"""),format.raw/*88.77*/("""}"""),format.raw/*88.78*/("""[\-]\d"""),format.raw/*88.84*/("""{"""),format.raw/*88.85*/("""4"""),format.raw/*88.86*/("""}"""),format.raw/*88.87*/("""" maxlength="24" name="primaryPhone"  						
						required="required" placeholder="Phone Number..." value=""""),_display_(/*89.65*/profile/*89.72*/.primaryPhone),format.raw/*89.85*/("""" /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-email">
				<label class="title"><span class="required">*</span>Business Hours Contact
				Email:</label>
				<div class="item-cont">
					<input readonly class="large" type="email" name="primaryEmail" 
						required="required" placeholder="Email..." value=""""),_display_(/*98.58*/profile/*98.65*/.primaryEmail),format.raw/*98.78*/("""" /><span
						class="icon-place"></span>
				</div>
			</div>
			
		<hr style="border-color:#34495E;border-width: 3px;">	
			
			<div class="element-name">
				<label class="title" style="font-weight:bold"><span class="required">*</span>After Hours Contact
				Name:</label><span class="nameFirst"><input readonly
					placeholder="First Name..." type="text" size="8" name="secondaryNameFirst"
					required="required" value=""""),_display_(/*109.34*/profile/*109.41*/.secondaryNameFirst),format.raw/*109.60*/("""" /><span class="icon-place"></span></span><span
					class="nameLast"><input readonly placeholder="Last Name..."
					type="text" size="14" name="secondaryNameLast" required="required" value=""""),_display_(/*111.81*/profile/*111.88*/.secondaryNameLast),format.raw/*111.106*/("""" /><span
					class="icon-place"></span></span>
			</div>
			<div class="element-phone">
				<label class="title"><span class="required">*</span>After Hours Contact
				Phone Number:</label>
				<div class="item-cont">
					<input readonly class="large" type="tel"
						oninvalid="this.setCustomValidity('Phone number must be entered in format ###-###-####')"
						oninput readonly = "this.setCustomValidity('')" pattern="\d"""),format.raw/*120.66*/("""{"""),format.raw/*120.67*/("""3"""),format.raw/*120.68*/("""}"""),format.raw/*120.69*/("""[\-]\d"""),format.raw/*120.75*/("""{"""),format.raw/*120.76*/("""3"""),format.raw/*120.77*/("""}"""),format.raw/*120.78*/("""[\-]\d"""),format.raw/*120.84*/("""{"""),format.raw/*120.85*/("""4"""),format.raw/*120.86*/("""}"""),format.raw/*120.87*/("""" maxlength="24" name="secondaryPhone"
  						required="required" placeholder="Phone Number..." value=""""),_display_(/*121.67*/profile/*121.74*/.secondaryPhone),format.raw/*121.89*/("""" /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-email">
				<label class="title"><span class="required">*</span>After Hours Contact
				Email:</label>
				<div class="item-cont">
					<input readonly class="large" type="email" name="secondaryEmail" 
						required="required" placeholder="Email..." value=""""),_display_(/*130.58*/profile/*130.65*/.secondaryEmail),format.raw/*130.80*/("""" /><span
						class="icon-place"></span>
				</div>
			</div>
			
		<hr style="border-color:#34495E;border-width: 3px;">
			
			<div class="element-name">
				<label class="title" style="font-weight:bold">Secondary After Hours Contact
				Name <span  style="font-weight:normal">(optional)</span>:</label><span class="nameFirst"><input readonly
					 type="text" size="8" name="secondaryNameFirst2" /><span class="icon-place"></span></span><span
					class="nameLast"><input readonly 
					type="text" size="14" name="secondaryNameLast2" /><span
					class="icon-place"></span></span>
			</div>
			<div class="element-phone">
				<label class="title">After Hours Contact
				Phone Number:</label>
				<div class="item-cont">
					<input readonly class="large" type="tel" oninvalid="this.setCustomValidity('Phone number must be entered in format ###-###-####')"
						oninput readonly = "this.setCustomValidity('')" pattern="\d"""),format.raw/*150.66*/("""{"""),format.raw/*150.67*/("""3"""),format.raw/*150.68*/("""}"""),format.raw/*150.69*/("""[\-]\d"""),format.raw/*150.75*/("""{"""),format.raw/*150.76*/("""3"""),format.raw/*150.77*/("""}"""),format.raw/*150.78*/("""[\-]\d"""),format.raw/*150.84*/("""{"""),format.raw/*150.85*/("""4"""),format.raw/*150.86*/("""}"""),format.raw/*150.87*/("""" maxlength="24" name="secondaryPhone2"
						 value="" /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-email">
				<label class="title">After Hours Contact
				Email:</label>
				<div class="item-cont">
					<input readonly class="large" type="email" name="secondaryEmail2" value="" /><span
						class="icon-place"></span>
				</div>
			</div>
			
			
		<hr style="border-color:#34495E;border-width: 3px;">	
		
			<span style="font-weight:bold">&nbsp;&nbsp;&nbsp;Services Provided: </span><span>"""),_display_(/*167.86*/profile/*167.93*/.services),format.raw/*167.102*/("""</span><br />
			<span style="font-weight:bold">&nbsp;&nbsp;&nbsp;Other Services: </span><span>"""),_display_(/*168.83*/profile/*168.90*/.servicesOther),format.raw/*168.104*/("""</span>
			<br /><br />
			

			<div class="submit">
				<a href="/manager" class="buttonCancel">"""),_display_(/*173.46*/Messages("goback")),format.raw/*173.64*/("""</a>
			</div>

			<div class="modifiedSection">
				<table class="modifiedTable">
					<tr>
						<td>Modified By:</td>
						<td>"""),_display_(/*180.12*/profile/*180.19*/.updatedBy),format.raw/*180.29*/("""</td>
					</tr>
					<tr>
						<td>Last Modified:</td>
						<td>"""),_display_(/*184.12*/profile/*184.19*/.dateUpdated),format.raw/*184.31*/("""</td>
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
object showprofile extends showprofile_Scope0.showprofile
              /*
                  -- GENERATED --
                  DATE: Tue Jan 03 14:50:30 MST 2017
                  SOURCE: C:/WebDev/workspace/COAssist/app/views/manager/showprofile.scala.html
                  HASH: 8158988ea431252e94b86f1141dfc267ec369b30
                  MATRIX: 847->1|1090->148|1120->153|1138->163|1177->165|1206->168|1296->231|1324->232|1358->240|1450->305|1478->306|1510->312|1620->395|1648->396|1681->403|1731->427|1758->428|1799->442|1827->443|1860->449|1888->450|2580->1115|2596->1122|2622->1127|2946->1423|2963->1430|2993->1438|3165->1582|3182->1589|3213->1598|3370->1727|3387->1734|3414->1739|3614->1911|3631->1918|3659->1924|3862->2099|3879->2106|3905->2110|4027->2205|4043->2212|4072->2220|4106->2227|4313->2407|4329->2414|4357->2421|4393->2430|4848->2858|4864->2865|4894->2874|5221->3173|5238->3180|5272->3192|5448->3340|5465->3347|5500->3360|5661->3493|5678->3500|5709->3509|5913->3685|5930->3692|5962->3702|6169->3881|6186->3888|6216->3896|6369->4023|6420->4065|6460->4067|6496->4076|6654->4204|6689->4212|6722->4217|6751->4218|6787->4227|6941->4354|6969->4355|7003->4362|7483->4815|7499->4822|7537->4839|7758->5033|7774->5040|7812->5056|8279->5495|8308->5496|8337->5497|8366->5498|8400->5504|8429->5505|8458->5506|8487->5507|8521->5513|8550->5514|8579->5515|8608->5516|8745->5626|8761->5633|8795->5646|9178->6002|9194->6009|9228->6022|9696->6462|9713->6469|9754->6488|9978->6684|9995->6691|10036->6709|10501->7145|10531->7146|10561->7147|10591->7148|10626->7154|10656->7155|10686->7156|10716->7157|10751->7163|10781->7164|10811->7165|10841->7166|10975->7272|10992->7279|11029->7294|11412->7649|11429->7656|11466->7671|12442->8618|12472->8619|12502->8620|12532->8621|12567->8627|12597->8628|12627->8629|12657->8630|12692->8636|12722->8637|12752->8638|12782->8639|13362->9191|13379->9198|13411->9207|13536->9304|13553->9311|13590->9325|13721->9428|13761->9446|13928->9585|13945->9592|13977->9602|14077->9674|14094->9681|14128->9693
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|40->9|41->10|41->10|42->11|42->11|56->25|56->25|56->25|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|62->31|62->31|62->31|63->32|70->39|70->39|70->39|71->40|83->52|83->52|83->52|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|89->58|89->58|89->58|90->59|92->61|93->62|93->62|93->62|94->63|96->65|96->65|97->66|108->77|108->77|108->77|110->79|110->79|110->79|119->88|119->88|119->88|119->88|119->88|119->88|119->88|119->88|119->88|119->88|119->88|119->88|120->89|120->89|120->89|129->98|129->98|129->98|140->109|140->109|140->109|142->111|142->111|142->111|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|152->121|152->121|152->121|161->130|161->130|161->130|181->150|181->150|181->150|181->150|181->150|181->150|181->150|181->150|181->150|181->150|181->150|181->150|198->167|198->167|198->167|199->168|199->168|199->168|204->173|204->173|211->180|211->180|211->180|215->184|215->184|215->184
                  -- GENERATED --
              */
          