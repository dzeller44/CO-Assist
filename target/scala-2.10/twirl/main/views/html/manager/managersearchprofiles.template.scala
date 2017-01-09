
package views.html.manager

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object managersearchprofiles_Scope0 {
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

class managersearchprofiles extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[java.util.List[Profile],java.util.List[Service],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(profilesList: java.util.List[Profile], servicesList: java.util.List[Service], serviceOrCounty: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.105*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""

	"""),format.raw/*5.2*/("""<script src=""""),_display_(/*5.16*/routes/*5.22*/.Assets.at("js/jquery/jquery-latest.js")),format.raw/*5.62*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*6.16*/routes/*6.22*/.Assets.at("js/jquery/jquery.tablesorter.js")),format.raw/*6.67*/("""" type="text/javascript"></script>
	<link href=""""),_display_(/*7.15*/routes/*7.21*/.Assets.at("css/tablesort.css")),format.raw/*7.52*/("""" rel="stylesheet" type="text/css" />
	<script type="text/javascript">
		$(document).ready(function() """),format.raw/*9.32*/("""{"""),format.raw/*9.33*/("""
			"""),format.raw/*10.4*/("""$("#tableAll").tablesorter();
			$(".selectServices").change(function() """),format.raw/*11.43*/("""{"""),format.raw/*11.44*/("""
				"""),format.raw/*12.5*/("""getByServices();
			"""),format.raw/*13.4*/("""}"""),format.raw/*13.5*/(""");
			$(".selectCounty").change(function() """),format.raw/*14.41*/("""{"""),format.raw/*14.42*/("""
				"""),format.raw/*15.5*/("""getByCounty();
			"""),format.raw/*16.4*/("""}"""),format.raw/*16.5*/(""");
		"""),format.raw/*17.3*/("""}"""),format.raw/*17.4*/(""");
	</script>
	
	<section id="displayResults" style="padding: 30px;">
		<div class="table-responsive">
		<h5>Business Profiles: Showing: <span style="font-weight:bold">"""),_display_(/*22.67*/serviceOrCounty),format.raw/*22.82*/("""</span></h5>
		<div class="element-select">
			<div class="selectDropdownField">
				<div class="large">
					<span>
						<select class="selectServices" name="selectServices" id="selectServices">
							<option selected="selected" value="" disabled="disabled">--- Filter By Service ---</option>
							<option value="All">All</option>
							"""),_display_(/*30.9*/for(service <- servicesList) yield /*30.37*/ {_display_(Seq[Any](format.raw/*30.39*/("""
								"""),format.raw/*31.9*/("""<option value=""""),_display_(/*31.25*/service/*31.32*/.name),format.raw/*31.37*/("""">"""),_display_(/*31.40*/service/*31.47*/.name),format.raw/*31.52*/("""</option>
							""")))}),format.raw/*32.9*/("""
						"""),format.raw/*33.7*/("""</select>
						<i></i><span class="iconPlacement"></span>
					</span>
				</div>
			</div>
		</div>
		<div class="searchProfileText"> - OR - </div>
		<div class="element-select">
			<div class="selectDropdownField">
				<div class="large">
					<span>
						<select class="selectCounty" name="selectCounty" id="selectCounty">
							<option selected="selected" value="" disabled="disabled">--- Filter By County ---</option>
							<option value="All">All</option>
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
						<i></i><span class="iconPlacement"></span>
					</span>
				</div>
			</div>
		</div>
		<table id="tableAll" class="tablesorter" border="0" cellpadding="0" cellspacing="1">
			<thead>
				<tr>
					<th>Business Name</th>
					<th>Business Hours Contact</th>
					<th>Business Hours Phone</th>
					<th>After Hours Contact</th>
					<th>After Hours Phone</th>
					<th>Services</th>
					<th>County</th>
				</tr>
			</thead>
			<tbody>
				"""),_display_(/*131.6*/for(profile <- profilesList) yield /*131.34*/ {_display_(Seq[Any](format.raw/*131.36*/("""
				"""),format.raw/*132.5*/("""<tr>
					<td><a href="/viewProfileManager/"""),_display_(/*133.40*/profile/*133.47*/.profilekey),format.raw/*133.58*/("""">"""),_display_(/*133.61*/profile/*133.68*/.name),format.raw/*133.73*/("""</a></td>
 					<td><a href="/viewProfileManager/"""),_display_(/*134.41*/profile/*134.48*/.profilekey),format.raw/*134.59*/("""">"""),_display_(/*134.62*/profile/*134.69*/.primaryNameFirst),format.raw/*134.86*/(""" """),_display_(/*134.88*/profile/*134.95*/.primaryNameLast),format.raw/*134.111*/("""</a></td>
 					<td><a href="/viewProfileManager/"""),_display_(/*135.41*/profile/*135.48*/.profilekey),format.raw/*135.59*/("""">"""),_display_(/*135.62*/profile/*135.69*/.primaryPhone),format.raw/*135.82*/("""</a></td>
 					<td><a href="/viewProfileManager/"""),_display_(/*136.41*/profile/*136.48*/.profilekey),format.raw/*136.59*/("""">"""),_display_(/*136.62*/profile/*136.69*/.secondaryNameFirst),format.raw/*136.88*/(""" """),_display_(/*136.90*/profile/*136.97*/.secondaryNameLast),format.raw/*136.115*/("""</a></td>
 					<td><a href="/viewProfileManager/"""),_display_(/*137.41*/profile/*137.48*/.profilekey),format.raw/*137.59*/("""">"""),_display_(/*137.62*/profile/*137.69*/.secondaryPhone),format.raw/*137.84*/("""</a></td>
 					<td><a href="/viewProfileManager/"""),_display_(/*138.41*/profile/*138.48*/.profilekey),format.raw/*138.59*/("""">"""),_display_(/*138.62*/profile/*138.69*/.services),format.raw/*138.78*/("""</a></td>
 					<td><a href="/viewProfileManager/"""),_display_(/*139.41*/profile/*139.48*/.profilekey),format.raw/*139.59*/("""">"""),_display_(/*139.62*/profile/*139.69*/.county),format.raw/*139.76*/("""</a></td>
				</tr>
				""")))}),format.raw/*141.6*/(""" 
			"""),format.raw/*142.4*/("""</tbody>
		</table>
		</div>
		<div><a href="/exportprofiles/All" class="buttonCustomView" style="color: #FFFFFF;">Export All</a></div>	
	</section>
	
	
""")))}))
      }
    }
  }

  def render(profilesList:java.util.List[Profile],servicesList:java.util.List[Service],serviceOrCounty:String): play.twirl.api.HtmlFormat.Appendable = apply(profilesList,servicesList,serviceOrCounty)

  def f:((java.util.List[Profile],java.util.List[Service],String) => play.twirl.api.HtmlFormat.Appendable) = (profilesList,servicesList,serviceOrCounty) => apply(profilesList,servicesList,serviceOrCounty)

  def ref: this.type = this

}


}

