
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object searchprofiles_Scope0 {
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

class searchprofiles extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[java.util.List[Profile],java.util.List[Service],String,play.twirl.api.HtmlFormat.Appendable] {

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
		<h5>Business Profiles: Showing: <span style="font-weight:bold">"""),_display_(/*21.67*/serviceOrCounty),format.raw/*21.82*/("""</span></h5>
		<div class="element-select">
			<div class="selectDropdownField">
				<div class="large">
					<span>
						<select class="selectServices" name="selectServices" id="selectServices">
							<option selected="selected" value="" disabled="disabled">--- Filter By Service ---</option>
							<option value="All">All</option>
							"""),_display_(/*29.9*/for(service <- servicesList) yield /*29.37*/ {_display_(Seq[Any](format.raw/*29.39*/("""
								"""),format.raw/*30.9*/("""<option value=""""),_display_(/*30.25*/service/*30.32*/.name),format.raw/*30.37*/("""">"""),_display_(/*30.40*/service/*30.47*/.name),format.raw/*30.52*/("""</option>
							""")))}),format.raw/*31.9*/("""
						"""),format.raw/*32.7*/("""</select>
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
				"""),_display_(/*130.6*/for(profile <- profilesList) yield /*130.34*/ {_display_(Seq[Any](format.raw/*130.36*/("""
				"""),format.raw/*131.5*/("""<tr>
					<td><a href="/editprofile/"""),_display_(/*132.33*/profile/*132.40*/.profilekey),format.raw/*132.51*/("""">"""),_display_(/*132.54*/profile/*132.61*/.name),format.raw/*132.66*/("""</a></td>
 					<td><a href="/editprofile/"""),_display_(/*133.34*/profile/*133.41*/.profilekey),format.raw/*133.52*/("""">"""),_display_(/*133.55*/profile/*133.62*/.primaryNameFirst),format.raw/*133.79*/(""" """),_display_(/*133.81*/profile/*133.88*/.primaryNameLast),format.raw/*133.104*/("""</a></td>
 					<td><a href="/editprofile/"""),_display_(/*134.34*/profile/*134.41*/.profilekey),format.raw/*134.52*/("""">"""),_display_(/*134.55*/profile/*134.62*/.primaryPhone),format.raw/*134.75*/("""</a></td>
 					<td><a href="/editprofile/"""),_display_(/*135.34*/profile/*135.41*/.profilekey),format.raw/*135.52*/("""">"""),_display_(/*135.55*/profile/*135.62*/.secondaryNameFirst),format.raw/*135.81*/(""" """),_display_(/*135.83*/profile/*135.90*/.secondaryNameLast),format.raw/*135.108*/("""</a></td>
 					<td><a href="/editprofile/"""),_display_(/*136.34*/profile/*136.41*/.profilekey),format.raw/*136.52*/("""">"""),_display_(/*136.55*/profile/*136.62*/.secondaryPhone),format.raw/*136.77*/("""</a></td>
 					<td><a href="/editprofile/"""),_display_(/*137.34*/profile/*137.41*/.profilekey),format.raw/*137.52*/("""">"""),_display_(/*137.55*/profile/*137.62*/.services),format.raw/*137.71*/("""</a></td>
 					<td><a href="/editprofile/"""),_display_(/*138.34*/profile/*138.41*/.profilekey),format.raw/*138.52*/("""">"""),_display_(/*138.55*/profile/*138.62*/.county),format.raw/*138.69*/("""</a></td>
				</tr>
				""")))}),format.raw/*140.6*/(""" 
			"""),format.raw/*141.4*/("""</tbody>
		</table>
		</div>
		<div><a href="/exportprofiles/All" class="buttonCustomView" style="color: #FFFFFF;">Export All</a></div>	
		<div><a href="/exportprofiles/"""),_display_(/*145.34*/serviceOrCounty),format.raw/*145.49*/("""" class="buttonCustomView" style="color: #FFFFFF;">Export Current View</a></div>
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
object searchprofiles extends searchprofiles_Scope0.searchprofiles
              /*
                  -- GENERATED --
                  DATE: Tue Jan 03 14:50:30 MST 2017
                  SOURCE: C:/WebDev/workspace/COAssist/app/views/admin/searchprofiles.scala.html
                  HASH: d7ad19c99b896bc5d9039c7add81d69efe5183ce
                  MATRIX: 817->1|1016->104|1046->109|1064->119|1103->121|1134->126|1174->140|1188->146|1248->186|1325->237|1339->243|1404->288|1480->338|1494->344|1545->375|1676->479|1704->480|1736->485|1837->558|1866->559|1899->565|1947->586|1975->587|2047->631|2076->632|2109->638|2155->657|2183->658|2216->664|2244->665|2442->836|2478->851|2856->1203|2900->1231|2940->1233|2977->1243|3020->1259|3036->1266|3062->1271|3092->1274|3108->1281|3134->1286|3183->1305|3218->1313|7386->5454|7431->5482|7472->5484|7506->5490|7572->5528|7589->5535|7622->5546|7653->5549|7670->5556|7697->5561|7769->5605|7786->5612|7819->5623|7850->5626|7867->5633|7906->5650|7936->5652|7953->5659|7992->5675|8064->5719|8081->5726|8114->5737|8145->5740|8162->5747|8197->5760|8269->5804|8286->5811|8319->5822|8350->5825|8367->5832|8408->5851|8438->5853|8455->5860|8496->5878|8568->5922|8585->5929|8618->5940|8649->5943|8666->5950|8703->5965|8775->6009|8792->6016|8825->6027|8856->6030|8873->6037|8904->6046|8976->6090|8993->6097|9026->6108|9057->6111|9074->6118|9103->6125|9161->6152|9195->6158|9397->6332|9434->6347
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|40->9|40->9|41->10|42->11|42->11|43->12|44->13|44->13|45->14|45->14|46->15|47->16|47->16|48->17|48->17|52->21|52->21|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|62->31|63->32|161->130|161->130|161->130|162->131|163->132|163->132|163->132|163->132|163->132|163->132|164->133|164->133|164->133|164->133|164->133|164->133|164->133|164->133|164->133|165->134|165->134|165->134|165->134|165->134|165->134|166->135|166->135|166->135|166->135|166->135|166->135|166->135|166->135|166->135|167->136|167->136|167->136|167->136|167->136|167->136|168->137|168->137|168->137|168->137|168->137|168->137|169->138|169->138|169->138|169->138|169->138|169->138|171->140|172->141|176->145|176->145
                  -- GENERATED --
              */
          