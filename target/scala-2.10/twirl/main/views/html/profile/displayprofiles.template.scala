
package views.html.profile

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object displayprofiles_Scope0 {
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

class displayprofiles extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[Profile],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(profilesList: java.util.List[Profile]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.41*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""

	"""),format.raw/*5.2*/("""<script src=""""),_display_(/*5.16*/routes/*5.22*/.Assets.at("js/jquery/jquery-latest.js")),format.raw/*5.62*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*6.16*/routes/*6.22*/.Assets.at("js/jquery/jquery.tablesorter.js")),format.raw/*6.67*/("""" type="text/javascript"></script>
	<link href=""""),_display_(/*7.15*/routes/*7.21*/.Assets.at("css/tablesort.css")),format.raw/*7.52*/("""" rel="stylesheet" type="text/css" />
	<script type="text/javascript">
		$(document).ready(function() """),format.raw/*9.32*/("""{"""),format.raw/*9.33*/("""
			"""),format.raw/*10.4*/("""$("#tableAll").tablesorter();
		"""),format.raw/*11.3*/("""}"""),format.raw/*11.4*/(""");
	</script>
	<section id="displayResults" style="padding: 30px;">
		<div class="table-responsive">
			<h5>All Business Profiles:</h5>
			<table id="tableAll" class="tablesorter" border="0" cellpadding="0" cellspacing="1">
				<thead>
					<tr>
						<th>Business Name</th>
						<th>Contact</th>
						<th>Services</th>
					</tr>
				</thead>
				<tbody>
					"""),_display_(/*25.7*/for(profile <- profilesList) yield /*25.35*/ {_display_(Seq[Any](format.raw/*25.37*/("""
					"""),format.raw/*26.6*/("""<tr>
						<td><a href="/openprofile/"""),_display_(/*27.34*/profile/*27.41*/.profilekey),format.raw/*27.52*/("""">"""),_display_(/*27.55*/profile/*27.62*/.name),format.raw/*27.67*/("""</a></td>
						<td><a href="/openprofile/"""),_display_(/*28.34*/profile/*28.41*/.profilekey),format.raw/*28.52*/("""">"""),_display_(/*28.55*/profile/*28.62*/.primaryNameFirst),format.raw/*28.79*/(""" """),_display_(/*28.81*/profile/*28.88*/.primaryNameLast),format.raw/*28.104*/("""</a></td>
						<td><a href="/openprofile/"""),_display_(/*29.34*/profile/*29.41*/.profilekey),format.raw/*29.52*/("""">"""),_display_(/*29.55*/profile/*29.62*/.services),format.raw/*29.71*/("""</a></td>
					</tr>
					""")))}),format.raw/*31.7*/(""" 
				"""),format.raw/*32.5*/("""</tbody>
			</table>
		</div>
		<div><a href="/exportprofiles/All" class="buttonCustomView" style="color: #FFFFFF;">Export This View</a></div>
	</section>
""")))}))
      }
    }
  }

  def render(profilesList:java.util.List[Profile]): play.twirl.api.HtmlFormat.Appendable = apply(profilesList)

  def f:((java.util.List[Profile]) => play.twirl.api.HtmlFormat.Appendable) = (profilesList) => apply(profilesList)

  def ref: this.type = this

}


}

/**/
object displayprofiles extends displayprofiles_Scope0.displayprofiles
              /*
                  -- GENERATED --
                  DATE: Mon Jan 09 13:59:49 MST 2017
                  SOURCE: C:/WebDev/workspace/COAssist/app/views/profile/displayprofiles.scala.html
                  HASH: 984ae2382e65ad53d1424848dde304609d005788
                  MATRIX: 790->1|924->40|954->45|972->55|1011->57|1042->62|1082->76|1096->82|1156->122|1233->173|1247->179|1312->224|1388->274|1402->280|1453->311|1584->415|1612->416|1644->421|1704->454|1732->455|2136->833|2180->861|2220->863|2254->870|2320->909|2336->916|2368->927|2398->930|2414->937|2440->942|2511->986|2527->993|2559->1004|2589->1007|2605->1014|2643->1031|2672->1033|2688->1040|2726->1056|2797->1100|2813->1107|2845->1118|2875->1121|2891->1128|2921->1137|2980->1166|3014->1173
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|40->9|40->9|41->10|42->11|42->11|56->25|56->25|56->25|57->26|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|62->31|63->32
                  -- GENERATED --
              */
          