
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object searchusers_Scope0 {
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

class searchusers extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userList: java.util.List[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""

	"""),format.raw/*5.2*/("""<script src=""""),_display_(/*5.16*/routes/*5.22*/.Assets.at("js/jquery/jquery-latest.js")),format.raw/*5.62*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*6.16*/routes/*6.22*/.Assets.at("js/jquery/jquery.tablesorter.js")),format.raw/*6.67*/("""" type="text/javascript"></script>
	<link href=""""),_display_(/*7.15*/routes/*7.21*/.Assets.at("css/tablesort.css")),format.raw/*7.52*/("""" rel="stylesheet" type="text/css" />
	<script type="text/javascript">
		$(document).ready(function() """),format.raw/*9.32*/("""{"""),format.raw/*9.33*/("""
			"""),format.raw/*10.4*/("""$("#tableEM").tablesorter();
		"""),format.raw/*11.3*/("""}"""),format.raw/*11.4*/(""");
		$(document).ready(function() """),format.raw/*12.32*/("""{"""),format.raw/*12.33*/("""
			"""),format.raw/*13.4*/("""$("#tableAll").tablesorter();
		"""),format.raw/*14.3*/("""}"""),format.raw/*14.4*/(""");
	</script>
	<section id="displayResults" style="padding: 30px;">
		<div class="table-responsive">
			<h5>Emergency Managers Needing Approval:</h5>
			<table id="tableEM" class="tablesorter" border="0" cellpadding="0" cellspacing="1">
				<thead>
					<tr>
						<th>User Name</th>
						<th>Email</th>
						<th>Role</th>
						<th>Approved?</th>
					</tr>
				</thead>
				<tbody>
					"""),_display_(/*29.7*/for(user <- userList
					if user.approved == "N") yield /*30.30*/{_display_(Seq[Any](format.raw/*30.31*/("""
					"""),format.raw/*31.6*/("""<tr>
						<td><a href="/finduserurl?email="""),_display_(/*32.40*/user/*32.44*/.getEmail()),format.raw/*32.55*/("""">"""),_display_(/*32.58*/user/*32.62*/.fullname),format.raw/*32.71*/("""</a></td>
						<td><a href="/finduserurl?email="""),_display_(/*33.40*/user/*33.44*/.getEmail()),format.raw/*33.55*/("""">"""),_display_(/*33.58*/user/*33.62*/.getEmail()),format.raw/*33.73*/("""</a></td>
						<td><a href="/finduserurl?email="""),_display_(/*34.40*/user/*34.44*/.getEmail()),format.raw/*34.55*/("""">"""),_display_(/*34.58*/user/*34.62*/.getRoleName(user.role).capitalize),format.raw/*34.96*/("""</a></td>
						<td><a href="/finduserurl?email="""),_display_(/*35.40*/user/*35.44*/.getEmail()),format.raw/*35.55*/("""">"""),_display_(/*35.58*/user/*35.62*/.approved),format.raw/*35.71*/("""</a></td>
					</tr>
					""")))}),format.raw/*37.7*/("""
				"""),format.raw/*38.5*/("""</tbody>
			</table>
		</div>
		
		<div><a href="/exportusers/EMNeedApproval" class="buttonCustomView" style="color: #FFFFFF;">Export This View</a></div>
		
		<br>
		
		<div class="table-responsive">
			<h5>All Users:</h5>
			<table id="tableAll" class="tablesorter" border="0" cellpadding="0" cellspacing="1">
				<thead>
					<tr>
						<th>User Name</th>
						<th>Email</th>
						<th>Role</th>
					</tr>
				</thead>
				<tbody>
					"""),_display_(/*57.7*/for(user <- userList) yield /*57.28*/ {_display_(Seq[Any](format.raw/*57.30*/("""
					"""),format.raw/*58.6*/("""<tr>
						<td><a href="/finduserurl?email="""),_display_(/*59.40*/user/*59.44*/.getEmail()),format.raw/*59.55*/("""">"""),_display_(/*59.58*/user/*59.62*/.fullname),format.raw/*59.71*/("""</a></td>
						<td><a href="/finduserurl?email="""),_display_(/*60.40*/user/*60.44*/.getEmail()),format.raw/*60.55*/("""">"""),_display_(/*60.58*/user/*60.62*/.getEmail()),format.raw/*60.73*/("""</a></td>
						<td><a href="/finduserurl?email="""),_display_(/*61.40*/user/*61.44*/.getEmail()),format.raw/*61.55*/("""">"""),_display_(/*61.58*/user/*61.62*/.getRoleName(user.role).capitalize),format.raw/*61.96*/("""</a></td>
					</tr>
					""")))}),format.raw/*63.7*/(""" 
				"""),format.raw/*64.5*/("""</tbody>
			</table>
		</div>
		<div><a href="/exportusers/All" class="buttonCustomView" style="color: #FFFFFF;">Export This View</a></div>
	</section>
""")))}))
      }
    }
  }

  def render(userList:java.util.List[User]): play.twirl.api.HtmlFormat.Appendable = apply(userList)

  def f:((java.util.List[User]) => play.twirl.api.HtmlFormat.Appendable) = (userList) => apply(userList)

  def ref: this.type = this

}


}

/**/
object searchusers extends searchusers_Scope0.searchusers
              /*
                  -- GENERATED --
                  DATE: Mon Jan 09 13:59:48 MST 2017
                  SOURCE: C:/WebDev/workspace/COAssist/app/views/admin/searchusers.scala.html
                  HASH: 4f1764597bf88ee0e965c6a52e3f5c9645750185
                  MATRIX: 777->1|904->33|934->38|952->48|991->50|1022->55|1062->69|1076->75|1136->115|1213->166|1227->172|1292->217|1368->267|1382->273|1433->304|1564->408|1592->409|1624->414|1683->446|1711->447|1774->482|1803->483|1835->488|1895->521|1923->522|2356->929|2423->980|2462->981|2496->988|2568->1033|2581->1037|2613->1048|2643->1051|2656->1055|2686->1064|2763->1114|2776->1118|2808->1129|2838->1132|2851->1136|2883->1147|2960->1197|2973->1201|3005->1212|3035->1215|3048->1219|3103->1253|3180->1303|3193->1307|3225->1318|3255->1321|3268->1325|3298->1334|3357->1363|3390->1369|3876->1829|3913->1850|3953->1852|3987->1859|4059->1904|4072->1908|4104->1919|4134->1922|4147->1926|4177->1935|4254->1985|4267->1989|4299->2000|4329->2003|4342->2007|4374->2018|4451->2068|4464->2072|4496->2083|4526->2086|4539->2090|4594->2124|4653->2153|4687->2160
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|40->9|40->9|41->10|42->11|42->11|43->12|43->12|44->13|45->14|45->14|60->29|61->30|61->30|62->31|63->32|63->32|63->32|63->32|63->32|63->32|64->33|64->33|64->33|64->33|64->33|64->33|65->34|65->34|65->34|65->34|65->34|65->34|66->35|66->35|66->35|66->35|66->35|66->35|68->37|69->38|88->57|88->57|88->57|89->58|90->59|90->59|90->59|90->59|90->59|90->59|91->60|91->60|91->60|91->60|91->60|91->60|92->61|92->61|92->61|92->61|92->61|92->61|94->63|95->64
                  -- GENERATED --
              */
          