/**/
object managersearchprofiles extends managersearchprofiles_Scope0.managersearchprofiles
              /*
                  -- GENERATED --
                  DATE: Mon Jan 09 13:59:48 MST 2017
                  SOURCE: C:/WebDev/workspace/COAssist/app/views/manager/managersearchprofiles.scala.html
                  HASH: e7f9d3b66d040798c4982e4b7e46e62b99d6730e
                  MATRIX: 833->1|1032->104|1062->109|1080->119|1119->121|1150->126|1190->140|1204->146|1264->186|1341->237|1355->243|1420->288|1496->338|1510->344|1561->375|1692->479|1720->480|1752->485|1853->558|1882->559|1915->565|1963->586|1991->587|2063->631|2092->632|2125->638|2171->657|2199->658|2232->664|2260->665|2461->839|2497->854|2875->1206|2919->1234|2959->1236|2996->1246|3039->1262|3055->1269|3081->1274|3111->1277|3127->1284|3153->1289|3202->1308|3237->1316|7405->5457|7450->5485|7491->5487|7525->5493|7598->5538|7615->5545|7648->5556|7679->5559|7696->5566|7723->5571|7802->5622|7819->5629|7852->5640|7883->5643|7900->5650|7939->5667|7969->5669|7986->5676|8025->5692|8104->5743|8121->5750|8154->5761|8185->5764|8202->5771|8237->5784|8316->5835|8333->5842|8366->5853|8397->5856|8414->5863|8455->5882|8485->5884|8502->5891|8543->5909|8622->5960|8639->5967|8672->5978|8703->5981|8720->5988|8757->6003|8836->6054|8853->6061|8886->6072|8917->6075|8934->6082|8965->6091|9044->6142|9061->6149|9094->6160|9125->6163|9142->6170|9171->6177|9229->6204|9263->6210
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|40->9|40->9|41->10|42->11|42->11|43->12|44->13|44->13|45->14|45->14|46->15|47->16|47->16|48->17|48->17|53->22|53->22|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|62->31|62->31|63->32|64->33|162->131|162->131|162->131|163->132|164->133|164->133|164->133|164->133|164->133|164->133|165->134|165->134|165->134|165->134|165->134|165->134|165->134|165->134|165->134|166->135|166->135|166->135|166->135|166->135|166->135|167->136|167->136|167->136|167->136|167->136|167->136|167->136|167->136|167->136|168->137|168->137|168->137|168->137|168->137|168->137|169->138|169->138|169->138|169->138|169->138|169->138|170->139|170->139|170->139|170->139|170->139|170->139|172->141|173->142
                  -- GENERATED --
              */
          